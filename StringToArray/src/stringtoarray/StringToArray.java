/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringtoarray;

import java.util.Arrays;
public class StringToArray {
   public static void main(String args[]) {
      String [] str = {"1", "4", "3","2","3","7","5","6", "9"};
      int size = str.length;
      int [] arr = new int [size];
      for(int i=0; i<size; i++) {
         arr[i] = Integer.parseInt(str[i]);
      }
      System.out.println(Arrays.toString(arr));
   }
}