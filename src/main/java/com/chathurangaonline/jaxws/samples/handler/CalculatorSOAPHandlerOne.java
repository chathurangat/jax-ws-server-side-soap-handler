package com.chathurangaonline.jaxws.samples.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.namespace.QName;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.util.Set;


public class CalculatorSOAPHandlerOne implements SOAPHandler<SOAPMessageContext> {

    private static final Logger logger = LoggerFactory.getLogger(CalculatorSOAPHandlerOne.class);

    @Override
    public Set<QName> getHeaders() {
        return null;
    }

    @Override
    public boolean handleMessage(SOAPMessageContext context) {
        if(!(Boolean)context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY)){
            logger.info(" soap message passed through CalculatorSOAPHandlerOne (only for request)");
        }
        return true;
    }

    @Override
    public boolean handleFault(SOAPMessageContext context) {
        return true;
    }

    @Override
    public void close(MessageContext context) {

    }
}
