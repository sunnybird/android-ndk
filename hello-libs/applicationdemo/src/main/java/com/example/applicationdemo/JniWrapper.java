package com.example.applicationdemo;

/**
 *
 **/

public class JniWrapper {

    public native String  stringFromJNI();
    static {
        System.loadLibrary("hello-libs");
    }
}
