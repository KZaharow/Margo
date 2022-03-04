package com.zahar.margarita.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;

public class ExceptionHandlerImpl {

    @ExceptionHandler({Exception.class})
    public void handleException(){

    }
}
