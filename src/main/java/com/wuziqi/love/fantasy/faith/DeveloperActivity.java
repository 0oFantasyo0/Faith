package com.wuziqi.love.fantasy.faith;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DeveloperActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer);
        TextView tv_androidstudio=(TextView)findViewById(R.id.tv_androidstudio);
        tv_androidstudio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                Uri content_url = Uri.parse("https://developer.android.google.cn/studio/index.html");
                intent.setData(content_url);
                startActivity(intent);
            }
        });
        Button bt_ud=(Button)findViewById(R.id.bt_ud);
        bt_ud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog =new AlertDialog.Builder(DeveloperActivity.this);
                dialog.setTitle("日志").setMessage(R.string.update_log).setCancelable(true)
                        .setPositiveButton("OK~", new DialogInterface.OnClickListener(){
                            @Override
                            public void onClick(DialogInterface dialog ,int which){}
                        });
                dialog.show();
            }
        });
        Button bt_up=(Button)findViewById(R.id.bt_up);
        bt_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                Uri content_url = Uri.parse("https://fir.im/wzq");
                intent.setData(content_url);
                startActivity(intent);
            }
        });
        //返回按钮
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        //返回按钮
    }
    //返回按钮
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
    //返回按钮
}
