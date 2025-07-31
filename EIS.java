import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EIS {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(),
        b = s.nextInt(),
        c = s.nextInt();
        
        if(a==b && b==c)
            System.out.println("Equilateral");
        else if(a==b || b==c || c==a)
            System.out.println("Isosceles");
        else
            System.out.println("Scalene");
    }
}