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
        int a[] = new int[s];
        
        for(int i=0;i<s;i++){
            a[i] = sc.nextInt();
        }
        for(int i=s-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
    }
}
