package com.compet.bpdiaryexample;

import android.os.Bundle;

public class AddAlarmActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_alarm);
        initToolbar("알림추가");
    }
}
