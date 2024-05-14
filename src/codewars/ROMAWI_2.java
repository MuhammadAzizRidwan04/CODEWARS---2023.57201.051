package codewars;

import java.util.Arrays;

public class ROMAWI_2 {
    
    public static int[] invert(int[] array) {
        if (array == null || array.length == 0) {
            return new int[0];
        }
        int[] hasil = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            hasil[i] = -array[i];
        }
        return hasil;
    }
    
    public static void main(String[] args) {
        int[] input1 = {1, 2, 3, 4, 5};
        int[] input2 = {1, -2, 3, -4, 5};
        System.out.println(Arrays.toString(invert(input1)));
        System.out.println(Arrays.toString(invert(input2)));
        
    }
    
}
