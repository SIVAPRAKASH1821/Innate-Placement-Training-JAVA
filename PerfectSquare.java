import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PerfectSquare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sr = (long)Math.sqrt(n);
        if(sr*sr==n)
            System.out.println("Perfect Square");
        else
            System.out.println("Not");
    }
}
