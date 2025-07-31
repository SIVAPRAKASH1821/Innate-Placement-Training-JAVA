import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinNotes {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        
        int[] notes = {500,100,50,20,10,5,2,1};
        int[] total = new int[8];
        
        for(int i=0;i<notes.length;i++){
            total[i] = a/notes[i];
            a %= notes[i];
        }
        System.out.println("Total number of notes:");
        for(int i=0;i<8;i++){
            System.out.println(notes[i]+" : "+total[i]);
        }
    }
}