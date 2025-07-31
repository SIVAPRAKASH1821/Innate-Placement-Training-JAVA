import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class rightTriangle {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(),
        b = s.nextInt(),
        c = s.nextInt();
        
        if(a+b+c == 180)
            System.out.println("Valid");
        else
            System.out.println("Not Valid");
    }
}