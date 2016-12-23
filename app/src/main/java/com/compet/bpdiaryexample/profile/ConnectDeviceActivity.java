package com.compet.bpdiaryexample.profile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.compet.bpdiaryexample.ConnectBloodPressureActivity;
import com.compet.bpdiaryexample.R;

public class ConnectDeviceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect_device);
        ImageView imageButton = (ImageView)findViewById(R.id.btn_navi_back);
        imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                finish();
            }
        });
        TextView titleView = (TextView)findViewById(R.id.toolbar_title);
        titleView.setText("연동기기");

        RelativeLayout relativeLayout = (RelativeLayout)findViewById(R.id.layout_pressure);
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ConnectDeviceActivity.this, ConnectBloodPressureActivity.class);
                startActivity(intent);
            }
        });

    }
}
