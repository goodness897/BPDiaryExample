package com.compet.bpdiaryexample.profile;

import android.os.Bundle;

import com.compet.bpdiaryexample.BaseActivity;
import com.compet.bpdiaryexample.R;

public class NameActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_name);

        initToolbar("프로필");

    }
}
