import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int a[] = new int[s];
        
        for(int i=0;i<s;i++){
            a[i] = sc.nextInt();
        }
        boolean hasUnique = false;
        for(int i=0;i<s;i++){
            int count = 0;
            for(int j=0;j<s;j++){
                if(a[i]==a[j])
                    count++;
            }
            if(count==1){
                System.out.print(a[i]+" ");
                hasUnique = true;
            }
        }
        if(!hasUnique)
            System.out.println("No unique elements in the array");
        else
            System.out.println();
    }
}
