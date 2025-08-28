import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StrLen {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        
         try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        System.out.println(count);
    }
}
