package com.compet.bpdiaryexample;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class OnlineShopActivity extends BaseActivity implements ViewPager.OnPageChangeListener, View.OnClickListener {

    private ViewPager intro_images;

    private LinearLayout pager_indicator;

    private int dotsCount;

    private ImageView[] dots;

    private OnlineShopPagerAdapter mAdapter;

    private int[] mImageResources = {R.drawable.img_online_example01,
                                     R.drawable.img_online_example01,
                                     R.drawable.img_online_example01};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online_shop);
        initToolbar("온라인샵");

        intro_images = (ViewPager)findViewById(R.id.pager_introduction);
        pager_indicator = (LinearLayout)findViewById(R.id.viewPagerCountDots);

        mAdapter = new OnlineShopPagerAdapter(OnlineShopActivity.this, mImageResources);
        intro_images.setAdapter(mAdapter);
        intro_images.setCurrentItem(0);
        intro_images.setOnPageChangeListener(this);
        setUiPageViewController();

    }

    private void setUiPageViewController() {

        dotsCount = mAdapter.getCount();
        dots = new ImageView[dotsCount];

        for (int i = 0; i < dotsCount; i++) {
            dots[i] = new ImageView(this);
            dots[i].setImageDrawable(getResources().getDrawable(R.drawable.non_selected_item_dot));

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                                                                             LinearLayout.LayoutParams.WRAP_CONTENT);

            params.setMargins(16, 0, 16, 0);

            pager_indicator.addView(dots[i], params);
        }

        dots[0].setImageDrawable(getResources().getDrawable(R.drawable.selected_item_dot));

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        for (int i = 0; i < dotsCount; i++) {
            dots[i].setImageDrawable(getResources().getDrawable(R.drawable.non_selected_item_dot));
        }

        dots[position].setImageDrawable(getResources().getDrawable(R.drawable.selected_item_dot));
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void onClick(View view) {

    }
}
