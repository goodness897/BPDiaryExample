package com.compet.bpdiaryexample.profile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.compet.bpdiaryexample.R;

public class AccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        ImageView imageButton = (ImageView)findViewById(R.id.btn_navi_back);
        imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                finish();
            }
        });
        TextView titleView = (TextView)findViewById(R.id.toolbar_title);
        titleView.setText("계정");

        Button btn = (Button)findViewById(R.id.btn_leave);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AccountActivity.this, LeaveActivity.class);
                startActivity(intent);
            }
        });
    }
}
