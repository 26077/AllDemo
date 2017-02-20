package com.jiajia.alldemo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

import com.jiajia.alldemo.BaseActivity;
import com.jiajia.alldemo.R;

/**
 * Created by jiajia on 2017/2/15.
 */

public class ViewPagerActivity extends BaseActivity {
    TabLayout mTabLayout;
    ViewPager mViewPager;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_viewpager);
        initView();
        initEvent();
    }
    public void initView(){
        mTabLayout =(TabLayout)findViewById(R.id.tab);
        mViewPager =(ViewPager)findViewById(R.id.my_viewpager);
    }
    public void initEvent(){
        MyFragmentPagerAdapter adapter = new MyFragmentPagerAdapter(getSupportFragmentManager(),this);
        mViewPager.setAdapter(adapter);
        mTabLayout.setupWithViewPager(mViewPager);
    }
}
