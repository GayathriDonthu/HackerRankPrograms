import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("n:"+n);
        int a[][] = new int[n][];
        for(int j =0; j<n;j++){
            int d = s.nextInt();
            int arr[] = new int[d];
            for(int i=0;i<d;i++)
                arr[i] = s.nextInt();
            //System.out.println(Arrays.toString(arr));
            a[j]=arr;
        }
        //System.out.println(Arrays.deepToString(a));
        int no_queries = s.nextInt();
        for(int k = 0; k<no_queries;k++){
           int line = s.nextInt();
           int position = s.nextInt();
           System.out.println(a[line][position]);
        }
    }
}