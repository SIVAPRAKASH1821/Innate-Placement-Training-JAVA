import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();

        boolean[] letters = new boolean[26]; 
        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                letters[c - 'a'] = true;
            }
        }
        boolean isPangram = true;
        for (boolean present : letters) {
            if (!present) {
                isPangram = false;
                break;
            }
        }

        if (isPangram) {
            System.out.println("Pangrams");
        } else {
            System.out.println("Not Pangrams");
        }
    }
}    
