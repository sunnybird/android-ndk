//
// Created by fengjl on 2017/6/15.
//

#define TAG "SubCalc"
#include <jni.h>
#include <android/log.h>
#include "calcnative.h"

#define LOGI(...) \
  ((void)__android_log_print(ANDROID_LOG_INFO, TAG, __VA_ARGS__))



JNIEXPORT jint JNICALL
Java_com_example_jnilibs_SubtCalc_add(JNIEnv *env, jclass type, jint a, jint b) {

    // TODO

    LOGI("call add param : %d,%d",a,b);
    return add_native(a,b) ;

}

JNIEXPORT jint JNICALL
Java_com_example_jnilibs_SubtCalc_sub(JNIEnv *env, jclass type, jint a, jint b) {

    // TODO
    LOGI("call add param : %d,%d",a,b);
    return sub_native(a,b) ;
}

JNIEXPORT jint JNICALL
Java_com_example_jnilibs_SubtCalc_divid(JNIEnv *env, jclass type, jint a, jint b) {

    // TODO
    LOGI("call add param : %d,%d",a,b);
    return divid_native(a,b) ;
}

JNIEXPORT jint JNICALL
Java_com_example_jnilibs_SubtCalc_mulit(JNIEnv *env, jclass type, jint a, jint b) {

    // TODO
    LOGI("call add param : %d,%d",a,b);
    return mulit_native(a,b) ;
}