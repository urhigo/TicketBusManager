package com.jfb.lecture5.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateException extends ControlParam{

    private static int countDateException = 0;

    @Override
    public void controlParam (String date) throws CustomException{
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        if (date != null) {
            if (!date.isEmpty()){
                LocalDate dataFromString = LocalDate.parse(date, formatter);
                LocalDate currentDate = LocalDate.now();

                if (dataFromString.isAfter(currentDate)) {
                    countDateException ++;
                    throw new CustomException("Date invalid");
                }
            }else {
                countDateException++;
                throw new CustomException("Date invalid");
            }
        } else {
            countDateException ++;
            throw new CustomException("Date invalid");
        }

    }

    @Override
    public void numerousException(){
        System.out.println("Numerous date exceptions: " + countDateException);
    }
}
