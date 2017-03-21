import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        //System.out.println(n);
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            list.add(s.nextInt());
        }
        //System.out.println(list.toString());
        int q = s.nextInt();
        for(int i=0;i<q;i++){
            String command = s.next();
            //System.out.println(command);
            if(command.equalsIgnoreCase("Insert")){
                int index = s.nextInt();
                int element = s.nextInt();
                //System.out.println(index+":"+element);
                list.add(index, element);
                //System.out.println(list.toString());
            }
            else if(command.equalsIgnoreCase("Delete")){
                int index = s.nextInt();
                //System.out.println(index);
                list.remove(index);
                //System.out.println(list.toString());
            }
        }
        for(Integer i:list)
            System.out.print(i+" ");
    }
}
