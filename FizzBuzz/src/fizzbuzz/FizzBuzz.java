/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fizzbuzz;



import java.util.*;
class FizzBuzz
{
    public static void main(String args[])
    {
        int n = 100;
 
        // loop for 100 times
        for (int i=1; i<=n; i++)                                
        {
            //print 'FizzBuzz' for a number divisible by  15(divisible by
            // both 3 & 5)
            
            if (i%15==0)   
                
                System.out.print("FizzBuzz"+" ");
            
            //printing 'Buzz' for number divisible by 5 
            
            else if (i%5==0)
                
                System.out.print("Buzz"+" ");
 
            // print 'Fizz' for number divisible by 3
           
            else if (i%3==0)    
                System.out.print("Fizz"+" ");
            
            
               // print the numbers  
            else 
                System.out.print(i+" ");                        
        }
    }
    }
