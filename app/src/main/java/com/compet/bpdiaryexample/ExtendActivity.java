package com.compet.bpdiaryexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.compet.bpdiaryexample.profile.ConnectDeviceActivity;
import com.compet.bpdiaryexample.profile.ExtendProfileActivity;

import java.util.ArrayList;
import java.util.List;

public class ExtendActivity extends AppCompatActivity {

    MyGridViewAdpater adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extend);

        adapter = new MyGridViewAdpater();
        GridView gridView = (GridView)findViewById(R.id.gridView);

        ImageView imageButton = (ImageView)findViewById(R.id.btn_navi_back);
        imageButton.setVisibility(View.GONE);

        RelativeLayout profileLayout = (RelativeLayout)findViewById(R.id.layout_profile);
        profileLayout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ExtendActivity.this, ExtendProfileActivity.class);
                startActivity(intent);

            }
        });
        adapter.add(new ExtendData(R.drawable.ic_ex_menu_set_bluetooth, "연동기기"));
        adapter.add(new ExtendData(R.drawable.ic_ex_menu_set_shop, "온라인샵"));
        adapter.add(new ExtendData(R.drawable.ic_ex_menu_set_noti, "공지사항"));
        adapter.add(new ExtendData(R.drawable.ic_ex_menu_set_target, "목표설정"));
        adapter.add(new ExtendData(R.drawable.ic_ex_menu_set_alarm, "알림설정"));
        adapter.add(new ExtendData(R.drawable.ic_ex_menu_lang, "언어"));

        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Intent intent;
                switch (position) {
                    case 0:
                        intent = new Intent(ExtendActivity.this, ConnectDeviceActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(ExtendActivity.this, OnlineShopActivity.class);
                        startActivity(intent);
                        break;

                    case 2:
                        intent = new Intent(ExtendActivity.this, NotiActivity.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(ExtendActivity.this, ConnectDeviceActivity.class);
                        startActivity(intent);
                        break;

                    case 4:
                        intent = new Intent(ExtendActivity.this, ConnectDeviceActivity.class);
                        startActivity(intent);
                        break;

                    case 5:
                        intent = new Intent(ExtendActivity.this, ConnectDeviceActivity.class);
                        startActivity(intent);
                        break;

                }

            }
        });

    }

    public class MyGridViewAdpater extends BaseAdapter {

        List<ExtendData> list = new ArrayList();

        public void add(ExtendData extendData) {
            list.add(extendData);
            notifyDataSetChanged();

        }

        @Override
        public int getCount() {
            return list.size();
        }

        @Override
        public Object getItem(int position) {
            return list.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if (convertView == null) {
                convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);

            }

            ExtendData extendData = list.get(position);

            TextView titleView = (TextView)convertView.findViewById(R.id.textView);
            ImageView imageView = (ImageView)convertView.findViewById(R.id.imageView);

            titleView.setText(extendData.getTitle());
            imageView.setImageDrawable(getDrawable(extendData.getResId()));

            return convertView;
        }
    }

    public class ExtendData {

        private int resId;

        private String title;

        public ExtendData(int resId, String title) {
            this.resId = resId;
            this.title = title;
        }

        public int getResId() {
            return resId;
        }

        public void setResId(int resId) {
            this.resId = resId;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
