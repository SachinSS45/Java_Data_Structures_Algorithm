/*
 * Find fiboncci number of n : 
 * Note : fibo(0) = 0 , fibo(1) = 1
 * fibo(n) = fibo(n-1) + fibo(n-2) if n>=2
 * T.C : O(n)
 */
public class Fibonacci {
    public static void main(String[] args) {
        
        int n = 6;

        int prev = 0;//fibo(0) = 0
        int curr = 1;//fibo(1) = 1
        int ans = 0;
        for(int i=2;i<=n;i++){
            ans = prev + curr;
            prev = curr;
            curr = ans;
        }
        System.out.println(ans);//8
    }
}
