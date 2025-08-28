import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class centre0 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        
        int mid1 = (n - 1) / 2; 
        int mid2 = n / 2;       

        for (int r = 0; r < n; r++) {
            for (int c = 0; c< n; c++) {
                if ((r == mid1 || r == mid2) && (c == mid1 || c == mid2)) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}
