import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        for(int i=0;i<n;i++){
            int len = s.nextInt();
            int a[] = new int[len];
            int position = s.nextInt();
            for(int j=0;j<len;j++)
                a[j]=s.nextInt();
            //System.out.println(Arrays.toString(a));
            int index = 0;
            int inc = 0;
            String path = "front";
            while(index < len){
                //System.out.println("index:"+index);
                if(inc == 1 && index+1 < len-1 && a[index+1] == 0){
                    index = index+1;
                    inc = 1;
                }
                else if(path.equals("front") && position != 0 && index+position <len-1 && a[index+position] == 0){
                    index = index + position;
                    inc = position;
                }
                else if(index+1 >= len-1){
                    System.out.println("YES");
                    break;
                }
                else if(position >= len-1 || index+position >= len-1){
                    System.out.println("YES");
                    break;
                }
                else if(index > 0 && index < len-1){
                    index = index - inc;
                    if(inc == 1)
                        inc = position;
                    else 
                        inc = 1;
                }
                else{
                    System.out.println("NO")                    ;
                    break;
                }
            }
        }
    }
}