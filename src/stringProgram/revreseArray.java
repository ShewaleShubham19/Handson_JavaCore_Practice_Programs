package stringProgram;

import java.util.Arrays;

public class revreseArray {
    
    public static void main(String[] args) {
        
        int[] array = {2,4,5,9,1,6,8};
        int start = 0;
        int end = array.length - 1;

        while(start<end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
         }

         System.out.println("Print the reverse of the array :" + Arrays.toString(array));
    }
}
