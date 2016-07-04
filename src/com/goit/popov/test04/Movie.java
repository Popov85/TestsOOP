package com.goit.popov.test04;

/**
 * Created by Андрей on 04.07.2016.
 */
public class Movie {

        public static final int CHILDRENS = 2;
        public static final int REGULAR = 0;
        public static final int NEW_RELEASE = 1;

        private String _title;
        private int _priceCode;

        public Movie (String title, int priceCode) {
                _title = title;
                _priceCode = priceCode;
        }

        public String getTitle() {
                return _title;
        }

        public int getPriceCode() {
                return _priceCode;
        }

        public void setPriceCode(int _priceCode) {
                this._priceCode = _priceCode;
        }
}
