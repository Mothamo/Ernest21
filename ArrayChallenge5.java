public class ArrayChallenge1 {
    public static void main(String[] args) {
        int[] anArray;	        // declare an array of integers
         int Size = 50;
        anArray = new int[Size];	// create an array of integers
         
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



    }
}