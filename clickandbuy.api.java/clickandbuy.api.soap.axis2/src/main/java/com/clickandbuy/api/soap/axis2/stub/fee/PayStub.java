
/**
 * PayStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
        package com.clickandbuy.api.soap.axis2.stub.fee;

        

        /*
        *  PayStub java implementation
        */

        
        public class PayStub extends org.apache.axis2.client.Stub
        {
        protected org.apache.axis2.description.AxisOperation[] _operations;

        //hashmaps to keep the fault mapping
        private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
        private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
        private java.util.HashMap faultMessageMap = new java.util.HashMap();

        private static int counter = 0;

        private static synchronized java.lang.String getUniqueSuffix(){
            // reset the counter if it is greater than 99999
            if (counter > 99999){
                counter = 0;
            }
            counter = counter + 1; 
            return java.lang.Long.toString(java.lang.System.currentTimeMillis()) + "_" + counter;
        }

    
    private void populateAxisService() throws org.apache.axis2.AxisFault {

     //creating the Service with a unique name
     _service = new org.apache.axis2.description.AxisService("Pay" + getUniqueSuffix());
     addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[6];
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/", "getFeeCardAverageTicketSizes"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[0]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/", "getFeeCardCategories"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[1]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/", "getFeeCardSettlementDelays"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[2]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/", "getFeeCardInvoicingCycles"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[3]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/", "getFeeCardCurrencies"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[4]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/", "getFeeCard"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[5]=__operation;
            
        
        }

    //populates the faults
    private void populateFaults(){
         
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/","errorDetails"), "getFeeCardAverageTicketSizes"),"com.clickandbuy.api.soap.axis2.stub.fee.ErrorDetailsException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/","errorDetails"), "getFeeCardAverageTicketSizes"),"com.clickandbuy.api.soap.axis2.stub.fee.ErrorDetailsException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/","errorDetails"), "getFeeCardAverageTicketSizes"),"com.clickandbuy.api.soap.axis2.stub.ErrorDetails");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/","errorDetails"), "getFeeCardCategories"),"com.clickandbuy.api.soap.axis2.stub.fee.ErrorDetailsException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/","errorDetails"), "getFeeCardCategories"),"com.clickandbuy.api.soap.axis2.stub.fee.ErrorDetailsException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/","errorDetails"), "getFeeCardCategories"),"com.clickandbuy.api.soap.axis2.stub.ErrorDetails");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/","errorDetails"), "getFeeCardSettlementDelays"),"com.clickandbuy.api.soap.axis2.stub.fee.ErrorDetailsException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/","errorDetails"), "getFeeCardSettlementDelays"),"com.clickandbuy.api.soap.axis2.stub.fee.ErrorDetailsException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/","errorDetails"), "getFeeCardSettlementDelays"),"com.clickandbuy.api.soap.axis2.stub.ErrorDetails");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/","errorDetails"), "getFeeCardInvoicingCycles"),"com.clickandbuy.api.soap.axis2.stub.fee.ErrorDetailsException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/","errorDetails"), "getFeeCardInvoicingCycles"),"com.clickandbuy.api.soap.axis2.stub.fee.ErrorDetailsException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/","errorDetails"), "getFeeCardInvoicingCycles"),"com.clickandbuy.api.soap.axis2.stub.ErrorDetails");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/","errorDetails"), "getFeeCardCurrencies"),"com.clickandbuy.api.soap.axis2.stub.fee.ErrorDetailsException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/","errorDetails"), "getFeeCardCurrencies"),"com.clickandbuy.api.soap.axis2.stub.fee.ErrorDetailsException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/","errorDetails"), "getFeeCardCurrencies"),"com.clickandbuy.api.soap.axis2.stub.ErrorDetails");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/","errorDetails"), "getFeeCard"),"com.clickandbuy.api.soap.axis2.stub.fee.ErrorDetailsException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/","errorDetails"), "getFeeCard"),"com.clickandbuy.api.soap.axis2.stub.fee.ErrorDetailsException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/","errorDetails"), "getFeeCard"),"com.clickandbuy.api.soap.axis2.stub.ErrorDetails");
           


    }

    /**
      *Constructor that takes in a configContext
      */

    public PayStub(org.apache.axis2.context.ConfigurationContext configurationContext,
       java.lang.String targetEndpoint)
       throws org.apache.axis2.AxisFault {
         this(configurationContext,targetEndpoint,false);
   }


   /**
     * Constructor that takes in a configContext  and useseperate listner
     */
   public PayStub(org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint, boolean useSeparateListener)
        throws org.apache.axis2.AxisFault {
         //To populate AxisService
         populateAxisService();
         populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext,_service);
        
	
        _serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(
                targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);
        
    
    }

    /**
     * Default Constructor
     */
    public PayStub(org.apache.axis2.context.ConfigurationContext configurationContext) throws org.apache.axis2.AxisFault {
        
                    this(configurationContext,"https://api.clickandbuy.com/webservices/soap/pay_1_1_0/" );
                
    }

    /**
     * Default Constructor
     */
    public PayStub() throws org.apache.axis2.AxisFault {
        
                    this("https://api.clickandbuy.com/webservices/soap/pay_1_1_0/" );
                
    }

    /**
     * Constructor taking the target endpoint
     */
    public PayStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(null,targetEndpoint);
    }



        
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.clickandbuy.api.soap.axis2.stub.fee.Pay#getFeeCardAverageTicketSizes
                     * @param getFeeCardAverageTicketSizes_Request0
                    
                     * @throws com.clickandbuy.api.soap.axis2.stub.fee.ErrorDetailsException : 
                     */

                    

                            public  com.clickandbuy.api.soap.axis2.stub.GetFeeCardAverageTicketSizesResponse getFeeCardAverageTicketSizes(

                            com.clickandbuy.api.soap.axis2.stub.GetFeeCardAverageTicketSizesRequest getFeeCardAverageTicketSizes_Request0)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.clickandbuy.api.soap.axis2.stub.fee.ErrorDetailsException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
              _operationClient.getOptions().setAction("urn:getFeeCardAverageTicketSizes");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getFeeCardAverageTicketSizes_Request0,
                                                    optimizeContent(new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/",
                                                    "getFeeCardAverageTicketSizes")), new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/",
                                                    "getFeeCardAverageTicketSizes"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.clickandbuy.api.soap.axis2.stub.GetFeeCardAverageTicketSizesResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.clickandbuy.api.soap.axis2.stub.GetFeeCardAverageTicketSizesResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getFeeCardAverageTicketSizes"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getFeeCardAverageTicketSizes"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getFeeCardAverageTicketSizes"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.clickandbuy.api.soap.axis2.stub.fee.ErrorDetailsException){
                          throw (com.clickandbuy.api.soap.axis2.stub.fee.ErrorDetailsException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.clickandbuy.api.soap.axis2.stub.fee.Pay#startgetFeeCardAverageTicketSizes
                    * @param getFeeCardAverageTicketSizes_Request0
                
                */
                public  void startgetFeeCardAverageTicketSizes(

                 com.clickandbuy.api.soap.axis2.stub.GetFeeCardAverageTicketSizesRequest getFeeCardAverageTicketSizes_Request0,

                  final com.clickandbuy.api.soap.axis2.stub.fee.PayCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
             _operationClient.getOptions().setAction("urn:getFeeCardAverageTicketSizes");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getFeeCardAverageTicketSizes_Request0,
                                                    optimizeContent(new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/",
                                                    "getFeeCardAverageTicketSizes")), new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/",
                                                    "getFeeCardAverageTicketSizes"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.clickandbuy.api.soap.axis2.stub.GetFeeCardAverageTicketSizesResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetFeeCardAverageTicketSizes(
                                        (com.clickandbuy.api.soap.axis2.stub.GetFeeCardAverageTicketSizesResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetFeeCardAverageTicketSizes(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getFeeCardAverageTicketSizes"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getFeeCardAverageTicketSizes"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getFeeCardAverageTicketSizes"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.clickandbuy.api.soap.axis2.stub.fee.ErrorDetailsException){
														callback.receiveErrorgetFeeCardAverageTicketSizes((com.clickandbuy.api.soap.axis2.stub.fee.ErrorDetailsException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetFeeCardAverageTicketSizes(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetFeeCardAverageTicketSizes(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetFeeCardAverageTicketSizes(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetFeeCardAverageTicketSizes(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetFeeCardAverageTicketSizes(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetFeeCardAverageTicketSizes(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetFeeCardAverageTicketSizes(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetFeeCardAverageTicketSizes(f);
                                            }
									    } else {
										    callback.receiveErrorgetFeeCardAverageTicketSizes(f);
									    }
									} else {
									    callback.receiveErrorgetFeeCardAverageTicketSizes(f);
									}
								} else {
								    callback.receiveErrorgetFeeCardAverageTicketSizes(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetFeeCardAverageTicketSizes(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[0].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[0].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.clickandbuy.api.soap.axis2.stub.fee.Pay#getFeeCardCategories
                     * @param getFeeCardCategories_Request2
                    
                     * @throws com.clickandbuy.api.soap.axis2.stub.fee.ErrorDetailsException : 
                     */

                    

                            public  com.clickandbuy.api.soap.axis2.stub.GetFeeCardCategoriesResponse getFeeCardCategories(

                            com.clickandbuy.api.soap.axis2.stub.GetFeeCardCategoriesRequest getFeeCardCategories_Request2)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.clickandbuy.api.soap.axis2.stub.fee.ErrorDetailsException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
              _operationClient.getOptions().setAction("urn:getFeeCardCategories");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getFeeCardCategories_Request2,
                                                    optimizeContent(new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/",
                                                    "getFeeCardCategories")), new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/",
                                                    "getFeeCardCategories"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.clickandbuy.api.soap.axis2.stub.GetFeeCardCategoriesResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.clickandbuy.api.soap.axis2.stub.GetFeeCardCategoriesResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getFeeCardCategories"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getFeeCardCategories"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getFeeCardCategories"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.clickandbuy.api.soap.axis2.stub.fee.ErrorDetailsException){
                          throw (com.clickandbuy.api.soap.axis2.stub.fee.ErrorDetailsException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.clickandbuy.api.soap.axis2.stub.fee.Pay#startgetFeeCardCategories
                    * @param getFeeCardCategories_Request2
                
                */
                public  void startgetFeeCardCategories(

                 com.clickandbuy.api.soap.axis2.stub.GetFeeCardCategoriesRequest getFeeCardCategories_Request2,

                  final com.clickandbuy.api.soap.axis2.stub.fee.PayCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
             _operationClient.getOptions().setAction("urn:getFeeCardCategories");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getFeeCardCategories_Request2,
                                                    optimizeContent(new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/",
                                                    "getFeeCardCategories")), new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/",
                                                    "getFeeCardCategories"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.clickandbuy.api.soap.axis2.stub.GetFeeCardCategoriesResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetFeeCardCategories(
                                        (com.clickandbuy.api.soap.axis2.stub.GetFeeCardCategoriesResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetFeeCardCategories(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getFeeCardCategories"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getFeeCardCategories"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getFeeCardCategories"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.clickandbuy.api.soap.axis2.stub.fee.ErrorDetailsException){
														callback.receiveErrorgetFeeCardCategories((com.clickandbuy.api.soap.axis2.stub.fee.ErrorDetailsException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetFeeCardCategories(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetFeeCardCategories(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetFeeCardCategories(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetFeeCardCategories(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetFeeCardCategories(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetFeeCardCategories(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetFeeCardCategories(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetFeeCardCategories(f);
                                            }
									    } else {
										    callback.receiveErrorgetFeeCardCategories(f);
									    }
									} else {
									    callback.receiveErrorgetFeeCardCategories(f);
									}
								} else {
								    callback.receiveErrorgetFeeCardCategories(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetFeeCardCategories(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[1].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[1].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.clickandbuy.api.soap.axis2.stub.fee.Pay#getFeeCardSettlementDelays
                     * @param getFeeCardSettlementDelays_Request4
                    
                     * @throws com.clickandbuy.api.soap.axis2.stub.fee.ErrorDetailsException : 
                     */

                    

                            public  com.clickandbuy.api.soap.axis2.stub.GetFeeCardSettlementDelaysResponse getFeeCardSettlementDelays(

                            com.clickandbuy.api.soap.axis2.stub.GetFeeCardSettlementDelaysRequest getFeeCardSettlementDelays_Request4)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.clickandbuy.api.soap.axis2.stub.fee.ErrorDetailsException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
              _operationClient.getOptions().setAction("urn:getFeeCardSettlementDelays");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getFeeCardSettlementDelays_Request4,
                                                    optimizeContent(new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/",
                                                    "getFeeCardSettlementDelays")), new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/",
                                                    "getFeeCardSettlementDelays"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.clickandbuy.api.soap.axis2.stub.GetFeeCardSettlementDelaysResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.clickandbuy.api.soap.axis2.stub.GetFeeCardSettlementDelaysResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getFeeCardSettlementDelays"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getFeeCardSettlementDelays"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getFeeCardSettlementDelays"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.clickandbuy.api.soap.axis2.stub.fee.ErrorDetailsException){
                          throw (com.clickandbuy.api.soap.axis2.stub.fee.ErrorDetailsException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.clickandbuy.api.soap.axis2.stub.fee.Pay#startgetFeeCardSettlementDelays
                    * @param getFeeCardSettlementDelays_Request4
                
                */
                public  void startgetFeeCardSettlementDelays(

                 com.clickandbuy.api.soap.axis2.stub.GetFeeCardSettlementDelaysRequest getFeeCardSettlementDelays_Request4,

                  final com.clickandbuy.api.soap.axis2.stub.fee.PayCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
             _operationClient.getOptions().setAction("urn:getFeeCardSettlementDelays");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getFeeCardSettlementDelays_Request4,
                                                    optimizeContent(new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/",
                                                    "getFeeCardSettlementDelays")), new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/",
                                                    "getFeeCardSettlementDelays"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.clickandbuy.api.soap.axis2.stub.GetFeeCardSettlementDelaysResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetFeeCardSettlementDelays(
                                        (com.clickandbuy.api.soap.axis2.stub.GetFeeCardSettlementDelaysResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetFeeCardSettlementDelays(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getFeeCardSettlementDelays"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getFeeCardSettlementDelays"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getFeeCardSettlementDelays"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.clickandbuy.api.soap.axis2.stub.fee.ErrorDetailsException){
														callback.receiveErrorgetFeeCardSettlementDelays((com.clickandbuy.api.soap.axis2.stub.fee.ErrorDetailsException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetFeeCardSettlementDelays(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetFeeCardSettlementDelays(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetFeeCardSettlementDelays(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetFeeCardSettlementDelays(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetFeeCardSettlementDelays(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetFeeCardSettlementDelays(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetFeeCardSettlementDelays(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetFeeCardSettlementDelays(f);
                                            }
									    } else {
										    callback.receiveErrorgetFeeCardSettlementDelays(f);
									    }
									} else {
									    callback.receiveErrorgetFeeCardSettlementDelays(f);
									}
								} else {
								    callback.receiveErrorgetFeeCardSettlementDelays(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetFeeCardSettlementDelays(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[2].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[2].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.clickandbuy.api.soap.axis2.stub.fee.Pay#getFeeCardInvoicingCycles
                     * @param getFeeCardInvoicingCycles_Request6
                    
                     * @throws com.clickandbuy.api.soap.axis2.stub.fee.ErrorDetailsException : 
                     */

                    

                            public  com.clickandbuy.api.soap.axis2.stub.GetFeeCardInvoicingCyclesResponse getFeeCardInvoicingCycles(

                            com.clickandbuy.api.soap.axis2.stub.GetFeeCardInvoicingCyclesRequest getFeeCardInvoicingCycles_Request6)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.clickandbuy.api.soap.axis2.stub.fee.ErrorDetailsException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
              _operationClient.getOptions().setAction("urn:getFeeCardInvoicingCycles");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getFeeCardInvoicingCycles_Request6,
                                                    optimizeContent(new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/",
                                                    "getFeeCardInvoicingCycles")), new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/",
                                                    "getFeeCardInvoicingCycles"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.clickandbuy.api.soap.axis2.stub.GetFeeCardInvoicingCyclesResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.clickandbuy.api.soap.axis2.stub.GetFeeCardInvoicingCyclesResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getFeeCardInvoicingCycles"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getFeeCardInvoicingCycles"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getFeeCardInvoicingCycles"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.clickandbuy.api.soap.axis2.stub.fee.ErrorDetailsException){
                          throw (com.clickandbuy.api.soap.axis2.stub.fee.ErrorDetailsException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.clickandbuy.api.soap.axis2.stub.fee.Pay#startgetFeeCardInvoicingCycles
                    * @param getFeeCardInvoicingCycles_Request6
                
                */
                public  void startgetFeeCardInvoicingCycles(

                 com.clickandbuy.api.soap.axis2.stub.GetFeeCardInvoicingCyclesRequest getFeeCardInvoicingCycles_Request6,

                  final com.clickandbuy.api.soap.axis2.stub.fee.PayCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
             _operationClient.getOptions().setAction("urn:getFeeCardInvoicingCycles");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getFeeCardInvoicingCycles_Request6,
                                                    optimizeContent(new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/",
                                                    "getFeeCardInvoicingCycles")), new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/",
                                                    "getFeeCardInvoicingCycles"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.clickandbuy.api.soap.axis2.stub.GetFeeCardInvoicingCyclesResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetFeeCardInvoicingCycles(
                                        (com.clickandbuy.api.soap.axis2.stub.GetFeeCardInvoicingCyclesResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetFeeCardInvoicingCycles(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getFeeCardInvoicingCycles"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getFeeCardInvoicingCycles"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getFeeCardInvoicingCycles"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.clickandbuy.api.soap.axis2.stub.fee.ErrorDetailsException){
														callback.receiveErrorgetFeeCardInvoicingCycles((com.clickandbuy.api.soap.axis2.stub.fee.ErrorDetailsException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetFeeCardInvoicingCycles(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetFeeCardInvoicingCycles(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetFeeCardInvoicingCycles(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetFeeCardInvoicingCycles(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetFeeCardInvoicingCycles(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetFeeCardInvoicingCycles(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetFeeCardInvoicingCycles(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetFeeCardInvoicingCycles(f);
                                            }
									    } else {
										    callback.receiveErrorgetFeeCardInvoicingCycles(f);
									    }
									} else {
									    callback.receiveErrorgetFeeCardInvoicingCycles(f);
									}
								} else {
								    callback.receiveErrorgetFeeCardInvoicingCycles(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetFeeCardInvoicingCycles(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[3].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[3].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.clickandbuy.api.soap.axis2.stub.fee.Pay#getFeeCardCurrencies
                     * @param getFeeCardCurrencies_Request8
                    
                     * @throws com.clickandbuy.api.soap.axis2.stub.fee.ErrorDetailsException : 
                     */

                    

                            public  com.clickandbuy.api.soap.axis2.stub.GetFeeCardCurrenciesResponse getFeeCardCurrencies(

                            com.clickandbuy.api.soap.axis2.stub.GetFeeCardCurrenciesRequest getFeeCardCurrencies_Request8)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.clickandbuy.api.soap.axis2.stub.fee.ErrorDetailsException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
              _operationClient.getOptions().setAction("urn:getFeeCardCurrencies");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getFeeCardCurrencies_Request8,
                                                    optimizeContent(new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/",
                                                    "getFeeCardCurrencies")), new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/",
                                                    "getFeeCardCurrencies"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.clickandbuy.api.soap.axis2.stub.GetFeeCardCurrenciesResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.clickandbuy.api.soap.axis2.stub.GetFeeCardCurrenciesResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getFeeCardCurrencies"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getFeeCardCurrencies"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getFeeCardCurrencies"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.clickandbuy.api.soap.axis2.stub.fee.ErrorDetailsException){
                          throw (com.clickandbuy.api.soap.axis2.stub.fee.ErrorDetailsException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.clickandbuy.api.soap.axis2.stub.fee.Pay#startgetFeeCardCurrencies
                    * @param getFeeCardCurrencies_Request8
                
                */
                public  void startgetFeeCardCurrencies(

                 com.clickandbuy.api.soap.axis2.stub.GetFeeCardCurrenciesRequest getFeeCardCurrencies_Request8,

                  final com.clickandbuy.api.soap.axis2.stub.fee.PayCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
             _operationClient.getOptions().setAction("urn:getFeeCardCurrencies");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getFeeCardCurrencies_Request8,
                                                    optimizeContent(new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/",
                                                    "getFeeCardCurrencies")), new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/",
                                                    "getFeeCardCurrencies"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.clickandbuy.api.soap.axis2.stub.GetFeeCardCurrenciesResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetFeeCardCurrencies(
                                        (com.clickandbuy.api.soap.axis2.stub.GetFeeCardCurrenciesResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetFeeCardCurrencies(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getFeeCardCurrencies"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getFeeCardCurrencies"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getFeeCardCurrencies"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.clickandbuy.api.soap.axis2.stub.fee.ErrorDetailsException){
														callback.receiveErrorgetFeeCardCurrencies((com.clickandbuy.api.soap.axis2.stub.fee.ErrorDetailsException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetFeeCardCurrencies(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetFeeCardCurrencies(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetFeeCardCurrencies(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetFeeCardCurrencies(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetFeeCardCurrencies(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetFeeCardCurrencies(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetFeeCardCurrencies(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetFeeCardCurrencies(f);
                                            }
									    } else {
										    callback.receiveErrorgetFeeCardCurrencies(f);
									    }
									} else {
									    callback.receiveErrorgetFeeCardCurrencies(f);
									}
								} else {
								    callback.receiveErrorgetFeeCardCurrencies(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetFeeCardCurrencies(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[4].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[4].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.clickandbuy.api.soap.axis2.stub.fee.Pay#getFeeCard
                     * @param getFeeCard_Request10
                    
                     * @throws com.clickandbuy.api.soap.axis2.stub.fee.ErrorDetailsException : 
                     */

                    

                            public  com.clickandbuy.api.soap.axis2.stub.GetFeeCardResponse getFeeCard(

                            com.clickandbuy.api.soap.axis2.stub.GetFeeCardRequest getFeeCard_Request10)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.clickandbuy.api.soap.axis2.stub.fee.ErrorDetailsException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
              _operationClient.getOptions().setAction("urn:getFeeCard");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getFeeCard_Request10,
                                                    optimizeContent(new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/",
                                                    "getFeeCard")), new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/",
                                                    "getFeeCard"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.clickandbuy.api.soap.axis2.stub.GetFeeCardResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.clickandbuy.api.soap.axis2.stub.GetFeeCardResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getFeeCard"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getFeeCard"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getFeeCard"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.clickandbuy.api.soap.axis2.stub.fee.ErrorDetailsException){
                          throw (com.clickandbuy.api.soap.axis2.stub.fee.ErrorDetailsException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.clickandbuy.api.soap.axis2.stub.fee.Pay#startgetFeeCard
                    * @param getFeeCard_Request10
                
                */
                public  void startgetFeeCard(

                 com.clickandbuy.api.soap.axis2.stub.GetFeeCardRequest getFeeCard_Request10,

                  final com.clickandbuy.api.soap.axis2.stub.fee.PayCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
             _operationClient.getOptions().setAction("urn:getFeeCard");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getFeeCard_Request10,
                                                    optimizeContent(new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/",
                                                    "getFeeCard")), new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/",
                                                    "getFeeCard"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.clickandbuy.api.soap.axis2.stub.GetFeeCardResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetFeeCard(
                                        (com.clickandbuy.api.soap.axis2.stub.GetFeeCardResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetFeeCard(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getFeeCard"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getFeeCard"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getFeeCard"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.clickandbuy.api.soap.axis2.stub.fee.ErrorDetailsException){
														callback.receiveErrorgetFeeCard((com.clickandbuy.api.soap.axis2.stub.fee.ErrorDetailsException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetFeeCard(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetFeeCard(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetFeeCard(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetFeeCard(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetFeeCard(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetFeeCard(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetFeeCard(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetFeeCard(f);
                                            }
									    } else {
										    callback.receiveErrorgetFeeCard(f);
									    }
									} else {
									    callback.receiveErrorgetFeeCard(f);
									}
								} else {
								    callback.receiveErrorgetFeeCard(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetFeeCard(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[5].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[5].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                


       /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
       private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
            org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
            returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
       return returnMap;
    }

    
    
    private javax.xml.namespace.QName[] opNameArray = null;
    private boolean optimizeContent(javax.xml.namespace.QName opName) {
        

        if (opNameArray == null) {
            return false;
        }
        for (int i = 0; i < opNameArray.length; i++) {
            if (opName.equals(opNameArray[i])) {
                return true;   
            }
        }
        return false;
    }
     //https://api.clickandbuy.com/webservices/soap/pay_1_1_0/
            private static javax.xml.namespace.QName[] qNameArray = {
            
            };
        
        
        private static final javax.xml.bind.JAXBContext wsContext;
        static {
            javax.xml.bind.JAXBContext jc;
            jc = null;
            try {
				jc = javax.xml.bind.JAXBContext.newInstance(
            com.clickandbuy.api.soap.axis2.stub.GetFeeCardAverageTicketSizesRequest.class,
                        com.clickandbuy.api.soap.axis2.stub.GetFeeCardAverageTicketSizesResponse.class,
                        com.clickandbuy.api.soap.axis2.stub.ErrorDetails.class,
                        com.clickandbuy.api.soap.axis2.stub.GetFeeCardCategoriesRequest.class,
                        com.clickandbuy.api.soap.axis2.stub.GetFeeCardCategoriesResponse.class,
                        com.clickandbuy.api.soap.axis2.stub.GetFeeCardSettlementDelaysRequest.class,
                        com.clickandbuy.api.soap.axis2.stub.GetFeeCardSettlementDelaysResponse.class,
                        com.clickandbuy.api.soap.axis2.stub.GetFeeCardInvoicingCyclesRequest.class,
                        com.clickandbuy.api.soap.axis2.stub.GetFeeCardInvoicingCyclesResponse.class,
                        com.clickandbuy.api.soap.axis2.stub.GetFeeCardCurrenciesRequest.class,
                        com.clickandbuy.api.soap.axis2.stub.GetFeeCardCurrenciesResponse.class,
                        com.clickandbuy.api.soap.axis2.stub.GetFeeCardRequest.class,
                        com.clickandbuy.api.soap.axis2.stub.GetFeeCardResponse.class
				);
            }
            catch ( javax.xml.bind.JAXBException ex ) {
                System.err.println("Unable to create JAXBContext: " + ex.getMessage());
                ex.printStackTrace(System.err);
                Runtime.getRuntime().exit(-1);
            }
            finally {
                wsContext = jc;
			}
        }

        

                private org.apache.axiom.om.OMElement toOM(com.clickandbuy.api.soap.axis2.stub.GetFeeCardAverageTicketSizesRequest param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( com.clickandbuy.api.soap.axis2.stub.GetFeeCardAverageTicketSizesRequest.class,
                                                                        param,
                                                                        marshaller,
                                                                        methodQName.getNamespaceURI(),
                                                                        methodQName.getLocalPart());
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(),
                                                                           null);
                        return factory.createOMElement(source, methodQName.getLocalPart(), namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.om.OMElement toOM(com.clickandbuy.api.soap.axis2.stub.GetFeeCardAverageTicketSizesRequest param, boolean optimizeContent)
                    throws org.apache.axis2.AxisFault {
                        try {
                            javax.xml.bind.JAXBContext context = wsContext;
                            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                            JaxbRIDataSource source = new JaxbRIDataSource( com.clickandbuy.api.soap.axis2.stub.GetFeeCardAverageTicketSizesRequest.class,
                                                                            param,
                                                                            marshaller,
                                                                            "http://api.clickandbuy.com/webservices/pay_1_1_0/",
                                                                            "getFeeCardAverageTicketSizes_Request");
                            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://api.clickandbuy.com/webservices/pay_1_1_0/", null);
                            return factory.createOMElement(source, "getFeeCardAverageTicketSizes_Request", namespace);
                        } catch (javax.xml.bind.JAXBException bex){
                            throw org.apache.axis2.AxisFault.makeFault(bex);
                        }
                    }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.clickandbuy.api.soap.axis2.stub.GetFeeCardAverageTicketSizesRequest param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(com.clickandbuy.api.soap.axis2.stub.GetFeeCardAverageTicketSizesResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( com.clickandbuy.api.soap.axis2.stub.GetFeeCardAverageTicketSizesResponse.class,
                                                                        param,
                                                                        marshaller,
                                                                        methodQName.getNamespaceURI(),
                                                                        methodQName.getLocalPart());
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(),
                                                                           null);
                        return factory.createOMElement(source, methodQName.getLocalPart(), namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.om.OMElement toOM(com.clickandbuy.api.soap.axis2.stub.GetFeeCardAverageTicketSizesResponse param, boolean optimizeContent)
                    throws org.apache.axis2.AxisFault {
                        try {
                            javax.xml.bind.JAXBContext context = wsContext;
                            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                            JaxbRIDataSource source = new JaxbRIDataSource( com.clickandbuy.api.soap.axis2.stub.GetFeeCardAverageTicketSizesResponse.class,
                                                                            param,
                                                                            marshaller,
                                                                            "http://api.clickandbuy.com/webservices/pay_1_1_0/",
                                                                            "getFeeCardAverageTicketSizes_Response");
                            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://api.clickandbuy.com/webservices/pay_1_1_0/", null);
                            return factory.createOMElement(source, "getFeeCardAverageTicketSizes_Response", namespace);
                        } catch (javax.xml.bind.JAXBException bex){
                            throw org.apache.axis2.AxisFault.makeFault(bex);
                        }
                    }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.clickandbuy.api.soap.axis2.stub.GetFeeCardAverageTicketSizesResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(com.clickandbuy.api.soap.axis2.stub.ErrorDetails param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( com.clickandbuy.api.soap.axis2.stub.ErrorDetails.class,
                                                                        param,
                                                                        marshaller,
                                                                        methodQName.getNamespaceURI(),
                                                                        methodQName.getLocalPart());
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(),
                                                                           null);
                        return factory.createOMElement(source, methodQName.getLocalPart(), namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.om.OMElement toOM(com.clickandbuy.api.soap.axis2.stub.ErrorDetails param, boolean optimizeContent)
                    throws org.apache.axis2.AxisFault {
                        try {
                            javax.xml.bind.JAXBContext context = wsContext;
                            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                            JaxbRIDataSource source = new JaxbRIDataSource( com.clickandbuy.api.soap.axis2.stub.ErrorDetails.class,
                                                                            param,
                                                                            marshaller,
                                                                            "http://api.clickandbuy.com/webservices/pay_1_1_0/",
                                                                            "errorDetails");
                            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://api.clickandbuy.com/webservices/pay_1_1_0/", null);
                            return factory.createOMElement(source, "errorDetails", namespace);
                        } catch (javax.xml.bind.JAXBException bex){
                            throw org.apache.axis2.AxisFault.makeFault(bex);
                        }
                    }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.clickandbuy.api.soap.axis2.stub.ErrorDetails param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(com.clickandbuy.api.soap.axis2.stub.GetFeeCardCategoriesRequest param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( com.clickandbuy.api.soap.axis2.stub.GetFeeCardCategoriesRequest.class,
                                                                        param,
                                                                        marshaller,
                                                                        methodQName.getNamespaceURI(),
                                                                        methodQName.getLocalPart());
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(),
                                                                           null);
                        return factory.createOMElement(source, methodQName.getLocalPart(), namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.om.OMElement toOM(com.clickandbuy.api.soap.axis2.stub.GetFeeCardCategoriesRequest param, boolean optimizeContent)
                    throws org.apache.axis2.AxisFault {
                        try {
                            javax.xml.bind.JAXBContext context = wsContext;
                            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                            JaxbRIDataSource source = new JaxbRIDataSource( com.clickandbuy.api.soap.axis2.stub.GetFeeCardCategoriesRequest.class,
                                                                            param,
                                                                            marshaller,
                                                                            "http://api.clickandbuy.com/webservices/pay_1_1_0/",
                                                                            "getFeeCardCategories_Request");
                            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://api.clickandbuy.com/webservices/pay_1_1_0/", null);
                            return factory.createOMElement(source, "getFeeCardCategories_Request", namespace);
                        } catch (javax.xml.bind.JAXBException bex){
                            throw org.apache.axis2.AxisFault.makeFault(bex);
                        }
                    }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.clickandbuy.api.soap.axis2.stub.GetFeeCardCategoriesRequest param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(com.clickandbuy.api.soap.axis2.stub.GetFeeCardCategoriesResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( com.clickandbuy.api.soap.axis2.stub.GetFeeCardCategoriesResponse.class,
                                                                        param,
                                                                        marshaller,
                                                                        methodQName.getNamespaceURI(),
                                                                        methodQName.getLocalPart());
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(),
                                                                           null);
                        return factory.createOMElement(source, methodQName.getLocalPart(), namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.om.OMElement toOM(com.clickandbuy.api.soap.axis2.stub.GetFeeCardCategoriesResponse param, boolean optimizeContent)
                    throws org.apache.axis2.AxisFault {
                        try {
                            javax.xml.bind.JAXBContext context = wsContext;
                            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                            JaxbRIDataSource source = new JaxbRIDataSource( com.clickandbuy.api.soap.axis2.stub.GetFeeCardCategoriesResponse.class,
                                                                            param,
                                                                            marshaller,
                                                                            "http://api.clickandbuy.com/webservices/pay_1_1_0/",
                                                                            "getFeeCardCategories_Response");
                            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://api.clickandbuy.com/webservices/pay_1_1_0/", null);
                            return factory.createOMElement(source, "getFeeCardCategories_Response", namespace);
                        } catch (javax.xml.bind.JAXBException bex){
                            throw org.apache.axis2.AxisFault.makeFault(bex);
                        }
                    }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.clickandbuy.api.soap.axis2.stub.GetFeeCardCategoriesResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(com.clickandbuy.api.soap.axis2.stub.GetFeeCardSettlementDelaysRequest param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( com.clickandbuy.api.soap.axis2.stub.GetFeeCardSettlementDelaysRequest.class,
                                                                        param,
                                                                        marshaller,
                                                                        methodQName.getNamespaceURI(),
                                                                        methodQName.getLocalPart());
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(),
                                                                           null);
                        return factory.createOMElement(source, methodQName.getLocalPart(), namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.om.OMElement toOM(com.clickandbuy.api.soap.axis2.stub.GetFeeCardSettlementDelaysRequest param, boolean optimizeContent)
                    throws org.apache.axis2.AxisFault {
                        try {
                            javax.xml.bind.JAXBContext context = wsContext;
                            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                            JaxbRIDataSource source = new JaxbRIDataSource( com.clickandbuy.api.soap.axis2.stub.GetFeeCardSettlementDelaysRequest.class,
                                                                            param,
                                                                            marshaller,
                                                                            "http://api.clickandbuy.com/webservices/pay_1_1_0/",
                                                                            "getFeeCardSettlementDelays_Request");
                            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://api.clickandbuy.com/webservices/pay_1_1_0/", null);
                            return factory.createOMElement(source, "getFeeCardSettlementDelays_Request", namespace);
                        } catch (javax.xml.bind.JAXBException bex){
                            throw org.apache.axis2.AxisFault.makeFault(bex);
                        }
                    }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.clickandbuy.api.soap.axis2.stub.GetFeeCardSettlementDelaysRequest param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(com.clickandbuy.api.soap.axis2.stub.GetFeeCardSettlementDelaysResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( com.clickandbuy.api.soap.axis2.stub.GetFeeCardSettlementDelaysResponse.class,
                                                                        param,
                                                                        marshaller,
                                                                        methodQName.getNamespaceURI(),
                                                                        methodQName.getLocalPart());
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(),
                                                                           null);
                        return factory.createOMElement(source, methodQName.getLocalPart(), namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.om.OMElement toOM(com.clickandbuy.api.soap.axis2.stub.GetFeeCardSettlementDelaysResponse param, boolean optimizeContent)
                    throws org.apache.axis2.AxisFault {
                        try {
                            javax.xml.bind.JAXBContext context = wsContext;
                            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                            JaxbRIDataSource source = new JaxbRIDataSource( com.clickandbuy.api.soap.axis2.stub.GetFeeCardSettlementDelaysResponse.class,
                                                                            param,
                                                                            marshaller,
                                                                            "http://api.clickandbuy.com/webservices/pay_1_1_0/",
                                                                            "getFeeCardSettlementDelays_Response");
                            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://api.clickandbuy.com/webservices/pay_1_1_0/", null);
                            return factory.createOMElement(source, "getFeeCardSettlementDelays_Response", namespace);
                        } catch (javax.xml.bind.JAXBException bex){
                            throw org.apache.axis2.AxisFault.makeFault(bex);
                        }
                    }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.clickandbuy.api.soap.axis2.stub.GetFeeCardSettlementDelaysResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(com.clickandbuy.api.soap.axis2.stub.GetFeeCardInvoicingCyclesRequest param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( com.clickandbuy.api.soap.axis2.stub.GetFeeCardInvoicingCyclesRequest.class,
                                                                        param,
                                                                        marshaller,
                                                                        methodQName.getNamespaceURI(),
                                                                        methodQName.getLocalPart());
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(),
                                                                           null);
                        return factory.createOMElement(source, methodQName.getLocalPart(), namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.om.OMElement toOM(com.clickandbuy.api.soap.axis2.stub.GetFeeCardInvoicingCyclesRequest param, boolean optimizeContent)
                    throws org.apache.axis2.AxisFault {
                        try {
                            javax.xml.bind.JAXBContext context = wsContext;
                            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                            JaxbRIDataSource source = new JaxbRIDataSource( com.clickandbuy.api.soap.axis2.stub.GetFeeCardInvoicingCyclesRequest.class,
                                                                            param,
                                                                            marshaller,
                                                                            "http://api.clickandbuy.com/webservices/pay_1_1_0/",
                                                                            "getFeeCardInvoicingCycles_Request");
                            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://api.clickandbuy.com/webservices/pay_1_1_0/", null);
                            return factory.createOMElement(source, "getFeeCardInvoicingCycles_Request", namespace);
                        } catch (javax.xml.bind.JAXBException bex){
                            throw org.apache.axis2.AxisFault.makeFault(bex);
                        }
                    }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.clickandbuy.api.soap.axis2.stub.GetFeeCardInvoicingCyclesRequest param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(com.clickandbuy.api.soap.axis2.stub.GetFeeCardInvoicingCyclesResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( com.clickandbuy.api.soap.axis2.stub.GetFeeCardInvoicingCyclesResponse.class,
                                                                        param,
                                                                        marshaller,
                                                                        methodQName.getNamespaceURI(),
                                                                        methodQName.getLocalPart());
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(),
                                                                           null);
                        return factory.createOMElement(source, methodQName.getLocalPart(), namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.om.OMElement toOM(com.clickandbuy.api.soap.axis2.stub.GetFeeCardInvoicingCyclesResponse param, boolean optimizeContent)
                    throws org.apache.axis2.AxisFault {
                        try {
                            javax.xml.bind.JAXBContext context = wsContext;
                            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                            JaxbRIDataSource source = new JaxbRIDataSource( com.clickandbuy.api.soap.axis2.stub.GetFeeCardInvoicingCyclesResponse.class,
                                                                            param,
                                                                            marshaller,
                                                                            "http://api.clickandbuy.com/webservices/pay_1_1_0/",
                                                                            "getFeeCardInvoicingCycles_Response");
                            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://api.clickandbuy.com/webservices/pay_1_1_0/", null);
                            return factory.createOMElement(source, "getFeeCardInvoicingCycles_Response", namespace);
                        } catch (javax.xml.bind.JAXBException bex){
                            throw org.apache.axis2.AxisFault.makeFault(bex);
                        }
                    }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.clickandbuy.api.soap.axis2.stub.GetFeeCardInvoicingCyclesResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(com.clickandbuy.api.soap.axis2.stub.GetFeeCardCurrenciesRequest param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( com.clickandbuy.api.soap.axis2.stub.GetFeeCardCurrenciesRequest.class,
                                                                        param,
                                                                        marshaller,
                                                                        methodQName.getNamespaceURI(),
                                                                        methodQName.getLocalPart());
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(),
                                                                           null);
                        return factory.createOMElement(source, methodQName.getLocalPart(), namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.om.OMElement toOM(com.clickandbuy.api.soap.axis2.stub.GetFeeCardCurrenciesRequest param, boolean optimizeContent)
                    throws org.apache.axis2.AxisFault {
                        try {
                            javax.xml.bind.JAXBContext context = wsContext;
                            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                            JaxbRIDataSource source = new JaxbRIDataSource( com.clickandbuy.api.soap.axis2.stub.GetFeeCardCurrenciesRequest.class,
                                                                            param,
                                                                            marshaller,
                                                                            "http://api.clickandbuy.com/webservices/pay_1_1_0/",
                                                                            "getFeeCardCurrencies_Request");
                            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://api.clickandbuy.com/webservices/pay_1_1_0/", null);
                            return factory.createOMElement(source, "getFeeCardCurrencies_Request", namespace);
                        } catch (javax.xml.bind.JAXBException bex){
                            throw org.apache.axis2.AxisFault.makeFault(bex);
                        }
                    }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.clickandbuy.api.soap.axis2.stub.GetFeeCardCurrenciesRequest param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(com.clickandbuy.api.soap.axis2.stub.GetFeeCardCurrenciesResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( com.clickandbuy.api.soap.axis2.stub.GetFeeCardCurrenciesResponse.class,
                                                                        param,
                                                                        marshaller,
                                                                        methodQName.getNamespaceURI(),
                                                                        methodQName.getLocalPart());
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(),
                                                                           null);
                        return factory.createOMElement(source, methodQName.getLocalPart(), namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.om.OMElement toOM(com.clickandbuy.api.soap.axis2.stub.GetFeeCardCurrenciesResponse param, boolean optimizeContent)
                    throws org.apache.axis2.AxisFault {
                        try {
                            javax.xml.bind.JAXBContext context = wsContext;
                            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                            JaxbRIDataSource source = new JaxbRIDataSource( com.clickandbuy.api.soap.axis2.stub.GetFeeCardCurrenciesResponse.class,
                                                                            param,
                                                                            marshaller,
                                                                            "http://api.clickandbuy.com/webservices/pay_1_1_0/",
                                                                            "getFeeCardCurrencies_Response");
                            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://api.clickandbuy.com/webservices/pay_1_1_0/", null);
                            return factory.createOMElement(source, "getFeeCardCurrencies_Response", namespace);
                        } catch (javax.xml.bind.JAXBException bex){
                            throw org.apache.axis2.AxisFault.makeFault(bex);
                        }
                    }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.clickandbuy.api.soap.axis2.stub.GetFeeCardCurrenciesResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(com.clickandbuy.api.soap.axis2.stub.GetFeeCardRequest param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( com.clickandbuy.api.soap.axis2.stub.GetFeeCardRequest.class,
                                                                        param,
                                                                        marshaller,
                                                                        methodQName.getNamespaceURI(),
                                                                        methodQName.getLocalPart());
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(),
                                                                           null);
                        return factory.createOMElement(source, methodQName.getLocalPart(), namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.om.OMElement toOM(com.clickandbuy.api.soap.axis2.stub.GetFeeCardRequest param, boolean optimizeContent)
                    throws org.apache.axis2.AxisFault {
                        try {
                            javax.xml.bind.JAXBContext context = wsContext;
                            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                            JaxbRIDataSource source = new JaxbRIDataSource( com.clickandbuy.api.soap.axis2.stub.GetFeeCardRequest.class,
                                                                            param,
                                                                            marshaller,
                                                                            "http://api.clickandbuy.com/webservices/pay_1_1_0/",
                                                                            "getFeeCard_Request");
                            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://api.clickandbuy.com/webservices/pay_1_1_0/", null);
                            return factory.createOMElement(source, "getFeeCard_Request", namespace);
                        } catch (javax.xml.bind.JAXBException bex){
                            throw org.apache.axis2.AxisFault.makeFault(bex);
                        }
                    }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.clickandbuy.api.soap.axis2.stub.GetFeeCardRequest param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(com.clickandbuy.api.soap.axis2.stub.GetFeeCardResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( com.clickandbuy.api.soap.axis2.stub.GetFeeCardResponse.class,
                                                                        param,
                                                                        marshaller,
                                                                        methodQName.getNamespaceURI(),
                                                                        methodQName.getLocalPart());
                        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(),
                                                                           null);
                        return factory.createOMElement(source, methodQName.getLocalPart(), namespace);
                    } catch (javax.xml.bind.JAXBException bex){
                        throw org.apache.axis2.AxisFault.makeFault(bex);
                    }
                }

                private org.apache.axiom.om.OMElement toOM(com.clickandbuy.api.soap.axis2.stub.GetFeeCardResponse param, boolean optimizeContent)
                    throws org.apache.axis2.AxisFault {
                        try {
                            javax.xml.bind.JAXBContext context = wsContext;
                            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                            JaxbRIDataSource source = new JaxbRIDataSource( com.clickandbuy.api.soap.axis2.stub.GetFeeCardResponse.class,
                                                                            param,
                                                                            marshaller,
                                                                            "http://api.clickandbuy.com/webservices/pay_1_1_0/",
                                                                            "getFeeCard_Response");
                            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://api.clickandbuy.com/webservices/pay_1_1_0/", null);
                            return factory.createOMElement(source, "getFeeCard_Response", namespace);
                        } catch (javax.xml.bind.JAXBException bex){
                            throw org.apache.axis2.AxisFault.makeFault(bex);
                        }
                    }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.clickandbuy.api.soap.axis2.stub.GetFeeCardResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));
                    return envelope;
                }

                

        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory) {
            return factory.getDefaultEnvelope();
        }

        private java.lang.Object fromOM (
            org.apache.axiom.om.OMElement param,
            java.lang.Class type,
            java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{
            try {
                javax.xml.bind.JAXBContext context = wsContext;
                javax.xml.bind.Unmarshaller unmarshaller = context.createUnmarshaller();

                return unmarshaller.unmarshal(param.getXMLStreamReaderWithoutCaching(), type).getValue();
            } catch (javax.xml.bind.JAXBException bex){
                throw org.apache.axis2.AxisFault.makeFault(bex);
            }
        }

        class JaxbRIDataSource implements org.apache.axiom.om.OMDataSource {
            /**
             * Bound object for output.
             */
            private final Object outObject;

            /**
             * Bound class for output.
             */
            private final Class outClazz;

            /**
             * Marshaller.
             */
            private final javax.xml.bind.Marshaller marshaller;

            /**
             * Namespace
             */
            private String nsuri;

            /**
             * Local name
             */
            private String name;

            /**
             * Constructor from object and marshaller.
             *
             * @param obj
             * @param marshaller
             */
            public JaxbRIDataSource(Class clazz, Object obj, javax.xml.bind.Marshaller marshaller, String nsuri, String name) {
                this.outClazz = clazz;
                this.outObject = obj;
                this.marshaller = marshaller;
                this.nsuri = nsuri;
                this.name = name;
            }

            public void serialize(java.io.OutputStream output, org.apache.axiom.om.OMOutputFormat format) throws javax.xml.stream.XMLStreamException {
                try {
                    marshaller.marshal(new javax.xml.bind.JAXBElement(
                            new javax.xml.namespace.QName(nsuri, name), outObject.getClass(), outObject), output);
                } catch (javax.xml.bind.JAXBException e) {
                    throw new javax.xml.stream.XMLStreamException("Error in JAXB marshalling", e);
                }
            }

            public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat format) throws javax.xml.stream.XMLStreamException {
                try {
                    marshaller.marshal(new javax.xml.bind.JAXBElement(
                            new javax.xml.namespace.QName(nsuri, name), outObject.getClass(), outObject), writer);
                } catch (javax.xml.bind.JAXBException e) {
                    throw new javax.xml.stream.XMLStreamException("Error in JAXB marshalling", e);
                }
            }

            public void serialize(javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                try {
                    marshaller.marshal(new javax.xml.bind.JAXBElement(
                            new javax.xml.namespace.QName(nsuri, name), outObject.getClass(), outObject), xmlWriter);
                } catch (javax.xml.bind.JAXBException e) {
                    throw new javax.xml.stream.XMLStreamException("Error in JAXB marshalling", e);
                }
            }

            public javax.xml.stream.XMLStreamReader getReader() throws javax.xml.stream.XMLStreamException {
                try {
                    javax.xml.bind.JAXBContext context = wsContext;
                    org.apache.axiom.om.impl.builder.SAXOMBuilder builder = new org.apache.axiom.om.impl.builder.SAXOMBuilder();
                    javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                    marshaller.marshal(new javax.xml.bind.JAXBElement(
                            new javax.xml.namespace.QName(nsuri, name), outObject.getClass(), outObject), builder);

                    return builder.getRootElement().getXMLStreamReader();
                } catch (javax.xml.bind.JAXBException e) {
                    throw new javax.xml.stream.XMLStreamException("Error in JAXB marshalling", e);
                }
            }
        }
        
    
   }
   