package com.compet.bpdiaryexample;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;

/**
 * Created by goodn on 2016-12-24.
 */

public class NotiChildView extends FrameLayout {

    private TextView contentView;
    private NotiChildItem item;

    public NotiChildView(Context context) {
        super(context);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.view_noti_child, this);
        contentView = (TextView)findViewById(R.id.text_child_content);
    }
    public void setChildItem(NotiChildItem item){
        this.item = item;
        contentView.setText(item.getChildContent());

    }
}
