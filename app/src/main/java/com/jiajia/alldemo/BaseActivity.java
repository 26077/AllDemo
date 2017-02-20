package com.jiajia.alldemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by jiajia on 2017/2/15.
 */

public class BaseActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActManager.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActManager.finishActivty(this);
    }
}
