package com.compet.bpdiaryexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);

    }

    public void initToolbar(String title) {
        LinearLayout linearLayout = (LinearLayout)findViewById(R.id.layout_navi_back);
        linearLayout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                finish();
            }
        });
        TextView titleView = (TextView)findViewById(R.id.toolbar_title);
        titleView.setText(title);
    }
}
