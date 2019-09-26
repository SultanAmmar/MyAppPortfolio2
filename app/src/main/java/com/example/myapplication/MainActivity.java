package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

public class MainActivity extends FragmentActivity implements View.OnClickListener {
    private int i;
    private float j;
    private String s;
    private final String TAG = this.getClass().getSimpleName();

    /*
    هذه الأزرار تم إلغاؤها مؤقتا
    Button btn1;
    Button btn2; */

    private Button addbtn;
    private Button lstbtn;
    private Button aboutbtn;
    private FrameLayout mainframe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"onCreate() called ! STATE = CREATED");
        setContentView(R.layout.activity_main);
        i = i;
        j = j;
        s = s;

        /*
        هذا المقطع ته إلغاؤه مؤقتا
        //initializing btns
        btn1 = (Button)findViewById(R.id.activity_main_btn1);
        btn2 = (Button)findViewById(R.id.activity_main_btn2);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);*/

        //تهيئة الأزرار
        addbtn = (Button)findViewById(R.id.activity_main_addbtn);
        lstbtn = (Button)findViewById(R.id.activity_main_lstbtn);
        aboutbtn = (Button)findViewById(R.id.activity_main_aboutbtn);

//        التحقق من أن activity تستخدم نسخة layout مطابقة لactivity_main_framelayout
        if (findViewById(R.id.activity_main_framelayout) != null){
//            على كل حال إذا كنا قد تم إعادتنا من حالة سابقة state عندها نخرج من هذه المعقوفة return
//              و إلا انتهى بنا الأمر إلى وجود fragment متراكمة فوق بعضها البعض
            if (savedInstanceState != null){
                return;
            }
//            إنشاء framgent جديد ليتم وضعه بالactivity layout
            AddScreenFragment addScreenFragment = new AddScreenFragment();
//            في حالة أن activity بدأت بتعليمات خاصة special instructions
//            TODO :  أكمل النص من الرابط https://developer.android.com/training/basics/fragments/fragment-ui
            addScreenFragment.setArguments(getIntent().getExtras());
            getSupportFragmentManager().beginTransaction().
                    add(R.id.activity_main_framelayout, addScreenFragment).commit();

        }

        addbtn.setOnClickListener(this);
        lstbtn.setOnClickListener(this);
        aboutbtn.setOnClickListener(this);
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
/*
 هذا المقطع تم إلغاؤه مؤقتا
        switch (v.getId()){
            case R.id.activity_main_btn1:
                Toast.makeText(getApplicationContext(),"Button 1 Clicked !",Toast.LENGTH_SHORT).show();
                break;

            case R.id.activity_main_btn2:
                Toast.makeText(getApplicationContext(),"Button 2 Clicked !", Toast.LENGTH_SHORT).show();
                break;
        }
        */
        switch (v.getId()){
            case R.id.activity_main_addbtn:
                Toast.makeText(getApplicationContext(),R.string.main_activity_addbtn_toast_txt,Toast.LENGTH_SHORT).show();
                break;
            case R.id.activity_main_lstbtn:
                 Toast.makeText(getApplicationContext(), R.string.main_activity_lstbtn_txt,Toast.LENGTH_SHORT).show();
                 break;
                 case R.id.activity_main_aboutbtn:
                     Toast.makeText(getApplicationContext(),R.string.main_activity_aboutbtn_txt,Toast.LENGTH_SHORT).show();

        }
    }
}
