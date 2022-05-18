package TagContentExtractor;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());
        while (testCases > 0) {
            String line = scan.nextLine();
            String regex = "<(.+)>([^<>]+)(</\\1>)";
            Pattern pattern = Pattern.compile(regex);
            Matcher match = pattern.matcher(line);
            int counter = 0;

            while(match.find()) {
                if (match.group(2).length() != 0) {
                    System.out.println(match.group(2));
                    counter++;
                }
            }
            if (counter == 0) {
                System.out.println("None");
            }
            testCases--;
        }
        scan.close();
    }
}
