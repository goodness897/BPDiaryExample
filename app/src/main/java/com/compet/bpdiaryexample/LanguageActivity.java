package com.compet.bpdiaryexample;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LanguageActivity extends BaseActivity {

    //    private MyListAdapter mAdapter;

    private MyListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);

        initToolbar("언어");
        String[] lan = getResources().getStringArray(R.array.language);
        mAdapter = new MyListAdapter(this, lan);

        ListView listView = (ListView)findViewById(R.id.listView);

        View v = new View(this);
        v.setBackgroundColor(Color.rgb(239, 235, 230));
        v.setLayoutParams(new AbsListView.LayoutParams(AbsListView.LayoutParams.MATCH_PARENT, 1));
        listView.addFooterView(v);

        listView.setAdapter(mAdapter);
        listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

            }
        });

    }

    public class MyListAdapter extends BaseAdapter {

        List<String> list = new ArrayList();

        String[] lan;

        public MyListAdapter(Context context, String[] lan) {
            this.lan = lan;
            list = Arrays.asList(lan);

        }

        public void add(String item) {
            list.add(item);
            notifyDataSetChanged();
        }

        public void addAll(String[] items) {
            list.addAll(Arrays.asList(items));
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
                convertView =
                            LayoutInflater.from(parent.getContext()).inflate(R.layout.view_lanuage_list, parent, false);
            }

            TextView titleView = (TextView)convertView.findViewById(R.id.text_language);
            ImageView imageView = (ImageView)convertView.findViewById(R.id.img_check);
            if (list.get(position).equals("한국어")) {
                imageView.setVisibility(View.VISIBLE);
            }
            titleView.setText(list.get(position));
            return convertView;
        }
    }
}
