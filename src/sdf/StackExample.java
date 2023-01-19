package sdf;

import java.util.Iterator;
import java.util.Stack;

public class StackExample{
    public static void example01(){
        Stack<Integer> stack = new Stack<>();
        
        // putting somthing into the stack
        for(int i =0; i<10;i++){
            stack.push(i);
        }
        
        // pop or taking smth from the stack
        for(int i =0; i< 5;i++){
            int stackItem = stack.pop();
            System.out.println(stackItem);
        }

        // see what is the last item 

        Integer peekItem = stack.peek();
        System.out.println("Item on top of stack: "+peekItem);

        Integer firstItem = stack.firstElement();
        System.out.println("First item: "+firstItem);

        int idxElement = stack.search(2);
        System.out.println("Stack element '2' found at index: "+idxElement);

        Iterator<Integer> its =  stack.iterator();
        while (its.hasNext()){
            Integer stackIt = its.next();
            System.out.println("Iterator stack item: "+stackIt);
        }



    } 
    
}
