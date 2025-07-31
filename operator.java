import java.io.*;
import java.util.*;

public class operator {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        char b = s.next().charAt(0);
        int c = s.nextInt();
        
        switch(b)
        {
            case '+':
                System.out.println(a+c);
                break;
            case '-':
                System.out.println(a-c);
                break;
            case '*':
                System.out.println(a*c);
                break;
            case '/':
                System.out.println(a/c);
                break;
            default:
                break;
        }
    }
}