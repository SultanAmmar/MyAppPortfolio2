package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {
    private int i;
    private float j;
    private String s;
    private final String TAG = this.getClass().getSimpleName();

    Button btn1;
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"onCreate() called ! STATE = CREATED");
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
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart() called ! STATE = RESTARTING - BACKGROUND");

        /*
        الحمد لله
        Activity life cycle
                                                          onPause()    Activity has lost focus
                                                  |Active|-------->
                                                      |            |
                                           onResume() |            |    onStop()  Activity is no
                                  |Visible|----------> <--------|Paused|-------->   longer visible
                                      |                                          |
        oncreate            onStart() |                           onRestart()    |
        --------> |created |-------->  <------------|Restarting|<------------|Stopped|
              |                                                                   |
              |                                                                   | onDestroy()
              ---------------------------------------------------------------|Destroyed|
         */
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onstart() called ! STATE = VISIBLE");

        /*
        the Activity has three state in its life cycle
                 --------
                | Active |
                 --------
                 *      |
       onResume()|      | onPause()
                 |      *
                 ---------
                | Visible |
                 ---------
                 *      |
       onStart() |      | onStop()
      onRestart()|      *
               ------------
              | Background |
               ------------
         */
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume() called ! - STATE = ACTIVE");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause() called ! STATE = PAUSED - VISIBLE");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop() called ! STATE = STOPPED - BACKGROUND");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy called ! STATE = DESTROYED");
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
