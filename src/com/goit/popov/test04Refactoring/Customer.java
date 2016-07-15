package com.goit.popov.test04Refactoring;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by Андрей on 04.07.2016.
 */
public class Customer {

        private String _name;
        private Vector _rentals = new Vector();

        public Customer (String name) {
                _name = name;
        }

        public void addRental (Rental arg){
                _rentals.addElement(arg);
        }

        public String getName() {
                return _name;
        }

        public String statement() {

                Enumeration rentals  = _rentals.elements();
                String result = "Rental Record for "+getName() + "\n";

                while (rentals.hasMoreElements()) {
                        Rental each = (Rental) rentals.nextElement();
                        // show figures for this rental
                        result += "\t" + each.getMovie().getTitle()+ "\t" + String.valueOf(each.getCharge())+"\n";
                }

                //add footer lines
                result += "Amount owed is " + String.valueOf(getTotalCharge())+"\n";
                result += "You earned "+ String.valueOf(getTotalFrequentRenterPointers()) + " frequent renter pointers";
                return result;
        }

        public String htmlStatement() {

                Enumeration rentals  = _rentals.elements();
                String result = "<H1>Rentals for <EM>"+getName() + "</EM></H1><P>\n";

                while (rentals.hasMoreElements()) {
                        Rental each = (Rental) rentals.nextElement();
                        // show figures for this rental
                        result += each.getMovie().getTitle()+ ": " + String.valueOf(each.getCharge())+"<BR>\n";
                }

                //add footer lines
                result += "<P> You owe <EM>" + String.valueOf(getTotalCharge())+"</EM> <P>\n";
                result += "On this rental you earned <EM> "+ String.valueOf(getTotalFrequentRenterPointers()) + "</EM> frequent renter pointers <P>";
                return result;
        }

        private double getTotalCharge() {
                double result = 0;
                Enumeration rentals = _rentals.elements();
                while (rentals.hasMoreElements()) {
                        Rental each = (Rental) rentals.nextElement();
                        result += each.getCharge();
                }
                return result;
        }

        private double getTotalFrequentRenterPointers() {
                double result = 0;
                Enumeration rentals = _rentals.elements();
                while (rentals.hasMoreElements()) {
                        Rental each = (Rental) rentals.nextElement();
                        result += each.getFrequentRenterPoints();
                }
                return result;
        }
}