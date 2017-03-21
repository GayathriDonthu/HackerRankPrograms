/******************************

Program
-----------------

Sometimes it's better to use dynamic size arrays. Java's Arraylist can provide you this feature. Try to solve this problem using Arraylist.


You are given  lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the number located in  position of  line. 


Take your input from System.in.

Input Format
 The first line has an integer . In each of the next  lines there will be an integer  denoting number of integers on that line and then there will be  space-separated integers. In the next line there will be an integer  denoting number of queries. Each query will consist of two integers  and .

Constraints








Each number will fit in signed integer.
 Total number of integers in  lines will not cross 100000.


Output Format
 In each line, output the number located in  position of  line. If there is no such position, just print "ERROR!"



Sample Input


5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5




Sample Output


74
52
37
ERROR!
ERROR!

***************************************8/

//Code:

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        //System.out.println("n:"+n);
        int arr[][] = new int[n][];
        for(int i=0;i<n;i++){
            int d = s.nextInt();
            int a[] = new int[d];
            for(int j=0;j<d;j++){
                a[j]=s.nextInt();
            }
            arr[i]=a;
        }
        //System.out.println(Arrays.deepToString(arr));
        
        int q = s.nextInt();
        //System.out.println("q:"+q);
        for(int k = 0; k< q;k++){
            int line = s.nextInt();
            int position = s.nextInt();
            //System.out.println("line:"+line+" position:"+position);
            if(position > (arr[line-1].length))
                System.out.println("ERROR!");
            else
                System.out.println(arr[line-1][position-1]);
        }
    }
}