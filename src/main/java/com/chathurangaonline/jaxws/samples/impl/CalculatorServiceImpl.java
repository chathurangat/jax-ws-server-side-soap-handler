package com.chathurangaonline.jaxws.samples.impl;

import com.chathurangaonline.jaxws.samples.CalculatorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jws.HandlerChain;
import javax.jws.WebService;


@WebService
@HandlerChain(file = "handler-chain.xml")
public class CalculatorServiceImpl implements CalculatorService{

    private  static final Logger logger = LoggerFactory.getLogger(CalculatorServiceImpl.class);

    @Override
    public double add(double num1, double num2) {
        logger.info("== calling add method ==");
        return num1 + num2;
    }

    @Override
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }
}
