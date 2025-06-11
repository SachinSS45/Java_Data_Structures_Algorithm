/*
 * Q.8 Factorial of number : 
 * n = 5  (5*4*3*2*1)  0!=1
 * output : 120 
 * T.C : O(n)
 */
public class Factorial {
    public static void main(String[] args) {
        
        int n = 5;
        int ans = 1;
        for(int i=1;i<=n;i++){
            ans = ans * i;
        }
        System.out.println(ans);
    }
}
