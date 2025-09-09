package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(isPalindrome(-1221));  // true
        System.out.println(isPalindrome(707));   // true
        System.out.println(isPalindrome(11212));   // "One Two Three"
        System.out.println(isPerfectNumber(6));   // true
        System.out.println(isPerfectNumber(28));   // true 
        System.out.println(isPerfectNumber(5));   // false
        System.out.println(isPerfectNumber(-1));   // false
        System.out.println(numberToWords(123));   // "One Two Three"
        System.out.println(numberToWords(1010));   // "One Zero One Zero"
        System.out.println(numberToWords(-12));   // "Invalid Value"
    }
    public static boolean isPalindrome(int number) {
        number = Math.abs(number);
        char[] numberChars = String.valueOf(number).toCharArray();
        for (int i = 0; i< numberChars.length/2; i++) {
            if (numberChars[i] != numberChars[numberChars.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPerfectNumber(int number) {
        int count = number;
        for (int i = 1; i<number; i++){
            if (number % i == 0) {
                count -= i;
            }
        }
        return count == 0;
    }
    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }

        String[] words = {
            "Zero", "One", "Two", "Three", "Four",
            "Five", "Six", "Seven", "Eight", "Nine"
        };

        char[] numberChars = String.valueOf(number).toCharArray();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numberChars.length; i++) {
            result.append(words[Character.getNumericValue(numberChars[i])]);
            if (i != numberChars.length - 1) {
                result.append(" "); // araya boşluk koy
            }
        }

        return result.toString();
    }


}
