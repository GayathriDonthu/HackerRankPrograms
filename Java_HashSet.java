/******************************************8



Input Format



In the first line, there will be an integer  denoting number of pairs. Each of the next  lines will contain two strings seperated by a single space.

Constraints:
•
•Length of each string is atmost  and will consist lower case letters only.



Output Format



Print  lines. In the  line, print number of unique pairs you have after taking  pair as input.



Sample Input


5
john tom
john mary
john tom
mary anna
mary anna




Sample Output


1
2
2
3
3


***********************************************/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

	        //System.out.println(Arrays.toString(pair_left));        
        //System.out.println(Arrays.toString(pair_right));
        int count = 0;
        Set<String> pair = new HashSet<String>();
        for(int i=0;i<t;i++){
            if(pair.add(pair_left[i]+" "+pair_right[i]) == true)
                count++;
            System.out.println(count);
        }
        //System.out.println(Arrays.toString(pair.toArray()));
 }
}