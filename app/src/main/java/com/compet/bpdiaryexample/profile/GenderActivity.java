package com.compet.bpdiaryexample.profile;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.compet.bpdiaryexample.R;

public class GenderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_gender);

        TextView titleView = (TextView)findViewById(R.id.toolbar_title);
        titleView.setText("성별");

        RadioGroup typeRadioGroup = (RadioGroup)findViewById(R.id.radiogroup_type);
        typeRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                switch (checkedId) {
                    case R.id.radioMan:
                        break;
                    case R.id.radioWoman:
                        break;

                }

            }
        });
    }
}
