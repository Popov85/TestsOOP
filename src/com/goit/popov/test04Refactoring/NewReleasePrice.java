package com.goit.popov.test04Refactoring;

/**
 * Created by Андрей on 15.07.2016.
 */
public class NewReleasePrice extends Price {
        @Override
        int getPriceCode() {
                return Movie.NEW_RELEASE;
        }
        @Override
        public double getCharge(int daysRented) {
                return daysRented*3;
        }

        int getFrequentRenterPoints(int daysRented) {
                // add bonus for a two day new release rental
                return (daysRented>1) ? 2: 1;
        }
}
