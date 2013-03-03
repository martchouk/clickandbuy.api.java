
/**
 * PayStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
        package com.clickandbuy.api.soap.axis2.stub.registration;

        

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

        _operations = new org.apache.axis2.description.AxisOperation[2];
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/", "createMerchantRegistration"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[0]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/", "getMerchantRegistrationStatus"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[1]=__operation;
            
        
        }

    //populates the faults
    private void populateFaults(){
         
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/","errorDetails"), "createMerchantRegistration"),"com.clickandbuy.api.soap.axis2.stub.registration.ErrorDetailsException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/","errorDetails"), "createMerchantRegistration"),"com.clickandbuy.api.soap.axis2.stub.registration.ErrorDetailsException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/","errorDetails"), "createMerchantRegistration"),"com.clickandbuy.api.soap.axis2.stub.ErrorDetails");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/","errorDetails"), "getMerchantRegistrationStatus"),"com.clickandbuy.api.soap.axis2.stub.registration.ErrorDetailsException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/","errorDetails"), "getMerchantRegistrationStatus"),"com.clickandbuy.api.soap.axis2.stub.registration.ErrorDetailsException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/","errorDetails"), "getMerchantRegistrationStatus"),"com.clickandbuy.api.soap.axis2.stub.ErrorDetails");
           


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
                     * @see com.clickandbuy.api.soap.axis2.stub.registration.Pay#createMerchantRegistration
                     * @param createMerchantRegistration_Request0
                    
                     * @throws com.clickandbuy.api.soap.axis2.stub.registration.ErrorDetailsException : 
                     */

                    

                            public  com.clickandbuy.api.soap.axis2.stub.CreateMerchantRegistrationResponse createMerchantRegistration(

                            com.clickandbuy.api.soap.axis2.stub.CreateMerchantRegistrationRequest createMerchantRegistration_Request0)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.clickandbuy.api.soap.axis2.stub.registration.ErrorDetailsException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
              _operationClient.getOptions().setAction("urn:createMerchantRegistration");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    createMerchantRegistration_Request0,
                                                    optimizeContent(new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/",
                                                    "createMerchantRegistration")), new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/",
                                                    "createMerchantRegistration"));
                                                
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
                                             com.clickandbuy.api.soap.axis2.stub.CreateMerchantRegistrationResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.clickandbuy.api.soap.axis2.stub.CreateMerchantRegistrationResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"createMerchantRegistration"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"createMerchantRegistration"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"createMerchantRegistration"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.clickandbuy.api.soap.axis2.stub.registration.ErrorDetailsException){
                          throw (com.clickandbuy.api.soap.axis2.stub.registration.ErrorDetailsException)ex;
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
                * @see com.clickandbuy.api.soap.axis2.stub.registration.Pay#startcreateMerchantRegistration
                    * @param createMerchantRegistration_Request0
                
                */
                public  void startcreateMerchantRegistration(

                 com.clickandbuy.api.soap.axis2.stub.CreateMerchantRegistrationRequest createMerchantRegistration_Request0,

                  final com.clickandbuy.api.soap.axis2.stub.registration.PayCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
             _operationClient.getOptions().setAction("urn:createMerchantRegistration");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    createMerchantRegistration_Request0,
                                                    optimizeContent(new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/",
                                                    "createMerchantRegistration")), new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/",
                                                    "createMerchantRegistration"));
                                                
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
                                                                         com.clickandbuy.api.soap.axis2.stub.CreateMerchantRegistrationResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultcreateMerchantRegistration(
                                        (com.clickandbuy.api.soap.axis2.stub.CreateMerchantRegistrationResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorcreateMerchantRegistration(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"createMerchantRegistration"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"createMerchantRegistration"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"createMerchantRegistration"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.clickandbuy.api.soap.axis2.stub.registration.ErrorDetailsException){
														callback.receiveErrorcreateMerchantRegistration((com.clickandbuy.api.soap.axis2.stub.registration.ErrorDetailsException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorcreateMerchantRegistration(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcreateMerchantRegistration(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcreateMerchantRegistration(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcreateMerchantRegistration(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcreateMerchantRegistration(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcreateMerchantRegistration(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcreateMerchantRegistration(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcreateMerchantRegistration(f);
                                            }
									    } else {
										    callback.receiveErrorcreateMerchantRegistration(f);
									    }
									} else {
									    callback.receiveErrorcreateMerchantRegistration(f);
									}
								} else {
								    callback.receiveErrorcreateMerchantRegistration(error);
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
                                    callback.receiveErrorcreateMerchantRegistration(axisFault);
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
                     * @see com.clickandbuy.api.soap.axis2.stub.registration.Pay#getMerchantRegistrationStatus
                     * @param getMerchantRegistrationStatus_Request2
                    
                     * @throws com.clickandbuy.api.soap.axis2.stub.registration.ErrorDetailsException : 
                     */

                    

                            public  com.clickandbuy.api.soap.axis2.stub.GetMerchantRegistrationStatusResponse getMerchantRegistrationStatus(

                            com.clickandbuy.api.soap.axis2.stub.GetMerchantRegistrationStatusRequest getMerchantRegistrationStatus_Request2)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.clickandbuy.api.soap.axis2.stub.registration.ErrorDetailsException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
              _operationClient.getOptions().setAction("urn:getMerchantRegistrationStatus");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getMerchantRegistrationStatus_Request2,
                                                    optimizeContent(new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/",
                                                    "getMerchantRegistrationStatus")), new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/",
                                                    "getMerchantRegistrationStatus"));
                                                
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
                                             com.clickandbuy.api.soap.axis2.stub.GetMerchantRegistrationStatusResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.clickandbuy.api.soap.axis2.stub.GetMerchantRegistrationStatusResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getMerchantRegistrationStatus"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getMerchantRegistrationStatus"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getMerchantRegistrationStatus"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.clickandbuy.api.soap.axis2.stub.registration.ErrorDetailsException){
                          throw (com.clickandbuy.api.soap.axis2.stub.registration.ErrorDetailsException)ex;
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
                * @see com.clickandbuy.api.soap.axis2.stub.registration.Pay#startgetMerchantRegistrationStatus
                    * @param getMerchantRegistrationStatus_Request2
                
                */
                public  void startgetMerchantRegistrationStatus(

                 com.clickandbuy.api.soap.axis2.stub.GetMerchantRegistrationStatusRequest getMerchantRegistrationStatus_Request2,

                  final com.clickandbuy.api.soap.axis2.stub.registration.PayCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
             _operationClient.getOptions().setAction("urn:getMerchantRegistrationStatus");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getMerchantRegistrationStatus_Request2,
                                                    optimizeContent(new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/",
                                                    "getMerchantRegistrationStatus")), new javax.xml.namespace.QName("http://api.clickandbuy.com/webservices/pay_1_1_0/",
                                                    "getMerchantRegistrationStatus"));
                                                
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
                                                                         com.clickandbuy.api.soap.axis2.stub.GetMerchantRegistrationStatusResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetMerchantRegistrationStatus(
                                        (com.clickandbuy.api.soap.axis2.stub.GetMerchantRegistrationStatusResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetMerchantRegistrationStatus(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getMerchantRegistrationStatus"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getMerchantRegistrationStatus"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getMerchantRegistrationStatus"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.clickandbuy.api.soap.axis2.stub.registration.ErrorDetailsException){
														callback.receiveErrorgetMerchantRegistrationStatus((com.clickandbuy.api.soap.axis2.stub.registration.ErrorDetailsException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetMerchantRegistrationStatus(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMerchantRegistrationStatus(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMerchantRegistrationStatus(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMerchantRegistrationStatus(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMerchantRegistrationStatus(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMerchantRegistrationStatus(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMerchantRegistrationStatus(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMerchantRegistrationStatus(f);
                                            }
									    } else {
										    callback.receiveErrorgetMerchantRegistrationStatus(f);
									    }
									} else {
									    callback.receiveErrorgetMerchantRegistrationStatus(f);
									}
								} else {
								    callback.receiveErrorgetMerchantRegistrationStatus(error);
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
                                    callback.receiveErrorgetMerchantRegistrationStatus(axisFault);
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
            com.clickandbuy.api.soap.axis2.stub.CreateMerchantRegistrationRequest.class,
                        com.clickandbuy.api.soap.axis2.stub.CreateMerchantRegistrationResponse.class,
                        com.clickandbuy.api.soap.axis2.stub.ErrorDetails.class,
                        com.clickandbuy.api.soap.axis2.stub.GetMerchantRegistrationStatusRequest.class,
                        com.clickandbuy.api.soap.axis2.stub.GetMerchantRegistrationStatusResponse.class
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

        

                private org.apache.axiom.om.OMElement toOM(com.clickandbuy.api.soap.axis2.stub.CreateMerchantRegistrationRequest param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( com.clickandbuy.api.soap.axis2.stub.CreateMerchantRegistrationRequest.class,
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

                private org.apache.axiom.om.OMElement toOM(com.clickandbuy.api.soap.axis2.stub.CreateMerchantRegistrationRequest param, boolean optimizeContent)
                    throws org.apache.axis2.AxisFault {
                        try {
                            javax.xml.bind.JAXBContext context = wsContext;
                            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                            JaxbRIDataSource source = new JaxbRIDataSource( com.clickandbuy.api.soap.axis2.stub.CreateMerchantRegistrationRequest.class,
                                                                            param,
                                                                            marshaller,
                                                                            "http://api.clickandbuy.com/webservices/pay_1_1_0/",
                                                                            "createMerchantRegistration_Request");
                            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://api.clickandbuy.com/webservices/pay_1_1_0/", null);
                            return factory.createOMElement(source, "createMerchantRegistration_Request", namespace);
                        } catch (javax.xml.bind.JAXBException bex){
                            throw org.apache.axis2.AxisFault.makeFault(bex);
                        }
                    }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.clickandbuy.api.soap.axis2.stub.CreateMerchantRegistrationRequest param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(com.clickandbuy.api.soap.axis2.stub.CreateMerchantRegistrationResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( com.clickandbuy.api.soap.axis2.stub.CreateMerchantRegistrationResponse.class,
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

                private org.apache.axiom.om.OMElement toOM(com.clickandbuy.api.soap.axis2.stub.CreateMerchantRegistrationResponse param, boolean optimizeContent)
                    throws org.apache.axis2.AxisFault {
                        try {
                            javax.xml.bind.JAXBContext context = wsContext;
                            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                            JaxbRIDataSource source = new JaxbRIDataSource( com.clickandbuy.api.soap.axis2.stub.CreateMerchantRegistrationResponse.class,
                                                                            param,
                                                                            marshaller,
                                                                            "http://api.clickandbuy.com/webservices/pay_1_1_0/",
                                                                            "createMerchantRegistration_Response");
                            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://api.clickandbuy.com/webservices/pay_1_1_0/", null);
                            return factory.createOMElement(source, "createMerchantRegistration_Response", namespace);
                        } catch (javax.xml.bind.JAXBException bex){
                            throw org.apache.axis2.AxisFault.makeFault(bex);
                        }
                    }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.clickandbuy.api.soap.axis2.stub.CreateMerchantRegistrationResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
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

                

                private org.apache.axiom.om.OMElement toOM(com.clickandbuy.api.soap.axis2.stub.GetMerchantRegistrationStatusRequest param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( com.clickandbuy.api.soap.axis2.stub.GetMerchantRegistrationStatusRequest.class,
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

                private org.apache.axiom.om.OMElement toOM(com.clickandbuy.api.soap.axis2.stub.GetMerchantRegistrationStatusRequest param, boolean optimizeContent)
                    throws org.apache.axis2.AxisFault {
                        try {
                            javax.xml.bind.JAXBContext context = wsContext;
                            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                            JaxbRIDataSource source = new JaxbRIDataSource( com.clickandbuy.api.soap.axis2.stub.GetMerchantRegistrationStatusRequest.class,
                                                                            param,
                                                                            marshaller,
                                                                            "http://api.clickandbuy.com/webservices/pay_1_1_0/",
                                                                            "getMerchantRegistrationStatus_Request");
                            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://api.clickandbuy.com/webservices/pay_1_1_0/", null);
                            return factory.createOMElement(source, "getMerchantRegistrationStatus_Request", namespace);
                        } catch (javax.xml.bind.JAXBException bex){
                            throw org.apache.axis2.AxisFault.makeFault(bex);
                        }
                    }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.clickandbuy.api.soap.axis2.stub.GetMerchantRegistrationStatusRequest param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                throws org.apache.axis2.AxisFault {
                    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                    envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));
                    return envelope;
                }

                

                private org.apache.axiom.om.OMElement toOM(com.clickandbuy.api.soap.axis2.stub.GetMerchantRegistrationStatusResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                throws org.apache.axis2.AxisFault {
                    try {
                        javax.xml.bind.JAXBContext context = wsContext;
                        javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                        JaxbRIDataSource source = new JaxbRIDataSource( com.clickandbuy.api.soap.axis2.stub.GetMerchantRegistrationStatusResponse.class,
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

                private org.apache.axiom.om.OMElement toOM(com.clickandbuy.api.soap.axis2.stub.GetMerchantRegistrationStatusResponse param, boolean optimizeContent)
                    throws org.apache.axis2.AxisFault {
                        try {
                            javax.xml.bind.JAXBContext context = wsContext;
                            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

                            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

                            JaxbRIDataSource source = new JaxbRIDataSource( com.clickandbuy.api.soap.axis2.stub.GetMerchantRegistrationStatusResponse.class,
                                                                            param,
                                                                            marshaller,
                                                                            "http://api.clickandbuy.com/webservices/pay_1_1_0/",
                                                                            "getMerchantRegistrationStatus_Response");
                            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://api.clickandbuy.com/webservices/pay_1_1_0/", null);
                            return factory.createOMElement(source, "getMerchantRegistrationStatus_Response", namespace);
                        } catch (javax.xml.bind.JAXBException bex){
                            throw org.apache.axis2.AxisFault.makeFault(bex);
                        }
                    }

                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.clickandbuy.api.soap.axis2.stub.GetMerchantRegistrationStatusResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
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
   