import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int a[] = new int[s+1];
        
        for(int i=0;i<s;i++){
            a[i] = sc.nextInt();
        }
        int data = sc.nextInt(),
        pos = sc.nextInt();
        
        for(int i=s;i>pos-1;i--){
            a[i] = a[i-1];
        }
        a[pos-1] = data;
        
         for(int i=0;i<s+1;i++){
            System.out.print(a[i]+" ");
        }
    }
}
