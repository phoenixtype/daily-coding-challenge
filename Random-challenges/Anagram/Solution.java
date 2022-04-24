package Anagram;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    private static int CHARACTER_RANGE= 256;

    static boolean isAnagram(String a, String b) {

        // Complete the function
        String lowerA = a.toLowerCase();
        String lowerB = b.toLowerCase();


        if (lowerA.length() != lowerB.length()) {
            return false;
        }

        int count[] = new int[CHARACTER_RANGE];
        for (int i = 0; i < lowerA.length(); i++) {
            count[lowerA.charAt(i)]++;
            count[lowerB.charAt(i)]--;
        }

        for (int i = 0; i < CHARACTER_RANGE; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}


