// program to create two vectors from first given numbers n such that the difference between the sum of them is minimum

import java.io.* ;
import java.util.*;

public class VectorTeam {
    public static void main(String args[]) {
        
        int n  = 52 ;
        findArrays(n);
    }
    public static void findArrays(int n){
        
        int sumofF = n*(n+1)/4 ;
        Vector<Integer>vec1 = new Vector<Integer>();
        Vector<Integer>vec2 = new Vector<Integer>();
        
        Stack<Integer>stack1 , stack2  = new Stack<Integer>();
        stack1 = new Stack<Integer>();
        
        for (int i = n ; i > 0 ; i--){
            if (sumofF - i >= 0){
                vec1.add(i);
                stack1.push(i);
                sumofF -= i ;
            }
            else {
                stack2.push(i);
                vec2.add(i);
            }
            
        }
       printVectors(vec1);
       printVectors(vec2);
       
       //printStack(stack1);
       //printStack(stack2);
        
    }
    

    public static void printVectors (Vector<Integer>vec){
        System.out.println("size of the vector is " + vec.size());
        for (int i = 0 ; i < vec.size() ; i ++){
            System.out.println(vec.get(i) + " ");
        }
        System.out.println();
    }
    
    public static void printStack (Stack<Integer>stack){
        System.out.println("size of the stack is " + stack.size());
        for (Integer num : stack){
            System.out.println(num);
        }
        System.out.println();
    }
}