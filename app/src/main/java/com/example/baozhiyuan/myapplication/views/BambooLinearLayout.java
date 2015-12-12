package com.example.baozhiyuan.myapplication.views;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by baozhiyuan on 15/8/26.
 */
public class BambooLinearLayout extends LinearLayout {
    private final static String TAG = "BambooLinearLayout";
    public BambooLinearLayout(Context context) {
        super(context);
    }

    public BambooLinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BambooLinearLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
//        boolean flag = super.dispatchTouchEvent(ev);
        Log.d(TAG,"BambooLinearLayout -> dispatchTouchEvent -->");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
//        boolean flag = super.onInterceptTouchEvent(ev);
        Log.d(TAG,"BambooLinearLayout -> onInterceptTouchEvent --> ");
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
//        boolean flag = super.onTouchEvent(event);
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.d(TAG,"BambooLinearLayout -> onTouchEvent -- down --> ");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d(TAG,"BambooLinearLayout -> onTouchEvent -- move --> ");
                break;
            case MotionEvent.ACTION_UP:
                Log.d(TAG,"BambooLinearLayout -> onTouchEvent -- up --> ");
                break;
        }
        return super.onTouchEvent(event);

    }
}
