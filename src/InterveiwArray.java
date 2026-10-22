package src;

import java.util.Arrays;

public class InterveiwArray {

    public static int[] getDigitalRootArray(int arr[]) {
        int digitRoot[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int number = arr[i];
            while (number >= 10) {
                int sum = 0;
                while (number > 0) {
                    sum += number % 10;
                    number /= 10;
                }
                number = sum;
            }
            digitRoot[i] = number;
        }
        return digitRoot;
    }

    public static void main(String[] args) {
        int number[] = { 29, 11, 5, 38, 47 };

        int result[] = getDigitalRootArray(number);

        System.out.println(Arrays.toString(result));
    }
}