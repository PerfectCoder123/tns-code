package com.jahid.assignment.assignment8;


public class NestedTryCatch {

    public static void main(String[] args) {
        try {
            // Outer try block
            int[] numbers = {1, 2, 3, 4};
            
        
            System.out.println("Accessing element at index 5: " + numbers[5]);
            
            try {
               
                String str = null;
                
              
                System.out.println("Length of string: " + str.length());
            } catch (NullPointerException e) {
              
                System.out.println("Caught NullPointerException: " + e.getMessage());
            }
            
        } catch (ArrayIndexOutOfBoundsException e) {
  
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
