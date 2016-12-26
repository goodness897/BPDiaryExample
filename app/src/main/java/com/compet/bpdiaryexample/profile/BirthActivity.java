package com.compet.bpdiaryexample.profile;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.compet.bpdiaryexample.BaseActivity;
import com.compet.bpdiaryexample.DateDialog;
import com.compet.bpdiaryexample.R;

public class BirthActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birth);
        initToolbar("생년월일");

        Button inputBirth = (Button)findViewById(R.id.edit_birth);
        inputBirth.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                DateDialog dateDialog = new DateDialog(view.getContext());
                dateDialog.show();

            }
        });

    }
}
