//
// Created by fengjl on 2017/6/15.
//

#define TAG "CALANATIVE"

#ifndef __CALCNATIVE__
#define __CALCNATIVE__

/**
 * native add
 */
#ifdef __cplusplus
extern "C"
#endif // __cplusplus
int  add_native(int a,int b);

#ifdef __cplusplus
extern "C"
#endif
int sub_native(int a,int b);


#ifdef __cplusplus
extern "C"
#endif
int divid_native(int a,int b);

#ifdef __cplusplus
extern "C"
#endif
int mulit_native(int a,int b);

#endif //__CALCNATIVE__
