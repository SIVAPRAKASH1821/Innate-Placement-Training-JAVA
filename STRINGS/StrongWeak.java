import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int u=0,l=0,s=0,n=0;
        
        for(int i=0;i<=a.length()-1;i++){
            char c=a.charAt(i);
            if(c>='A' && c<='Z')
                u=1;
            else if(c>=97 && c<=122)
                l=1;
            else if(c>=48 && c<=57)
                n=1;
            else
                s=1;
        }
        if(u+l+n+s==4)
            System.out.println("Strong password");
        else
            System.out.println("Weak password");
    }
}
