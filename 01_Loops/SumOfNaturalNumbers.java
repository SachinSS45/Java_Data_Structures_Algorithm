/*
 * Q.7 : Sum of N natural numbers
 *  n = 10
 *  output : 55
 */
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        
        //Way 1: by using for loop
        int n = 10;
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum +=i;
        }
        System.out.println(sum);//55

        //Way 2 : by formula

        System.out.println(n*(n+1)/2);//55
    }
}
