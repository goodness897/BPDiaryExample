package com.compet.bpdiaryexample.profile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.compet.bpdiaryexample.BaseActivity;
import com.compet.bpdiaryexample.R;

public class AccountActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        initToolbar("계정");
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
