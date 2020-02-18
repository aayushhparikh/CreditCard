package com.company;

//creating subclass PAYPAL which connects to the superclass and implements the interface created
public class PAYPAL extends Payments implements PaymentsInterface {


    //Creating a constructor for PAYPAL
    public PAYPAL(float usd) {
        super(usd);
    }

    @Override
    //creating interface class
    public void paymentInfo() {

        //printing value of usd before conversion
        System.out.println("The PAYPAL balance is " + USD);
        //adding the fee of PAYPAL to conversionFee
        conversionFee = (float) (USD * 0.01);
        //converting value to CAD of USD after applying the processing fee
        conversion = (float) ((USD - conversionFee) * 1.35);
        //Printing the converted value of PAYPAL
        System.out.println("The converted PAYPAL balance is " + conversion );

    }
}
