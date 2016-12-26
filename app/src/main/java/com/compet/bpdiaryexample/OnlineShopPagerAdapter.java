package com.compet.bpdiaryexample;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by Mu on 2016-12-16.
 */

public class OnlineShopPagerAdapter extends PagerAdapter {

    private Context mContext;

    private int[] mImageResources;


    public OnlineShopPagerAdapter(Context mContext, int[] mImageResources) {
        this.mContext = mContext;
        this.mImageResources = mImageResources;
    }

    @Override
    public int getCount() {
        return mImageResources.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((LinearLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        View itemView = LayoutInflater.from(mContext).inflate(R.layout.pager_item, container, false);

        ImageView imageView = (ImageView)itemView.findViewById(R.id.img_pager_item);
        imageView.setImageResource(mImageResources[position]);

        container.addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }

}
