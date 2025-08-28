import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HallowRectangle {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int r,space,star,n;
        n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            int stars = n - i;
            int spaces = 2 * i;

            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        
        for (int i = 0; i < n; i++) {
            int stars = i + 1;
            int spaces = 2 * (n - i - 1);

            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
