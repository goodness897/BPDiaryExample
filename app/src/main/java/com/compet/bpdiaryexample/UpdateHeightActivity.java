package com.compet.bpdiaryexample;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Spinner;

public class UpdateHeightActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_height);

        initToolbar("키");

        final LinearLayout cmLayout = (LinearLayout)findViewById(R.id.layout_cm);
        final LinearLayout inchLayout = (LinearLayout)findViewById(R.id.layout_inch);
        Spinner spinner = (Spinner)findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                if(position == 0) {
                    cmLayout.setVisibility(View.VISIBLE);
                    inchLayout.setVisibility(View.GONE);
                } else if(position == 1) {
                    cmLayout.setVisibility(View.GONE);
                    inchLayout.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
