/**
 * Main class of the Java program.
 * This code allows you to test available positions
 * 
 */

public class Main {
    public static void main(String[] args) {
        int [] arr = {25, 7, 7, 14, 14, 14, 21, 3, 3, 3, 5, 12, 12, 13, 13};
        System.out.println(countSorted(arr));
}

public static int countSorted(int[] array){	
     int count = 1; 
     int max = 1;
     for (int k = 1; k < array.length; k++) {
         if (array[k-1] <= array[k]) {
             count++;
         } else {
             if (count > max) {
                 max = count;
             }
             count = 1;
         }
     }
     if(count>max){max = count;}
     return max;
}
}