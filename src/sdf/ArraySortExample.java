package sdf;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortExample {

   public static void example(){
        String name[] = {"apple","pear","orange","peach","durian","pomelo","rambutan","grapes","logan","jackfruit"};

        // unsorted array
        System.out.println("Unsorted Array: \t"+Arrays.toString(name));

        //sorted the array
        Arrays.sort(name);
        System.out.println("Sorted Array: \t\t"+Arrays.toString(name));

        // reverse sort
        Arrays.sort(name,Collections.reverseOrder());
        System.out.println("Reverse Sorted Array: \t"+Arrays.toString(name));

    }
    
}
