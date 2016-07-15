package com.goit.popov.test04Refactoring;

/**
 * Created by Андрей on 04.07.2016.
 */
public class Rental {
        private Movie _movie;
        private int _daysRented;

        public Rental (Movie movie, int daysRented){
                _movie = movie;
                _daysRented = daysRented;
        }

        public Movie getMovie() {
                return _movie;
        }

        public int getDaysRented() {
                return _daysRented;
        }

        public double getCharge() {
                return _movie.getCharge(_daysRented);
        }

        int getFrequentRenterPoints() {
                // add bonus for a two day new release rental
                return _movie.getFrequentRenterPoints(_daysRented);
        }
}
