package com.aarontseng.createdbyaaron;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private LinearLayout ll;
    private TextView tvTitle;
    private Button bt1;
    private Button bt2;
    private Button bt3;
    private Button bt4;
    private Button bt5;
    private Button bt6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        ll= (LinearLayout) findViewById(R.id.id_ll);
        tvTitle= (TextView) findViewById(R.id.id_tv_title);
        bt1= (Button) findViewById(R.id.id_bt_1);
        bt2= (Button) findViewById(R.id.id_bt_2);
        bt3= (Button) findViewById(R.id.id_bt_3);
        bt4= (Button) findViewById(R.id.id_bt_4);
        bt5= (Button) findViewById(R.id.id_bt_5);
        bt6= (Button) findViewById(R.id.id_bt_6);
    }

    /**
     * @param v
     * 按钮点击事件
     * bt_1为Popular Movies
     * bt_2为stock hawk
     * bt_3为build it bigger
     * bt_4为make your app material
     * bt_5为go ubiquitous
     * bt_6为capstone
     */
    public void btOnClick(View v){
        switch (v.getId()){
            case R.id.id_bt_1:
                Toast.makeText(getApplicationContext(),R.string.bt_1,Toast.LENGTH_SHORT).show();
                break;
            case R.id.id_bt_2:
                Toast.makeText(getApplicationContext(),R.string.bt_2,Toast.LENGTH_SHORT).show();
                break;
            case R.id.id_bt_3:
                Toast.makeText(getApplicationContext(),R.string.bt_3,Toast.LENGTH_SHORT).show();
                break;
            case R.id.id_bt_4:
                Toast.makeText(getApplicationContext(),R.string.bt_4,Toast.LENGTH_SHORT).show();
                break;
            case R.id.id_bt_5:
                Toast.makeText(getApplicationContext(),R.string.bt_5,Toast.LENGTH_SHORT).show();
                break;
            case R.id.id_bt_6:
                Toast.makeText(getApplicationContext(),R.string.bt_6,Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(getApplicationContext(),"Exception!",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
