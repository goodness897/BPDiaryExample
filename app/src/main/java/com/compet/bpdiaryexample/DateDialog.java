package com.compet.bpdiaryexample;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by Mu on 2016-12-23.
 */

public class DateDialog extends Dialog {

    public DateDialog(Context context) {
        super(context);
    }

    public DateDialog(Context context, int themeResId) {
        super(context, themeResId);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WindowManager.LayoutParams lpWindow = new WindowManager.LayoutParams();
        lpWindow.flags = WindowManager.LayoutParams.FLAG_DIM_BEHIND;
        lpWindow.dimAmount = 0.8f;
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setAttributes(lpWindow);

        setContentView(R.layout.custom_dialog);
    }
}
