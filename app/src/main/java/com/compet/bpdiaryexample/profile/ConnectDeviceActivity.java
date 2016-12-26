package com.compet.bpdiaryexample.profile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.compet.bpdiaryexample.BaseActivity;
import com.compet.bpdiaryexample.ConnectBloodPressureActivity;
import com.compet.bpdiaryexample.ConnectWeightActivity;
import com.compet.bpdiaryexample.R;

public class ConnectDeviceActivity extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect_device);
        initToolbar("연동기기");


        RelativeLayout relativeLayout = (RelativeLayout)findViewById(R.id.layout_pressure);
        relativeLayout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ConnectDeviceActivity.this, ConnectBloodPressureActivity.class);
                startActivity(intent);
            }
        });

        relativeLayout = (RelativeLayout)findViewById(R.id.layout_weight);
        relativeLayout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ConnectDeviceActivity.this, ConnectWeightActivity.class);
                startActivity(intent);
            }
        });

    }
}
