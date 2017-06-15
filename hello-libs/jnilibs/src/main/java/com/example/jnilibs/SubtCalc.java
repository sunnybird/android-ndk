package com.example.jnilibs;

/**
 *
 **/

public class SubtCalc {

    static {
        System.loadLibrary("subcalc");
    }

    public enum CALCTYPE {
        ADD,
        SUB,
        DIVID,
        MULIT
    }

    public static native int add(int a, int b);

    public static native int sub(int a, int b);

    public static native int divid(int a, int b);

    public static native int mulit(int a, int b);


    public static int calcByType(CALCTYPE calctype, int a, int b) {

        int result = 0;

        switch (calctype) {

            case ADD:

                result = add(a, b);
                break;
            case SUB:

                result = sub(a, b);
                break;
            case DIVID:

                result = divid(a, b);
                break;
            case MULIT:

                result = mulit(a, b);
                break;

            default:
                break;
        }

        return result;
    }
}
