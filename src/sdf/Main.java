package sdf;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        // ArraySortExample.example01();
        // System.out.println("\n");
        // ArraySortExample.example02();
        // System.out.println("\n");
        // CollectionSortExample.example01();
        // System.out.println("\n");
        // CollectionSortExample.example02();
        // System.out.println("\n");
        // HashMapExample.example01();
        // System.out.println("\n");
        // ConcurrentHashMapExample.example01();
        // System.out.println("\n");
        // LinkedListExample.example01();
        // System.out.println("\n");
        // StackExample.example01();

   

        File inputFile = new File("data\\employees.csv");
        List<String> listEmployees = csvReader.readFile(inputFile);

        System.out.println(listEmployees.toString());

        // csvWriter picasso = new csvWriter();

        // try{picasso.writeToCSV(listEmployees, "data\\employees.csv");
        // } catch(IOException e){}

        




        
        
    }
}