/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraychallenge1;

/**
 *
 * @author use
 */
public class ArrayChallenge1 {
    
    public static void main(String[] args) {
        int[] anArray;	        // declare an array of integers

        anArray = new int[50];	// create an array of integers
         
          System.out.println(
            "******* BEFORE INCREMENT *******");
        // assign a value to each array element and print 
        for (int i = 0; i < anArray.length; i++) {
            anArray[i] = i;
            System.out.print(anArray[i] + " ");
        }
        System.out.println();

         
        
        for (int i = 0; i < 50; i++) {
            anArray[i] = anArray[i] + 1;
        }
         System.out.println(" ");
        
        // after increment
        System.out.println(
            "******* AFTER INCREMENT *******");
        
        // printing the elements of array after operation
        for (int i = 0; i < 50; i++) {
            System.out.print(anArray[i]);
            System.out.print(" ");

                   

        }


            // EVEN NUMBERS DIVISIBLE BY 11
        System.out.println(
"                                                                                                                          ******* EVEN NUMBERS DIVISIBLE BY 11 *******");
         int i = 11;
        while(i <50 ){
            
       switch(i%2 ){
           case 0 :
               
           switch(i%11 )
                {
               case 0 :
               System.out.println("values=" +i);
               break;
           }
       } 
         i++;  
        }
    }
}