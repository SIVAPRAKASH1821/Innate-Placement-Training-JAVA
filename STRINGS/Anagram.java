import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Anagram {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s1 = sc.nextLine().trim();
        String s2 = sc.nextLine().trim();
        if(s1.length() == s2.length()) {

            char[] a1 = s1.toCharArray();
            char[] a2 = s2.toCharArray();

            Arrays.sort(a1);
            Arrays.sort(a2);

            boolean result = Arrays.equals(a1,a2);

            if(result) {
                System.out.println(s1+" and " + s2 +" are Anagrams.");
            }
            else {
                System.out.println(s1+" and " + s2 +" are Not Anagrams.");
            }
    }
        else {
            System.out.println(s1+" and " + s2 +" are Not Anagrams.");
    }
  }
}
