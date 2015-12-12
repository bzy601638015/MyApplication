package com.example.baozhiyuan.myapplication.views;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;

/**
 * Created by baozhiyuan on 15/8/26.
 */
public class BambooButton extends Button {
    private final static String TAG = "BambooButton";
    public BambooButton(Context context) {
        super(context);
    }

    public BambooButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BambooButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.d(TAG,"BambooButton -> dispatchTouchEvent -- down");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d(TAG,"BambooButton -> dispatchTouchEvent -- move");
                break;
            case MotionEvent.ACTION_UP:
                Log.d(TAG,"BambooButton -> dispatchTouchEvent -- up");
                break;
        }
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.d(TAG,"BambooButton -> onTouchEvent -- down");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d(TAG,"BambooButton -> onTouchEvent -- move");
                break;
            case MotionEvent.ACTION_UP:
                Log.d(TAG,"BambooButton -> onTouchEvent -- up");
                break;
        }
        return super.onTouchEvent(event);
    }
}
