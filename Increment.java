import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Increment {

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),
        b = sc.nextInt();
        int pre = ++a;
        int post = b++;
        System.out.println("Pre increment:"+pre);
        System.out.println("Post increment:"+post);
        System.out.println("Final values:"+a+" "+b);
    }
}
