
/**
 * PayCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.clickandbuy.api.soap.axis2.stub.payment;

    /**
     *  PayCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class PayCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public PayCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public PayCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for createBatch method
            * override this method for handling normal response from createBatch operation
            */
           public void receiveResultcreateBatch(
                    com.clickandbuy.api.soap.axis2.stub.CreateBatchResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from createBatch operation
           */
            public void receiveErrorcreateBatch(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for payRequestRecurring method
            * override this method for handling normal response from payRequestRecurring operation
            */
           public void receiveResultpayRequestRecurring(
                    com.clickandbuy.api.soap.axis2.stub.PayRequestRecurringResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from payRequestRecurring operation
           */
            public void receiveErrorpayRequestRecurring(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addBatchItem method
            * override this method for handling normal response from addBatchItem operation
            */
           public void receiveResultaddBatchItem(
                    com.clickandbuy.api.soap.axis2.stub.AddBatchItemResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addBatchItem operation
           */
            public void receiveErroraddBatchItem(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for creditRequest method
            * override this method for handling normal response from creditRequest operation
            */
           public void receiveResultcreditRequest(
                    com.clickandbuy.api.soap.axis2.stub.CreditRequestResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from creditRequest operation
           */
            public void receiveErrorcreditRequest(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getBatchStatus method
            * override this method for handling normal response from getBatchStatus operation
            */
           public void receiveResultgetBatchStatus(
                    com.clickandbuy.api.soap.axis2.stub.GetBatchStatusResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getBatchStatus operation
           */
            public void receiveErrorgetBatchStatus(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for cancelBatch method
            * override this method for handling normal response from cancelBatch operation
            */
           public void receiveResultcancelBatch(
                    com.clickandbuy.api.soap.axis2.stub.CancelBatchResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from cancelBatch operation
           */
            public void receiveErrorcancelBatch(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for statusRequest method
            * override this method for handling normal response from statusRequest operation
            */
           public void receiveResultstatusRequest(
                    com.clickandbuy.api.soap.axis2.stub.StatusRequestResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from statusRequest operation
           */
            public void receiveErrorstatusRequest(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for payRequest method
            * override this method for handling normal response from payRequest operation
            */
           public void receiveResultpayRequest(
                    com.clickandbuy.api.soap.axis2.stub.PayRequestResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from payRequest operation
           */
            public void receiveErrorpayRequest(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for refundRequest method
            * override this method for handling normal response from refundRequest operation
            */
           public void receiveResultrefundRequest(
                    com.clickandbuy.api.soap.axis2.stub.RefundRequestResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from refundRequest operation
           */
            public void receiveErrorrefundRequest(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for executeBatch method
            * override this method for handling normal response from executeBatch operation
            */
           public void receiveResultexecuteBatch(
                    com.clickandbuy.api.soap.axis2.stub.ExecuteBatchResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from executeBatch operation
           */
            public void receiveErrorexecuteBatch(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for cancelRequest method
            * override this method for handling normal response from cancelRequest operation
            */
           public void receiveResultcancelRequest(
                    com.clickandbuy.api.soap.axis2.stub.CancelRequestResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from cancelRequest operation
           */
            public void receiveErrorcancelRequest(java.lang.Exception e) {
            }
                


    }
    