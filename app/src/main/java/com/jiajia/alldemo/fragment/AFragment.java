package com.jiajia.alldemo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jiajia.alldemo.R;

/**
 * Created by jiajia on 2017/2/15.
 */

public class AFragment extends Fragment {
    RecyclerView mRecyclerView;
    private static AFragment instance;
    public AFragment(){}
    public static AFragment getInstance() {
        if (instance == null) {
            instance = new AFragment();
        }
        return instance;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_a,null);
        mRecyclerView = (RecyclerView)view.findViewById(R.id.fraga_rv);
        return view;
    }


}
