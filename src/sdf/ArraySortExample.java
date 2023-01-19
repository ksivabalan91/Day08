package sdf;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortExample {

    public static void example01() {
        String name[] = { "apple", "pear", "orange", "peach", "durian", "pomelo",
         "rambutan", "grapes", "logan","jackfruit" };

        // unsorted array
        System.out.println("Unsorted Array: \t" + Arrays.toString(name));

        // sorted the array
        Arrays.sort(name);
        System.out.println("Sorted Array: \t\t" + Arrays.toString(name));

        // reverse sort
        Arrays.sort(name, Collections.reverseOrder());
        System.out.println("Reverse Sorted Array: \t" + Arrays.toString(name));

    }

    public static void example02() {
        Integer numbers[] = { 12, 5, 3, 7, 3, 7, 9, 22 };

        // unsorted array
        System.out.println("Unsorted Array: \t" + Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("Sorted Array: \t\t" + Arrays.toString(numbers));

        Arrays.sort(numbers,Collections.reverseOrder());
        System.out.println("Reverse Sorted Array: \t" + Arrays.toString(numbers));

    }

}
