package sdf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionSortExample {
    public static void example01(){
        List<Integer> numbers = new ArrayList<>();

        // math.random * 100 for random between 0-100, returns a 

        for (int i = 0; i<10;i++){
            numbers.add((int)(Math.random()*100));
        }

        // printed unsorted array
        System.out.println("Unsorted list: \t\t"+numbers);

        // sort list
        Collections.sort(numbers);

        //print sorted list
        System.out.println("Sorted list: \t\t"+numbers);

        //sort in descending order
        numbers.sort(Comparator.naturalOrder()); // ascending
        numbers.sort(Comparator.reverseOrder()); // deccending
        Collections.sort(numbers,Collections.reverseOrder());

        //print reverse sorted list
        System.out.println("Revers sorted list: \t"+numbers);
    }

    public static void example02(){

        Employee emp1 = new Employee("12345", "Barbaros", "MSE",
         "barbosa@email.com", 80_000);
        Employee emp2 = new Employee("45251", "Blackbeard", "EEE",
         "bb@email.com", 60_000);
        Employee emp3 = new Employee("84651", "Daniel", "MSE",
         "danielkidd@email.com", 20_000);
        Employee emp4 = new Employee("84569", "Adewale", "ECE",
         "adeade@email.com", 100_000);


        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        
        // print out employees list before sorting
        System.out.println("Unsorted employees: " + employees);

        // do a sort using colloections
        Collections.sort(employees);

        // print out sorted employees
        System.out.println("sorted employees: "+employees);

        // sorting using compartor and lambda
        employees.sort(Comparator.comparing(e->e.getSalary()));
        // print out sorted employees
        System.out.println("sorted employees by salary: "+employees);
        
        // sorting using compartor and lambda
        employees.sort(Comparator.comparing(e->e.getSalary()));
        // print out sorted employees
        System.out.println("sorted employees by salary: "+employees);



    }
    
}
