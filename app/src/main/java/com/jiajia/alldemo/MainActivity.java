package com.jiajia.alldemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.jiajia.alldemo.activity.ActTestActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    public void init(){
        Button btn_mvp = (Button)findViewById(R.id.btn_mvp);
        Button btn_act = (Button)findViewById(R.id.btn_act);
        btn_act.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Log.v("1",view.getId()+"");
        switch (view.getId()){
            case R.id.btn_mvp:
                break;
            case R.id.btn_act:
                Intent intent =new Intent(MainActivity.this, ActTestActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
