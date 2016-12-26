package com.compet.bpdiaryexample.profile;

import android.os.Bundle;

import com.compet.bpdiaryexample.BaseActivity;
import com.compet.bpdiaryexample.R;

public class ChangePasswordActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_change_password);
        initToolbar("비밀번호");
    }
}
