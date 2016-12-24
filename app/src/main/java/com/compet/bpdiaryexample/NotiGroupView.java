package com.compet.bpdiaryexample;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by goodn on 2016-12-24.
 */

public class NotiGroupView extends FrameLayout{

    private TextView titleView;
    private TextView dateView;
    private ImageView indicatorView;
    private ImageView newImageView;
    private NotiGroupItem item;

    public NotiGroupView(Context context) {
        super(context);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.view_noti_group, this);
        titleView = (TextView)findViewById(R.id.text_title);
        dateView = (TextView)findViewById(R.id.text_date);
        indicatorView = (ImageView)findViewById(R.id.img_list);
        newImageView = (ImageView)findViewById(R.id.img_new);
    }
    public void setGroupItem(NotiGroupItem item){
        this.item = item;
        titleView.setText(item.getTitle());
        dateView.setText(item.getDate());

    }

    public ImageView getIndicatorView() {
        return indicatorView;
    }
}
