import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class revXspcl {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] a = s.toCharArray();
        char temp = 0;
        int l = 0, r = a.length - 1;

        while (l < r) {
            if (!Character.isLetterOrDigit(a[l])) {
                l++;
            }
            else if (!Character.isLetterOrDigit(a[r])) {
                r--;
            }
            else {
                temp = a[l];
                a[l] = a[r];
                a[r] = temp;
                l++;
                r--;
            }
        }

        System.out.println(new String(a));
    }
}
