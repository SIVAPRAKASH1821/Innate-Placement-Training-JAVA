import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int sum=0 , s = sc.nextInt();
        int a[] = new int[s];
        
        for(int i=0;i<s;i++){
            System.out.print(sum+" ");
            a[i] = sc.nextInt();
            sum += a[i];
        }
    }
}
