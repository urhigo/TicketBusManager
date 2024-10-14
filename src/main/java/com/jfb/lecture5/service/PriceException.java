package com.jfb.lecture5.service;

public class PriceException extends ControlParam{

    private static int countPriceException = 0;

    @Override
    public void controlParam(String price) throws CustomException{

        if (price != null){
            if (Integer.parseInt(price) <= 0 ) {
                countPriceException ++;
                throw new CustomException("Price cant be less 0");
            }
        } else {
            countPriceException ++;
            throw new CustomException("Price cant be null");
        }

    }

    @Override
    public void numerousException(){
        System.out.println("Numerous type ticket exceptions: " + countPriceException);
    }
}
