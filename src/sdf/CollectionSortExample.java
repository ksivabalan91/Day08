package sdf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSortExample {
    public static void example01(){
        List<Integer> numbers = new ArrayList<>();

        // math.random * 100 for random between 0-100, returns a 

        for (int i = 0; i<10;i++){
            numbers.add((int)(Math.random()*100));
        }

        // printed unsorted array
        System.out.println("Unsorted list: \t\t"+numbers.toString());

        // sort list
        Collections.sort(numbers);

        //print sorted list
        System.out.println("Sorted list: \t\t"+numbers.toString());

        //sort in decensding order
        Collections.sort(numbers,Collections.reverseOrder());

        //print reverse sorted list
        System.out.println("Revers sorted list: \t"+numbers.toString());
    }
    
}
