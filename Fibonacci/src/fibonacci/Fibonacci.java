/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci;

class Fibonacci{  
public static void main(String args[])  
{

//printing 0 and 1 
    
 int n1=0,n2=1,n3,i,count=10;   
 
 System.out.print(n1+" "+n2);
 
 
 //starts from 2 because 0 and 1 are already printed    
 for(i=2;i<count;++i)   
 {    
  n3=n1+n2;  
  
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3;    
 }    
  
}}  