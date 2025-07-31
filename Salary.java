import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Salary {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int basicSalary = scanner.nextInt();

        double hra, da;

        if (basicSalary <= 10000) {
            hra = 0.20 * basicSalary;
            da = 0.80 * basicSalary;
        } else if (basicSalary <= 20000) {
            hra = 0.25 * basicSalary;
            da = 0.90 * basicSalary;
        } else {
            hra = 0.30 * basicSalary;
            da = 0.95 * basicSalary;
        }

        double grossSalary = basicSalary + hra + da;

        System.out.printf("Rs.%.2f\n", grossSalary);
    }
}