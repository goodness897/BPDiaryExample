package com.compet.bpdiaryexample.profile;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.compet.bpdiaryexample.BaseActivity;
import com.compet.bpdiaryexample.R;
import com.compet.bpdiaryexample.UpdateHeightActivity;

import java.util.HashMap;
import java.util.Map;

public class ExtendProfileActivity extends BaseActivity {

    MyProfileListAdapter mAdapter;

    Map<String, String> map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extend_profile);
        initToolbar("프로필");
        String[] lan = getResources().getStringArray(R.array.profile);
        User user = new User("홍길동", "1983.08.31", "남자", 179, "", false, "test@google.com");

        map = new HashMap<>();
        map.put(lan[0], user.getName());
        map.put(lan[1], user.getBirthDate());
        map.put(lan[2], user.getGender());
        map.put(lan[3], String.valueOf(user.getHeight()));
        map.put(lan[4], user.getPassword());
        map.put(lan[5], "");
        map.put(lan[6], user.getAccountEmail());

        mAdapter = new MyProfileListAdapter(this, map, lan);
        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(mAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent;
                switch (position) {
                    case 0:
                        intent = new Intent(ExtendProfileActivity.this, NameActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(ExtendProfileActivity.this, BirthActivity.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(ExtendProfileActivity.this, GenderActivity.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(ExtendProfileActivity.this, UpdateHeightActivity.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(ExtendProfileActivity.this, ChangePasswordActivity.class);
                        startActivity(intent);
                        break;
                    case 5:
                        intent = new Intent(ExtendProfileActivity.this, ManageBloodSugarActivity.class);
                        startActivity(intent);
                        break;
                    case 6:
                        intent = new Intent(ExtendProfileActivity.this, AccountActivity.class);
                        startActivity(intent);
                        break;

                }
            }
        });

    }

    public class MyProfileListAdapter extends BaseAdapter {

        Map<String, String> list = new HashMap<>();

        String[] lan;

        public MyProfileListAdapter(Context context, Map<String, String> list, String[] lan) {
            this.list = list;
            this.lan = lan;
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
                            LayoutInflater.from(parent.getContext()).inflate(R.layout.view_profile_list, parent, false);
            }

            TextView titleView = (TextView)convertView.findViewById(R.id.list_title);
            TextView userView = (TextView)convertView.findViewById(R.id.text_user_info);
            ImageView googleView = (ImageView)convertView.findViewById(R.id.img_google);
            googleView.setVisibility(View.GONE);
            titleView.setText(lan[position]);
            if (lan[position].equals("키")) {
                userView.setText(map.get(lan[position]) + "cm");
            } else if (lan[position].equals("비밀번호")) {
                userView.setText("변경");
            } else if (lan[position].equals("당뇨관리")) {
                userView.setText("사용안함");
            } else if (lan[position].equals("계정")) {
                googleView.setVisibility(View.VISIBLE);
                userView.setText(map.get(lan[position]));
            } else {
                userView.setText(map.get(lan[position]));

            }

            return convertView;
        }

    }

    public class User {

        private String name;

        private String birthDate;

        private String gender;

        private double height;

        private String password;

        private boolean isManageBloodSugar;

        private String accountEmail;

        public User(String name,
                    String birthDate,
                    String gender,
                    double height,
                    String password,
                    boolean isManageBloodSugar,
                    String accountEmail) {
            this.name = name;
            this.birthDate = birthDate;
            this.gender = gender;
            this.height = height;
            this.password = password;
            this.isManageBloodSugar = isManageBloodSugar;
            this.accountEmail = accountEmail;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getBirthDate() {
            return birthDate;
        }

        public void setBirthDate(String birthDate) {
            this.birthDate = birthDate;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public boolean getIsManageBloodSugar() {
            return isManageBloodSugar;
        }

        public void setIsManageBloodSugar(boolean isManageBloodSugar) {
            this.isManageBloodSugar = isManageBloodSugar;
        }

        public String getAccountEmail() {
            return accountEmail;
        }

        public void setAccountEmail(String accountEmail) {
            this.accountEmail = accountEmail;
        }
    }
}
