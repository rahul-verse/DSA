package src;

import static java.lang.Math.*;

public class Number {

    static void reverseNumber(int number) {

        int reverNumber = 0;

        while (number != 0) {
            int ld = number % 10;
            reverNumber = reverNumber * 10 + ld;
            number = number / 10;

        }
        System.out.println(reverNumber);
    }

    static boolean checkPalindrome(int number) {
        int ogNumber = number;
        int reverNumber = 0;

        while (number != 0) {
            int ld = number % 10;
            reverNumber = reverNumber * 10 + ld;
            number = number / 10;

        }
        return ogNumber == reverNumber ? true : false;
    }

    static boolean isPrime(int number) {

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


    static int gcd(int a , int b){

        // gcd(a,b ) = gcd(b,a % b )
        while(b !=0){
            
        }
        return 0 ; 
    }
    public static void main(String[] args) {
        int number = 43;

        reverseNumber(number);
        System.out.println(checkPalindrome(number));

        if (isPrime(number)) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }
}
