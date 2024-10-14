package com.jfb.lecture5.service;

import static com.jfb.lecture5.model.TicketType.*;
import static com.jfb.lecture5.model.TicketType.YEAR;

public class TicketTypeException extends ControlParam{

    private static int countTicketTypeException = 0;


    @Override
    public void controlParam(String ticketType) throws CustomException {
        if (ticketType == null || !ticketType.equals(DAY.toString()) &
                !ticketType.equals(WEEK.toString()) &
                !ticketType.equals(MONTH.toString()) &
                !ticketType.equals(YEAR.toString())) {
            countTicketTypeException ++;
            throw new CustomException("We don't have this ticket type");
        }
    }

    @Override
    public void numerousException(){
        System.out.println("Numerous type ticket exceptions: " + countTicketTypeException);
    }

}
