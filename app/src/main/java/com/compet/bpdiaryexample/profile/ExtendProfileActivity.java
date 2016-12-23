package com.compet.bpdiaryexample.profile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.compet.bpdiaryexample.R;
import com.compet.bpdiaryexample.UpdateHeightActivity;

public class ExtendProfileActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extend_profile);

        ImageView imageButton = (ImageView)findViewById(R.id.btn_navi_back);
        imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                finish();
            }
        });
        TextView titleView = (TextView)findViewById(R.id.toolbar_title);
        titleView.setText("프로필");

        RelativeLayout nameLayout = (RelativeLayout)findViewById(R.id.layout_name);
        nameLayout.setOnClickListener(this);

        RelativeLayout birthLayout = (RelativeLayout)findViewById(R.id.layout_birth);
        birthLayout.setOnClickListener(this);

        RelativeLayout genderLayout = (RelativeLayout)findViewById(R.id.layout_gender);
        genderLayout.setOnClickListener(this);

        RelativeLayout heightLayout = (RelativeLayout)findViewById(R.id.layout_height);
        heightLayout.setOnClickListener(this);

        RelativeLayout passwordLayout = (RelativeLayout)findViewById(R.id.layout_password);
        passwordLayout.setOnClickListener(this);

        RelativeLayout manageLayout = (RelativeLayout)findViewById(R.id.layout_manage_blood_sugar);
        manageLayout.setOnClickListener(this);

        RelativeLayout accountLayout = (RelativeLayout)findViewById(R.id.layout_account);
        accountLayout.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        Intent intent;
        switch (id) {
            case R.id.layout_name:
                intent = new Intent(ExtendProfileActivity.this, NameActivity.class);
                startActivity(intent);
                break;
            case R.id.layout_birth:
                intent = new Intent(ExtendProfileActivity.this, BirthActivity.class);
                startActivity(intent);
                break;

            case R.id.layout_gender:
                intent = new Intent(ExtendProfileActivity.this, GenderActivity.class);
                startActivity(intent);
                break;

            case R.id.layout_height:
                intent = new Intent(ExtendProfileActivity.this, UpdateHeightActivity.class);
                startActivity(intent);
                break;
            case R.id.layout_password:
                intent = new Intent(ExtendProfileActivity.this, ChangePasswordActivity.class);
                startActivity(intent);
                break;
            case R.id.layout_manage_blood_sugar:
                intent = new Intent(ExtendProfileActivity.this, ManageBloodSugarActivity.class);
                startActivity(intent);
                break;

            case R.id.layout_account:
                intent = new Intent(ExtendProfileActivity.this, AccountActivity.class);
                startActivity(intent);
                break;

        }
    }
}
