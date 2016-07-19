package com.goit.popov.test04Refactoring;

/**
 * Created by Андрей on 04.07.2016.
 */
public class Runner {
        public static void main(String[] args) {
                Movie movie0 = new Movie("Name0",0);
                Movie movie1 = new Movie("Name1",2);
                Movie movie2 = new Movie("Name2",0);

                Rental rental0 = new Rental(movie0,5);
                Rental rental1 = new Rental(movie1,3);
                Rental rental2 = new Rental(movie2,7);

                Customer customer = new Customer("John Bloch");
                customer.addRental(rental0);
                customer.addRental(rental1);
                customer.addRental(rental2);

                System.out.println("Statement is: \n"+new TextStatement().value(customer)+"\n");
                System.out.println("HTML statement is: \n"+new HtmlStatement().value(customer));

        }
}
