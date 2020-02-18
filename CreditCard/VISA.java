package com.company;


//creating subclass VISA which connects to the superclass and implements the interface created
public class VISA  extends Payments implements PaymentsInterface {

    //creating a constructor for VISA
    public VISA(float usd) {
        super(usd);
    }


        @Override
        //creating interface class
        public void paymentInfo() {

            //printing value of usd before conversion
            System.out.println("The VISA balance is " + USD);
            //adding the fee of VISA to conversionFee
            conversionFee = (float) (USD * 0.02);
            //converting value to CAD of USD after applying the processing fee
            conversion = (float) ((USD - conversionFee) * 1.35);
            //Printing the converted value of VISA
            System.out.println("The converted VISA balance is " + conversion );

        }


}

