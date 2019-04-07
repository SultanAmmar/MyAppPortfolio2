package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
    private int i;
    private float j;
    private String s;

    private Button btn1;
    private Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        i = i;
        j = j;
        s = s;

        //initializing btns
        btn1 = (Button)findViewById(R.id.activity_main_btn1);
        btn2 = (Button)findViewById(R.id.activity_main_btn2);

        btn1.setOnClickListener(new View.OnClickListener() {
            /*
            الحمد ببه
            Today, I created two buttons for test.
             */
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Button 1 Clicked ! ", Toast.LENGTH_SHORT).show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Button 2 Clicked !",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
