package com.goit.popov.test04;

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
}
