package Maths;

public class CountPrime {
    //Not the Optimal solution Solve through Sieve of Eratosthenes
    public int countPrimes(int n) {
        if(n == 0 || n==1)
            return 0;
        int count = 0;
        for(int i = 2;i<n;i++){
            boolean isPrime = true;
            for(int j = 2;j<=i/j;j++){
                if(i%j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
                count++;
        }
        return count;
    }
}
