//********************************************************************
// Assignment #3 Author: Aayush Parikh
//
// The purpose of this program is to receive a USD value and convert it
// to CAD using the the conversion rate and then add any fees that might come with using a certain carrier
// i.e. VISA charges 2.5% per transaction where as PAYPAL only charges 1%.
//********************************************************************


package com.company;

//creating main class
public class Main {


    public static void main(String[] args) {

        //adding value of 100 to the VISA subclass
        Payments pay1 = new VISA(100);

        //making pay1 output the interface created on VISA
        pay1.paymentInfo();

        //adding value of 100 to the MASTERCARD subclass
        Payments pay2 = new MASTERCARD(100);

        //making pay2 equal to the interface created on MASTERCARD
        pay2.paymentInfo();

        //adding the value of 100 to PAYPAL
        Payments pay3 = new PAYPAL(100);

        //making pay 3 equal to interface created on MASTERCARD
        pay3.paymentInfo();
    }
}
