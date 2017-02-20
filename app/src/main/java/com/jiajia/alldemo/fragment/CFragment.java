package com.jiajia.alldemo.fragment;

/**
 * Created by jiajia on 2017/2/15.
 */

public class CFragment extends android.support.v4.app.Fragment {
    private static CFragment instance;
    public CFragment(){}
    public static CFragment getInstance() {
        if(instance == null){
            instance = new CFragment();
        }
        return instance;
    }
}
