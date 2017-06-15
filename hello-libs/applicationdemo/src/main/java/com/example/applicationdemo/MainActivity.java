package com.example.applicationdemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JniWrapper jniWrapper = new JniWrapper();

        Log.d("ddd",jniWrapper.stringFromJNI());
    }
}
