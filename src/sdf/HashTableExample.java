package sdf;

import java.io.Console;
import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {
    public static void example01(){
        Map<String,Integer> phones = new Hashtable<>();

        phones.put("iPhone", 10);
        phones.put("Huawei", 2);
        phones.put("Samsung", 5);
        phones.put("Google", 9);

        System.out.println("Total phone types "+phones.size());

        for (String key: phones.keySet()){
            System.out.println(key+"-"+phones.get(key));
        }
        
        String searchString = "Google";
        Console con = System.console();

        while(!searchString.equals("quit")){
            
            searchString = con.readLine("Enter searchString: ");
    
            if(phones.containsKey(searchString)){
                System.out.println(searchString +" - "+phones.get(searchString));
            } else{
                System.out.println("Phone not found");
            }
        }

        // remove all the Map Data
        phones.clear();

        System.out.println("Total phone types: " + phones.size());

    }
    
}
