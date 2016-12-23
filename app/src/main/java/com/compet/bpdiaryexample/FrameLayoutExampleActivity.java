package com.compet.bpdiaryexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class FrameLayoutExampleActivity extends AppCompatActivity implements View.OnClickListener{

    private LinearLayout mLlRed;
    private LinearLayout mLlBlue;

    /* (non-Javadoc)
     * @see android.app.Activity#onCreate(android.os.Bundle)
     */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout_example);

        Button bRed = (Button)findViewById(R.id.frame_layout_example_activity_b_visible_red);
        Button bBlue = (Button)findViewById(R.id.frame_layout_example_activity_b_visible_blue);

        mLlRed = (LinearLayout)findViewById(R.id.frame_layout_example_activity_ll_red);
        mLlBlue = (LinearLayout)findViewById(R.id.frame_layout_example_activity_ll_blue);

        bRed.setOnClickListener(this);
        bBlue.setOnClickListener(this);
    }

    /* (non-Javadoc)
     * @see android.app.Activity#onResume()
     */
    @Override
    protected void onResume()
    {
        super.onResume();

//        mLlRed.setVisibility(LinearLayout.VISIBLE);
//        mLlBlue.setVisibility(LinearLayout.INVISIBLE);
    }

    /* (non-Javadoc)
     * @see android.view.View.OnClickListener#onClick(android.view.View)
     */
    @Override
    public void onClick(View v)
    {
        switch(v.getId())
        {
            // 빨간색버튼 클릭
            case R.id.frame_layout_example_activity_b_visible_red:
                mLlRed.setVisibility(LinearLayout.VISIBLE);
                mLlBlue.setVisibility(LinearLayout.INVISIBLE);
                break;

            // 파란색버튼 클릭
            case R.id.frame_layout_example_activity_b_visible_blue:
                mLlRed.setVisibility(LinearLayout.INVISIBLE);
                mLlBlue.setVisibility(LinearLayout.VISIBLE);
                break;
        }
    }
}
