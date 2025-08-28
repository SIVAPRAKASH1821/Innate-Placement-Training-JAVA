import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class rectangleX {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int row,col,n,s,m;
        n = sc.nextInt();
        s = 2*n-1;
        m=n-1;
        for(row=1;row<=s;row++){
            for(col=1;col<=s;col++){
                if(row==1 || row==s || col==1 || col==s || row==col || row+col==s+1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
