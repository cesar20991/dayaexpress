package com.dayaexpress.util;


public class SGUtil {
    public static boolean esNullOEmpty(String texto){
        if(texto == null){
            return true;
        }else if(texto.isEmpty()){
            return true;
        }
        return false;
    }
}
