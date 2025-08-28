import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class singleNum {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String n = s.replaceAll("\\D", "");
        if (n.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(n);
        }
        
    }
}
