import java.io.*;
import java.util.*;

public class alpNum {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        char ch = s.next().charAt(0);
        if(Character.isDigit(ch))
            System.out.println("NUMBER");
        else if(Character.isLetter(ch))
            System.out.println("ALPHABET");
        else
            System.out.println("SPECIAL CHARACTER");
    }
}