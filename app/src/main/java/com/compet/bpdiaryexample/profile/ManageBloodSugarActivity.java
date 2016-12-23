package com.compet.bpdiaryexample.profile;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.compet.bpdiaryexample.R;

public class ManageBloodSugarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_blood_sugar);

        TextView titleView = (TextView)findViewById(R.id.toolbar_title);
        titleView.setText("당뇨관리");
    }
}
