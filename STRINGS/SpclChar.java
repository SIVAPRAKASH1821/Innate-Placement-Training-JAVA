import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SpclChar {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(!Character.isLetterOrDigit(c))
                count++;
        }
        System.out.println(count);
    }
}
