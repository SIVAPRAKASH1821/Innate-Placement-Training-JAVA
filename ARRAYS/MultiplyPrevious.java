import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc  = new Scanner(System.in);
        int i=0, s = sc.nextInt();
        int a[] = new int[s];
        for(i=0;i<s;i++){
            a[i] = sc.nextInt();
        }
        System.out.print((a[0]*a[1])+" ");
        for(i=1;i<s-1;i++){
            int n  = a[i-1]*a[i+1];
            System.out.print(n+" ");
        }
        System.out.print(a[s-1]*a[s-2]);
    }
}
