import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GPFactor {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(GPF(n));
    }
  
public static int GPF(int n){
        int maxPrime = -1;
        while (n % 2 == 0) {
            maxPrime = 2;
            n /= 2;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                maxPrime = i;
                n /= i;
            }
        }
        if (n > 2) {
            maxPrime = n;
        }
        return maxPrime;
    }
}
