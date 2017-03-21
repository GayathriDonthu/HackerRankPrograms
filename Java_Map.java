//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
   public static void main(String []argh)
   {
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      in.nextLine();
      Map<String, Long> book = new HashMap<String, Long>();
      for(int i=0;i<n;i++)
      {
         String name=in.nextLine();
         long phone=in.nextInt();
         in.nextLine();
         //System.out.println(name+" "+phone);
         book.put(name, phone);
         
      }
      while(in.hasNext())
      {
         String s=in.nextLine();
         if(book.containsKey(s))
             System.out.println(s+"="+book.get(s));
         else 
             System.out.println("Not found");
      }
   }
}
