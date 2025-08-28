import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class rectangle {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int row,col,n;
        n = sc.nextInt();
        for(row=1;row<=n;row++){
            for(col=1;col<=n;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
