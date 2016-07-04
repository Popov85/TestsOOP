package com.goit.popov.test01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Demonstrates why mutable objects are bad things
 * Created by Андрей on 28.06.2016.
 * @see
 */
public class Runner {
        public static void main(String[] args) {

                // Step 1. Create two collections of points

                List<MutablePoint> startLocations = new ArrayList<MutablePoint>();
                List<MutablePoint> endLocations = new ArrayList<MutablePoint>();

                // Step 2. Create two points

                MutablePoint myLocation = new MutablePoint(1,1);
                MutablePoint yourLocation = new MutablePoint(10,20);

                // Step 3. Add the point to the first collection
                startLocations.add(myLocation);
                startLocations.add(yourLocation);

                System.out.println("startLocations: "+ Arrays.toString(startLocations.toArray()));

                // Step 4. Edit the points (mutate them) and add them to the second collection

                myLocation.setX(100);
                myLocation.setY(100);

                yourLocation.setX(-10);
                yourLocation.setY(-20);

                endLocations.add(myLocation);
                endLocations.add(yourLocation);

                System.out.println("endLocations: " + Arrays.toString(endLocations.toArray()));
                System.out.println("startLocations: " + Arrays.toString(startLocations.toArray()));

                // Here is the right approach
                //-------------------------------------------------------------------------------------

                // Step 1. Create two collections of points

               /* List<MutablePoint> startLocations = new ArrayList<MutablePoint>();
                List<MutablePoint> endLocations = new ArrayList<MutablePoint>();

                // Step 2. Create two points

                MutablePoint myLocation = new MutablePoint(1,1);
                MutablePoint yourLocation = new MutablePoint(10,20);

                // Step 3. Add the point to the first collection
                startLocations.add(myLocation);
                startLocations.add(yourLocation);

                System.out.println("startLocations: "+ Arrays.toString(startLocations.toArray()));

                // Step 4. Create other points
                MutablePoint myLocation1 = new MutablePoint(100,100);
                MutablePoint yourLocation1 = new MutablePoint(-10,-20);

                // Step 5. Add them
                endLocations.add(myLocation1);
                endLocations.add(yourLocation1);

                System.out.println("endLocations: " + Arrays.toString(endLocations.toArray()));
                System.out.println("startLocations: " + Arrays.toString(startLocations.toArray()));*/
        }
}
