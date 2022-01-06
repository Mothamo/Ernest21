/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sorting2;


// Java program to fill the element in an array
import java.util.*;
  
public class Sorting2 {
      
    // Main function
    public static void main(String args[]) throws Exception 
    {
          
        // Array Declaration
        int array[] = new int[50];
          int temp = 0;
        // Adding elements in the array
        for (int i = 0; i < array.length; i++) 
        {
            array[i] = i + 1;
        }
          
        // Printing the elements
        for (int i = 0; i < array.length; i++) 
        {
            System.out.print(array[i] + " ");
        }
        for(int i = 0; i<array.length; i++){
                 for(int j = i+1;j<array.length;j++){
                     if(array[i]<array[j]){
                     temp = array[i];
                     array[i] = array[j];
                     array[j] = temp;
                     array[19] = i +60;
                     }
                 
                 }
        }
        System.out.println();
        
        System.out.println("sorted array list");
        for(int i =0; i<array.length;i++){
               System.out.println(array[i] + " ");
        }
   }
}