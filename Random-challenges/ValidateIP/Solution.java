package ValidateIP;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
        in.close();

    }
}

class MyRegex {

    public String pattern = "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])" + "\\." + "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])"
            + "\\."+ "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])" + "\\."+ "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])";

//    public static boolean isValidIPAddress(String ip)
//    {
//
//        // Regex for digit from 0 to 255.
//        String zeroTo255
//                = "(\\d{1,2}|(0|1)\\"
//                + "d{2}|2[0-4]\\d|25[0-5])";
//
//        // Regex for a digit from 0 to 255 and
//        // followed by a dot, repeat 4 times.
//        // this is the regex to validate an IP address.
//        String pattern
//                = zeroTo255 + "\\."
//                + zeroTo255 + "\\."
//                + zeroTo255 + "\\."
//                + zeroTo255;
//
//        // Compile the ReGex
//        Pattern p = Pattern.compile(pattern);
//
//        // If the IP address is empty
//        // return false
//        if (ip == null) {
//            return false;
//        }
//
//        // Pattern class contains matcher() method
//        // to find matching between given IP address
//        // and regular expression.
//        Matcher m = p.matcher(ip);
//
//        // Return if the IP address
//        // matched the ReGex
//        return m.matches();
//    }
}

//Write your code here
