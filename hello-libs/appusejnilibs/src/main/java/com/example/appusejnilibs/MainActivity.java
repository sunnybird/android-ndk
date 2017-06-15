package com.example.appusejnilibs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.jnilibs.SubtCalc;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Application" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int a = 100 , b = 10;

        Log.d(TAG,String.format("add %d,and %d,the result is :%d",a,b,
                SubtCalc.calcByType(SubtCalc.CALCTYPE.ADD,a,b)));
        Log.d(TAG,String.format("sub %d,and %d,the result is :%d",a,b,
                SubtCalc.calcByType(SubtCalc.CALCTYPE.SUB,a,b)));
        Log.d(TAG,String.format("divid %d,and %d,the result is :%d",a,b,
                SubtCalc.calcByType(SubtCalc.CALCTYPE.DIVID,a,b)));
        Log.d(TAG,String.format("mulit %d,and %d,the result is :%d",a,b,
                SubtCalc.calcByType(SubtCalc.CALCTYPE.MULIT,a,b)));
    }
}
