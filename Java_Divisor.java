/**********************

Divisor program

***************/

class MyCalculator implements AdvancedArithmetic{
    public int divisor_sum(int n){
        List<Integer> divisors = new ArrayList<Integer>();
        divisors.add(1);
        for(int i = 2; i<= n;i++){
            if(n%i == 0)
                divisors.add(i);
        }
        int sum = 0;
        for(int j: divisors){
            sum= sum+j;
        }
        return sum;
    }
}