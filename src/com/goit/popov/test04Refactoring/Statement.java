package com.goit.popov.test04Refactoring;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by Андрей on 19.07.2016.
 */
public abstract class Statement {

        public String value(Customer aCustomer) {
                Enumeration rentals  = aCustomer.getRentals();
                String result = headerString(aCustomer);
                while (rentals.hasMoreElements()) {
                        Rental each = (Rental) rentals.nextElement();
                        // show figures for this rental
                        result += eachRentalString(each);
                }
                result += footerString(aCustomer);
                return result;
        }

        abstract String headerString(Customer aCustomer);
        abstract String eachRentalString(Rental aRental);
        abstract String footerString(Customer aCustomer);
}
