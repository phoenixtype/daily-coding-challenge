package LexicographicalSubstring;

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
//        String smallest = "";
//        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        String currString = s.substring(0, k);

        System.out.println(currString);

        String smallest = currString;
        String largest = currString;

        for (int i = k; i < s.length(); i++) {
            currString = currString.substring(1, k) + s.charAt(i);
            System.out.println(currString);

            //if string 01 is less than string 02 -- true
            if (largest.compareTo(currString) < 0) {
                largest = currString;
            }

            //if string 01 is greater than string 02 -- true
            if (smallest.compareTo(currString) > 0) {
                smallest = currString;
            }
        }

        System.out.println("*********************");
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
