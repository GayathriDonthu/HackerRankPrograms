
/***************************
You are given a  2D array. An hourglass in an array is a portion shaped like this:
a b c
  d
e f g


For example, if we create an hourglass using the number 1 within an array full of zeros, it may look like this:
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0


Actually, there are many hourglasses in the array above. The three leftmost hourglasses are the following:
1 1 1     1 1 0     1 0 0
  1         0         0
1 1 1     1 1 0     1 0 0


The sum of an hourglass is the sum of all the numbers within it. The sum for the hourglasses above are 7, 4, and 2, respectively.

In this problem you have to print the largest sum among all the hourglasses in the array.



Input Format



There will be exactly  lines, each containing  integers seperated by spaces. Each integer will be between  and  inclusive.



Output Format



Print the answer to this problem on a single line.



Sample Input


1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0




Sample Output


19




Explanation



The hourglass which has the largest sum is:
2 4 4
  2
1 2 4

******************************************************/

//Code:

package com.beginner;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HourGlass {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int a[][] = new int[3][3];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        //System.out.println(Arrays.deepToString(arr));
        List list = new ArrayList();
        int sum = 0;
        for(int k=0; k < 4; k++){
        for(int l = 0; l < 4; l++){
            for(int i=0, t = k; i < 3; i++, t++){
                for(int j=0, b=l; j< 3; j++, b++){
                  a[i][j] = arr[t][b];
                  //System.out.println("a["+i+"]["+j+"]="+a[i][j]);
                  if((i == 1) && ((j == 0) || (j == 2)))
                      a[i][j] = 0;
                  sum=sum+a[i][j];
                  if((i == 2) && (j == 2)){
                      list.add(sum);
                      sum = 0;
                      //System.out.println(Arrays.deepToString(a));
                  }
                }
            }
        }
        }
        
        //System.out.println(list.toString());
        Collections.sort(list);
        //System.out.println(list.toString());
        System.out.println(list.get(list.size()-1));
        
    }
}
