/***********************


Java's BitSet class implements a vector of bit values (i.e.:  () or  ()) that grows as needed, allowing us to easily manipulate bits while optimizing space (when compared to other collections). Any element having a bit value of  is called a set bit.

Given  BitSets,  and , of size  where all bits in both BitSets are initialized to , perform a series of  operations. After each operation, print the number of set bits in the respective BitSets as two space-separated integers on a new line.



Input Format



The first line contains  space-separated integers,  (the length of both BitSets  and ) and  (the number of operations to perform), respectively. 
 The  subsequent lines each contain an operation in one of the following forms:
•AND 
•OR 
•XOR 
•FLIP
•SET 

In the list above,  is the integer  or , where  denotes  and  denotes . 
 is an integer denoting a bit's index in the BitSet corresponding to . 

For the binary operations , , and , operands are read from left to right and the BitSet resulting from the operation replaces the contents of the first operand. For example:
AND 2 1


 is the left operand, and  is the right operand. This operation should assign the result of  to . 

Constraints
•
•



Output Format



After each operation, print the respective number of set bits in BitSet  and BitSet  as  space-separated integers on a new line.



Sample Input


5 4
AND 1 2
SET 1 4
FLIP 2 2
OR 2 1




Sample Output


0 0
1 0
1 1
1 2




Explanation



Initially: , , , and . At each step, we print the respective number of set bits in  and  as a pair of space-separated integers on a new line.

 
 
,  
 The number of set bits in  and  is .

 
 Set  to  (). 
, . 
 The number of set bits in  is  and  is .

 
 Flip  from  () to  (). 
, . 
 The number of set bits in  is  and  is .

 
. 
, . 
 The number of set bits in  is  and  is .

****************************/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int M = s.nextInt();
        //System.out.println("N:"+N+" M:"+M);
        int B1[] = new int[N];
        for(int b:B1)
            b =0;
        int B2[] = new int[N];
        for(int b:B2)
            b =0;
        for(int i=0;i<M;i++){
            String operand = s.next();
            int set1 = s.nextInt();
            int set2 = s.nextInt();
            //System.out.println(operand+" "+set1+" "+set2);
            for(int j=0;j<N;j++){
                switch(operand){
                    case "AND" : B2[j] = B1[j] & B2[j];
                                 break;
                    case "OR"  : B2[j] = B1[j] | B2[j] ;
                                 break;
                    
                    case "XOR" : B2[j] = B1[j] ^ B2[j] ;
                                 break;
                }
            }
            switch(operand){
                case "FLIP" : if(set1 == 1){
                                    if(B1[set2] == 0)
                                        B1[set2] = 1;
                                    else
                                        B1[set2] = 0;
                                 }
                                 else if(set1 == 2){
                                     if(B2[set2] == 0)
                                        B2[set2] = 1;
                                    else
                                        B2[set2] = 0;
                                 }
                                 break;
                case "SET" : if(set1 == 1)
                                    B1[set2] = 1;
                                 else if(set1 == 2)
                                    B2[set2] = 1;
                                 break;
            }
            //System.out.println(Arrays.toString(B1));
            //System.out.println(Arrays.toString(B2));
            int count1 = 0;
            for(int k:B1){
                if(k == 1)                
                    count1++;
            }
            System.out.print(count1+" ");
            int count2 = 0;
            for(int k:B2){
                if(k == 1)                
                    count2++;
            }
            System.out.println(count2);
        }
    }
}