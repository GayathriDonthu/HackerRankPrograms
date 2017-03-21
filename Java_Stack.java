/************************************************8



A string containing only parentheses is balanced if the following is true: 1. if it is an empty string 2. if A and B are correct, AB is correct, 3. if A is correct, (A) and {A} and [A] are also correct.

Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})" 


Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.


Given a string, determine if it is balanced or not. 



Input Format



There will be multiple lines in the input file, each having a single non-empty string. You should read input till end-of-file.

The part of the code that handles input operation is already provided in the editor.



Output Format



For each case, print 'true' if the string is balanced, 'false' otherwise.



Sample Input


{}()
({()})
{}(
[]




Sample Output


true
true
false
true




******************************************/


import java.util.*;
class Solution{
   
   public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in);
      
      while (sc.hasNext()) {
         String input=sc.next();
         boolean flag = match(input);
         System.out.println(flag);
      }
      
   }
   
   static boolean match(String str){
       if(str.isEmpty())
           return true;
       
       Stack<Character> stack = new Stack<Character>();
       for(int i=0;i<str.length();i++){
           char present = str.charAt(i);
           if(present == '{' || present == '[' || present == '(')
               stack.push(present);
           if(present == '}' || present == ']' || present == ')'){
               if(stack.isEmpty())
                   return false;
               
               char last = stack.peek();
               if((present == '}' && last == '{') || ( present == ']' && last == '[') || (present == ')' && last == '('))
                   stack.pop();
               else
                   return false;
           }
               
       }
       return stack.isEmpty();
   }
}
