package Palindrome;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        sc.close();

        int i = 0;
        int j = A.length()-1;

        boolean palindrome = true;

        while(i < j) {
            if (A.charAt(i) != A.charAt(j)){
                palindrome = false;
            }
            i++;
            j--;
        }

        if (palindrome) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }






    }

}



