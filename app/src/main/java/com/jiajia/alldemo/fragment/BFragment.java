package com.jiajia.alldemo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jiajia.alldemo.R;

/**
 * Created by jiajia on 2017/2/15.
 */

public class BFragment extends Fragment {
    private static BFragment instance;
    public BFragment(){}
    public static BFragment getInstance() {
        if (instance == null) {
            instance = new BFragment();
        }
        return instance;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_b,null);
        return view;
    }
}
