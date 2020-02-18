package com.company;

//creating superclass called payments
public class Payments  {

    //calling protected classes so they can be used throughout the program but maintain their privacy
    protected float USD;
    protected float conversionFee;
    protected float conversion;

    //creating a constructor that makes the value of USD equal to the value of usd
    public Payments(float usd) {
        USD = usd;
    }

    //adding the interface to the superclass (parent)
    public void paymentInfo() {

    }

}
