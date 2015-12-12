package com.example.baozhiyuan.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.example.baozhiyuan.myapplication.utils.SystemBarTintManager;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends Activity {
    private final static String TAG = "MainActivity";
    @Bind(R.id.btn_test)
    Button mBtnTest;
    @Bind(R.id.main_btn_recyclerView)
    Button mBtnRecyclerView;

    protected SystemBarTintManager mTintManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT){
//            setTranslucentStatus(true);
            setFlags();
            mTintManager = new SystemBarTintManager(this);
            mTintManager.setStatusBarTintEnabled(true);
            mTintManager.setStatusBarTintColor(getResources().getColor(R.color.colorPrimaryDark));
        }

        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mBtnTest.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Log.d(TAG,"------ setOnTouchListener -----");
                return false;
            }

        });

        mBtnRecyclerView.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,RecycleViewActivity.class);
                startActivity(intent);
            }
        });

    }

    public void setTranslucentStatus(boolean on){
        Window win = getWindow();
        WindowManager.LayoutParams winParams = win.getAttributes();
        final int bits = WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS;
        if(on){
            winParams.flags |= bits;
        } else {
            winParams.flags &= ~bits;
        }
        win.setAttributes(winParams);
    }

    public void setFlags(){
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.d(TAG,"MainActivity -> dispatchTouchEvent -- down");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d(TAG,"MainActivity -> dispatchTouchEvent -- move");
                break;
            case MotionEvent.ACTION_UP:
                Log.d(TAG,"MainActivity -> dispatchTouchEvent -- up");
                break;
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.d(TAG,"MainActivity -> onTouchEvent -- down");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d(TAG,"MainActivity -> onTouchEvent -- move");
                break;
            case MotionEvent.ACTION_UP:
                Log.d(TAG,"MainActivity -> onTouchEvent -- up");
                break;
        }
        return super.onTouchEvent(event);
    }
}
