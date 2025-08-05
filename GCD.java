import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GCD {

    public static int gcd(int a,int b){
        while(b!=0){
                int temp = b;
                b = a%b;
                a = temp;
            }
            return Math.abs(a);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),b = sc.nextInt();
        int c = gcd(a,b);
        System.out.println("GCD of two number is "+c);
    }
}
