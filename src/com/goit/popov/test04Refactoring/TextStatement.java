package com.goit.popov.test04Refactoring;

import java.util.Enumeration;

/**
 * Created by Андрей on 19.07.2016.
 */
public class TextStatement extends Statement {

        public String headerString(Customer aCustomer) {
                return aCustomer.getName() + "\n";
        }

        public String eachRentalString(Rental aRental) {
                return "\t" + aRental.getMovie().getTitle()+ "\t" + String.valueOf(aRental.getCharge())+"\n";
        }

        public String footerString(Customer aCustomer) {
                return  "Amount owed is " + String.valueOf(aCustomer.getTotalCharge())+
                        "\n"+"You earned "+ String.valueOf(aCustomer.getTotalFrequentRenterPointers()) +
                        " frequent renter pointers";
        }
}
