package com.jiajia.alldemo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.jiajia.alldemo.R;

/**
 * Created by jiajia on 2017/2/9.
 */

public class AnonActivity extends AppCompatActivity {
    TextView tv_source;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_anon);
        init();

        // 如果前界面传递数据过来，显示
        if(getIntent().getExtras()!=null){
            tv_source.setText(getIntent().getExtras().getString("source").toString());
        }
    }
    public void init(){
        tv_source = (TextView)findViewById(R.id.tv_source);
    }

    @Override
    public void onBackPressed() {
        setResult(2,new Intent().putExtra("to","backfrom AnonActivity"));
        super.onBackPressed();
    }
}
