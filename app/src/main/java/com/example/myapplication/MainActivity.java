package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {
    private int i;
    private float j;
    private String s;

    Button btn1;
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i = i;
        j = j;
        s = s;

        //initializing btns
        btn1 = (Button)findViewById(R.id.activity_main_btn1);
        btn2 = (Button)findViewById(R.id.activity_main_btn2);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.activity_main_btn1:
                Toast.makeText(getApplicationContext(),"Button 1 Clicked !",Toast.LENGTH_SHORT).show();
                break;

            case R.id.activity_main_btn2:
                Toast.makeText(getApplicationContext(),"Button 2 Clicked !", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
