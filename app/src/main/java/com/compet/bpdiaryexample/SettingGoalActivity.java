package com.compet.bpdiaryexample;

import android.os.Bundle;

public class SettingGoalActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_goal);
        initToolbar("목표설정");
    }
}
