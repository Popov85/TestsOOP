package com.goit.popov.test11Jar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Created by Андрей on 23.08.2016.
 */
public class TestJar {

        //private static final Path PATH = Paths.get("/resources/Test.txt");
        private static final String PATH = "D:\\Java2016\\TestsOOP\\out\\artifacts\\TestsOOP_jar\\Test.txt";

        public static void main(String[] args) throws FileNotFoundException {

                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter the pathway to your XML-file: ");
                String path = scanner.nextLine();
                File file = new File(path);
                // D:\Java2016\TestsOOP\out\artifacts\TestsOOP_jar\Test.txt
                if(file.exists()){
                        System.out.println("File exists");
                }else{
                        System.out.println("File not found!");
                }

                new TestJar().readByLine(path);
        }

        public void readByLine(String path) throws FileNotFoundException {
                Scanner scanner = null;
                try {
                        //new FileReader(PATH.toString());
                        //InputStream in = this.getClass().getResourceAsStream(PATH);
                        File file = new File(path);
                        FileReader fileReader = new FileReader(file);
                        //BufferedReader reader = new BufferedReader(new InputStreamReader(in));
                        BufferedReader reader = new BufferedReader(fileReader);
                        scanner = new Scanner(reader);
                        while (scanner.hasNextLine()) {
                                System.out.println(scanner.nextLine());
                        }
                } finally {
                        if (scanner != null) scanner.close();
                }
        }
}
