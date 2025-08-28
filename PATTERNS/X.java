import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class X {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int row,col,n,size;
        n=sc.nextInt();
        size = 2*n-1;
        for(row=1;row<=size;row++){
            for(col=1;col<=size;col++){
                if(row==col || row+col==size+1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
