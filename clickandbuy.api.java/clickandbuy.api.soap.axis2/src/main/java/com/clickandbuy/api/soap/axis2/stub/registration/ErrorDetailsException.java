
/**
 * ErrorDetailsException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.clickandbuy.api.soap.axis2.stub.registration;

public class ErrorDetailsException extends java.lang.Exception{

    private static final long serialVersionUID = 1362337579796L;
    
    private com.clickandbuy.api.soap.axis2.stub.ErrorDetails faultMessage;

    
        public ErrorDetailsException() {
            super("ErrorDetailsException");
        }

        public ErrorDetailsException(java.lang.String s) {
           super(s);
        }

        public ErrorDetailsException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ErrorDetailsException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.clickandbuy.api.soap.axis2.stub.ErrorDetails msg){
       faultMessage = msg;
    }
    
    public com.clickandbuy.api.soap.axis2.stub.ErrorDetails getFaultMessage(){
       return faultMessage;
    }
}
    