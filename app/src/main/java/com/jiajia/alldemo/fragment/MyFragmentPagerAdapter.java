package com.jiajia.alldemo.fragment;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by jiajia on 2017/2/15.
 */

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {
    public final int COUNT = 3;
    String [] titles = new String[]{"A","B","C"};
    Context context;
    public MyFragmentPagerAdapter(FragmentManager fm,Context context) {
        super(fm);
        this.context = context;
    }
    @Override
    public int getCount() {
        return COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return AFragment.getInstance();
            case 1:
                return BFragment.getInstance();
            case 2:
                return CFragment.getInstance();
        }
        return AFragment.getInstance();
    }


}
