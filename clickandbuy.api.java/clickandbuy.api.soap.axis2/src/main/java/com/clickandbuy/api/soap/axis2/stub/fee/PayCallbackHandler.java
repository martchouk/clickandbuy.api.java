
/**
 * PayCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.clickandbuy.api.soap.axis2.stub.fee;

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
            * auto generated Axis2 call back method for getFeeCardAverageTicketSizes method
            * override this method for handling normal response from getFeeCardAverageTicketSizes operation
            */
           public void receiveResultgetFeeCardAverageTicketSizes(
                    com.clickandbuy.api.soap.axis2.stub.GetFeeCardAverageTicketSizesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getFeeCardAverageTicketSizes operation
           */
            public void receiveErrorgetFeeCardAverageTicketSizes(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getFeeCardCategories method
            * override this method for handling normal response from getFeeCardCategories operation
            */
           public void receiveResultgetFeeCardCategories(
                    com.clickandbuy.api.soap.axis2.stub.GetFeeCardCategoriesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getFeeCardCategories operation
           */
            public void receiveErrorgetFeeCardCategories(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getFeeCardSettlementDelays method
            * override this method for handling normal response from getFeeCardSettlementDelays operation
            */
           public void receiveResultgetFeeCardSettlementDelays(
                    com.clickandbuy.api.soap.axis2.stub.GetFeeCardSettlementDelaysResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getFeeCardSettlementDelays operation
           */
            public void receiveErrorgetFeeCardSettlementDelays(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getFeeCardInvoicingCycles method
            * override this method for handling normal response from getFeeCardInvoicingCycles operation
            */
           public void receiveResultgetFeeCardInvoicingCycles(
                    com.clickandbuy.api.soap.axis2.stub.GetFeeCardInvoicingCyclesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getFeeCardInvoicingCycles operation
           */
            public void receiveErrorgetFeeCardInvoicingCycles(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getFeeCardCurrencies method
            * override this method for handling normal response from getFeeCardCurrencies operation
            */
           public void receiveResultgetFeeCardCurrencies(
                    com.clickandbuy.api.soap.axis2.stub.GetFeeCardCurrenciesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getFeeCardCurrencies operation
           */
            public void receiveErrorgetFeeCardCurrencies(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getFeeCard method
            * override this method for handling normal response from getFeeCard operation
            */
           public void receiveResultgetFeeCard(
                    com.clickandbuy.api.soap.axis2.stub.GetFeeCardResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getFeeCard operation
           */
            public void receiveErrorgetFeeCard(java.lang.Exception e) {
            }
                


    }
    