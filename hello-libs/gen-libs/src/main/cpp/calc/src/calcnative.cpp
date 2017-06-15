//
// Created by fengjl on 2017/6/15.
//

#define  __cplusplus
#include "calcnative.h"

int  add_native(int a,int b){

   return a + b;

}


int sub_native(int a,int b){

    return a - b;

}

int divid_native(int a,int b){

    if(b == 0){
        return 0;
    } else{
        return a / b;
    }

}

int mulit_native(int a,int b){

 return a * b;
}