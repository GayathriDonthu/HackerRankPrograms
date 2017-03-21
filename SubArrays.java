
/*88*************
We define the following:
•A subarray of an -element array is an array composed from a contiguous block of the original array's elements. For example, if , then the subarrays are , , , , , and . Something like  would not be a subarray as it's not a contiguous subsection of the original array.
•The sum of an array is the total sum of its elements. •An array's sum is negative if the total sum of its elements is negative.
•An array's sum is positive if the total sum of its elements is positive.


Given an array of  integers, find and print its number of negative subarrays on a new line.



Input Format



The first line contains a single integer, , denoting the length of array . 
 The second line contains  space-separated integers describing each respective element, , in array . 



Constraints


 •
•



Output Format



Print the number of subarrays of  having negative sums.



Sample Input


5
1 -2 4 -5 1




Sample Output


9




Explanation



There are nine negative subarrays of :
1.
2.
3.
4.
5.
6.
7.
8.
9.

Thus, we print  on a new line.
*******************/

//Code:

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SubArray {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int length = s.nextInt();
        int arr[] = new int[length];
        for(int i=0 ; i < length; i ++){
            arr[i] = s.nextInt();
        }
        //System.out.println(Arrays.toString(arr));
        int sub[];
        int count = 0;
        for(int l =1; l<= length; l++){
        	sub = new int[l];
            for(int k = length; k>l-1;k-- ){
       	       for(int i=0, j = length-k; i<l; i++, j++){
       		       if(j == length)
                       //System.out.println("j value:"+j);
                       break;
                   else
                     sub[i] = arr[j];
                 //System.out.println("i:"+i+" j:"+j+" k:"+k);
                }
        	    //System.out.print(Arrays.toString(sub));
                int sum=0;
                for(int val:sub)
                    sum = sum+val;
                //System.out.println(" = "+sum);
                if(sum < 0)
                    count++;
            }
        }
        System.out.println(count);
    }
}
