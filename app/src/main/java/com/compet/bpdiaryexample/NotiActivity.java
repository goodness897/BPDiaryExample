package com.compet.bpdiaryexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;

public class NotiActivity extends AppCompatActivity {

    ExpandableListView listView;
    NotiAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noti);

        ImageView imageButton = (ImageView) findViewById(R.id.btn_navi_back);
        imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                finish();
            }
        });
        TextView titleView = (TextView) findViewById(R.id.toolbar_title);
        titleView.setText("공지사항");

        listView = (ExpandableListView) findViewById(R.id.listView);

        mAdapter = new NotiAdapter();
        listView.setAdapter(mAdapter);

        listView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int groupPosition) {

            }
        });

        listView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {
            @Override
            public void onGroupCollapse(int groupPosition) {

            }
        });

        initData();

        for (int i = 0; i < mAdapter.getGroupCount(); i++) {
            listView.expandGroup(i);
        }

    }

    private void initData() {
        mAdapter.put("S헬스 지원 기기가 추가되었습니다.", "2016.12.24", "검찰특별수사본부는 오늘 오전 9시부터 이화여자대학교에\n" +
                "대한 압수수색을 진행하고 있습니다. 이대 총장실과 입학처\n" +
                "등 사무실 20여 곳이 대상입니다. 또 오늘 압수 수색에는 최\n" +
                "경희 전 이대 총장의 자택 등 관련자들의 주거지 3곳도 포함\n" +
                "됐습니다. 지금도 압수수색이 진행되고 있는 겁니까?");
    }
}
