package com.compet.bpdiaryexample.profile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.compet.bpdiaryexample.R;

public class NameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_name);

        TextView titleView = (TextView)findViewById(R.id.toolbar_title);
        titleView.setText("프로필");

    }
}
