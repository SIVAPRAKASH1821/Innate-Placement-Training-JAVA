import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int even = 0, s = sc.nextInt();
        int a[] = new int[s];
        
        for(int i=0;i<s;i++){
            a[i] = sc.nextInt();
            if(a[i]%2==0)
                even++;
        }
        System.out.println("Odd = "+(s-even));
        System.out.println("Even = "+even);
    }
}
