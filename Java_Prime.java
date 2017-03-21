/************************

Program for prime numbers

**********************/

import static java.lang.System.in;

class Prime{
    public void checkPrime(int... input){
        for(int i:input){
            int m =0, flag = 0;
            m = i/2;
            if(i == 1)
                flag = 1;
            else{
                for(int j=2;j<=m;j++){
                  if(i%j == 0){
                     flag = 1;
                     break;
                  }
                }
            }
            if(flag == 0)
                System.out.print(i+" ");
        }
        System.out.println();
    }
}