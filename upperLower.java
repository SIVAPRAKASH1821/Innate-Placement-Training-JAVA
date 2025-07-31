import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class upperLower {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        char ch = s.next().charAt(0);
        int num = (int)ch;
        
        if(num>=65 && num<=90)
            System.out.println("UPPERCASE");
        else
            System.out.println("LOWERCASE");
    }
}