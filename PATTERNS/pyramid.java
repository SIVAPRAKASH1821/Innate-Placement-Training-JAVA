import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class pyramid {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n,row,col,s;
        n = sc.nextInt();
        for(row=1;row<=n;row++){
            for(s=1;s<=n-row;s++){
                System.out.print(" ");
            }
            int star = 2*row-1;
            for(col=1;col<=star;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
