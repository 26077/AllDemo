package com.jiajia.alldemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.Toast;

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

    public void showToast(String text){
        if(TextUtils.isEmpty(text)){
            Toast.makeText(this,text,Toast.LENGTH_SHORT).show();
        }
    }

   /* public void showSnack(String text){
        if (TextUtils.isEmpty(text)){
            Snackbar.make(this,text,Snackbar.LENGTH_SHORT).show();
        }
    }*/
}
