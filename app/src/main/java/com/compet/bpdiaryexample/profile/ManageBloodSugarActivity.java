package com.compet.bpdiaryexample.profile;

import android.os.Bundle;

import com.compet.bpdiaryexample.BaseActivity;
import com.compet.bpdiaryexample.R;

public class ManageBloodSugarActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_blood_sugar);

        initToolbar("당뇨관리");
    }
}
