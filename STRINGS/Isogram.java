import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        
        String s=sc.nextLine();
        
        char[] a=s.toCharArray();
        int count=0;
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                }
            }
        }
        if(count==0){
            System.out.println("ISOGRAM");
        }else{
            System.out.println("NOT ISOGRAM");
        }
        
    }
}
