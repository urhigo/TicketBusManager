package com.jfb.lecture5.service;

import com.jfb.lecture5.model.BusTicket;

public class ControlParam {

    private static int countException = 0;

    public void controlParam(String param) throws CustomException {

    }
    public void numerousException(){
        System.out.println(countException);
    };

}
