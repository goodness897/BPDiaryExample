package com.compet.bpdiaryexample;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class AlarmMedicineActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm_medicine);

        initToolbar("복약알림");

        ImageView plusBtn = (ImageView)findViewById(R.id.img_plus);
        plusBtn.setVisibility(View.VISIBLE);
        TextView textView = (TextView) findViewById(R.id.text_guide);

        SpannableStringBuilder sp = new SpannableStringBuilder(textView.getText().toString());
        sp.setSpan(new ForegroundColorSpan(Color.rgb(155, 149, 152)), 19, 22, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.setText(sp);

        ImageView addButton = (ImageView)findViewById(R.id.img_plus);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(AlarmMedicineActivity.this, AddAlarmActivity.class);
                startActivity(intent);
            }
        });



    }
}
