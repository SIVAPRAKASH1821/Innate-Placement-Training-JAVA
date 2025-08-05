import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LPFactor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(LPF(n));
    }
        public static long LPF(long n){
            if (n == 1) {
            return 1;
        }
        if (n % 2 == 0) {
            return 2;
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return i;
            }
        }
        return n;
    }
}
