package com.dayaexpress.util;

public class MngError {
    public static INResultado getEntityError(String mensaje, Exception ex){
        INResultado inResultado = new INResultado();
        inResultado.setErrorMensaje(mensaje);
        inResultado.setErrorDetalle(ex.getMessage());
        inResultado.setResultado(INResultado.RERROR);
        return inResultado;
    }
}
