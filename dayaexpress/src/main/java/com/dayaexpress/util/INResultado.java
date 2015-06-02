package com.dayaexpress.util;

public class INResultado {
    public static final Integer RCORRECTO = 1;
    public static final Integer ROBSERVACION = 2;
    public static final Integer RERROR = 3;
    
    private Integer resultado;
    private String mensaje;
    private String errorMensaje;
    private String errorDetalle;
    private Object objResultado;
    
    private boolean correcto;
    private boolean observacion;
    private boolean error;

    public INResultado() {
        this.resultado = 0;
        this.mensaje = "";
        this.errorMensaje = "";
        this.errorDetalle = "";
    }    
    
    public Integer getResultado() {
        return resultado;
    }

    public void setResultado(Integer resultado) {
        this.resultado = resultado;        
        if(this.resultado == RCORRECTO){
            this.correcto = true;
        }else if(this.resultado == ROBSERVACION){
            this.observacion = true;
        }else if(this.resultado == RERROR){
            this.error = true;
        }
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getErrorMensaje() {
        return errorMensaje;
    }

    public void setErrorMensaje(String errorMensaje) {
        this.errorMensaje = errorMensaje;
    }

    public String getErrorDetalle() {
        return errorDetalle;
    }

    public void setErrorDetalle(String errorDetalle) {
        this.errorDetalle = errorDetalle;
    }

    public Object getObjResultado() {
        return objResultado;
    }

    public void setObjResultado(Object objResultado) {
        this.objResultado = objResultado;
    }
            
    public boolean esCorrecto(){
        return correcto;
    }
    
    public boolean tieneObservacion(){
        return observacion;
    }
    
    public boolean tieneError(){
        return error;
    }
}
