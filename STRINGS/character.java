import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class character {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        String s = sc.next();
        boolean isPresent = false;
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(ch == c){
                isPresent = true;
                break;
            }
        } 
            if(isPresent)
                System.out.print("Present");
            else
                System.out.print("Not Present");
    }
}
