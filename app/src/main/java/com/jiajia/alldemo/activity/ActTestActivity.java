package com.jiajia.alldemo.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.jiajia.alldemo.R;

/**
 * Created by jiajia on 2017/2/9.
 */

public class ActTestActivity extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_activity);
        init();

    }
    public void init(){
        Button btn_anony_act = (Button) findViewById(R.id.btn_anony_act);
        Button btn_web = (Button) findViewById(R.id.btn_web);
        Button btn_gallery = (Button) findViewById(R.id.btn_gallery);
        Button btn_mess = (Button) findViewById(R.id.btn_mess);
        Button btn_call = (Button) findViewById(R.id.btn_call);
        Button btn_transition = (Button) findViewById(R.id.btn_transition);
        Button btn_rtn_mess = (Button) findViewById(R.id.btn_rtn_mess);
        btn_anony_act.setOnClickListener(this);
        btn_web.setOnClickListener(this);
        btn_gallery.setOnClickListener(this);
        btn_mess.setOnClickListener(this);
        btn_call.setOnClickListener(this);
        btn_transition.setOnClickListener(this);
        btn_rtn_mess.setOnClickListener(this);



    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_anony_act:
                Intent intent = new Intent();
                intent.setAction("anonymityActivity");
                startActivity(intent);
                break;
            case R.id.btn_web:
                Uri url  = Uri.parse("http://www.baidu.com");
                Intent intent2 = new Intent(Intent.ACTION_VIEW,url);
                startActivity(intent2);
                break;
            case R.id.btn_gallery:
                Intent intent3 = new Intent();
                intent3.setAction(Intent.ACTION_GET_CONTENT);
                intent3.setType("image/*");
                startActivityForResult(intent3,1);
                break;
            case R.id.btn_mess:
                Intent intent4 = new Intent();
                startActivity(intent4);
                break;
            case R.id.btn_call:
                Uri url5 = Uri.parse("tel:18217179016");
                Intent intent5 = new Intent(Intent.ACTION_VIEW,url5);
                startActivity(intent5);
                break;
            case R.id.btn_transition:
                Intent intent6 = new Intent(ActTestActivity.this,AnonActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("source","From ActTestActivity");
                intent6.putExtras(bundle);
                startActivityForResult(intent6,1);
                break;
            case R.id.btn_rtn_mess:
                Intent intent7 = new Intent();
                Bundle bundle2 = new Bundle();
                bundle2.putString("source","From ActTestActivity");
                startActivity(intent7);
                break;


        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (resultCode){
            case 1:
                Toast.makeText(this, "传递参数至目的页面成功", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(this, data.getExtras().getString("to"), Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}
