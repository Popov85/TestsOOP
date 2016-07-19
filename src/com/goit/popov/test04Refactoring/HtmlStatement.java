package com.goit.popov.test04Refactoring;

import java.util.Enumeration;

/**
 * Created by Андрей on 19.07.2016.
 */
public class HtmlStatement extends  Statement {

        public String headerString(Customer aCustomer) {
                return "<H1>Rentals for <EM>"+aCustomer.getName() + "</EM></H1><P>\n";
        }

        public String eachRentalString(Rental aRental) {
                return aRental.getMovie().getTitle()+ ": " + String.valueOf(aRental.getCharge())+"<BR>\n";
        }

        public String footerString(Customer aCustomer) {
                return "<P> You owe <EM>" + String.valueOf(aCustomer.getTotalCharge())+"</EM> <P>\n"+
                        "On this rental you earned <EM> "+ String.valueOf(aCustomer.getTotalFrequentRenterPointers()) +
                        "</EM> frequent renter pointers <P>";
        }
}
