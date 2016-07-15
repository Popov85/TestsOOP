package com.goit.popov.test04Refactoring;

/**
 * Created by Андрей on 15.07.2016.
 */
public abstract class Price {

        abstract int getPriceCode();

        abstract double getCharge(int daysRented);

        int getFrequentRenterPoints(int daysRented) {
                // add bonus for a two day new release rental
                return 1;
        }
}
