import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class inversePyramid {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }
            int stars = 2 * (n - i) - 1;
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
