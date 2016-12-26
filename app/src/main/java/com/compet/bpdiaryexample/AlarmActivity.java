package com.compet.bpdiaryexample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Switch;

public class AlarmActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);
        initToolbar("알림");

        Switch alarmSwitch = (Switch) findViewById(R.id.switch_alarm);
        alarmSwitch.setVisibility(View.VISIBLE);

        RelativeLayout medicineLayout = (RelativeLayout) findViewById(R.id.layout_alarm_medicine);
        medicineLayout.setOnClickListener(this);

        RelativeLayout messureLayout = (RelativeLayout) findViewById(R.id.layout_alarm_messure);
        messureLayout.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        Intent intent;
        switch (id) {
            case R.id.layout_alarm_medicine:
                intent = new Intent(AlarmActivity.this, AlarmMedicineActivity.class);
                startActivity(intent);
                break;
            case R.id.layout_alarm_messure:
                break;
        }
    }
}
