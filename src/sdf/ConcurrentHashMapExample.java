package sdf;

import java.util.Enumeration;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void example01(){
        Map<String,Integer> laptops = new ConcurrentHashMap<>();

        laptops.put("Acer", 5);
        laptops.put("MSI", 2);
        laptops.put("Dell", 15);
        laptops.put("Apple", 75);
        laptops.put("Asus", 51);
        laptops.put("Gigabyte", 11);

        System.out.println("Total laptops: "+laptops.size());

        for(String key: laptops.keySet()){
            System.out.println(key+" - "+laptops.get(key));
        }

        String searchString = "Asus";
        if (laptops.containsKey(searchString)){
            System.out.println(searchString+" - "+laptops.get(searchString));            
        }

        Enumeration<Integer> elems = ((ConcurrentHashMap<String,Integer>)laptops).elements();

        while(elems.hasMoreElements()){
            System.out.println(elems.nextElement());
        }
        
        Integer retValue = laptops.putIfAbsent("Apple", 10);

        if (retValue!=null)
            System.out.println("return value = "+retValue);
    }
    
}
