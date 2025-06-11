/*
 * Q.9 : Check number is prime or not
 * Input : 17
 * Output : Prime
 * Input : 16 
 * Output : Not Prime
 * Input : -9
 * Ouput : Not Prime
 */
public class Prime {
    public static void main(String[] args) {
        
        int num = 17;

        if(num<2) System.out.println("Not prime"); //Numbers less than 2 are non prime
        else if(num==2) System.out.println("Prime");
        else if(num%2==0) System.out.println("Not prime");
        else{
            for(int n=2;n<num;n+=1){
                if(num%n==0){
                    System.out.println("Not prime");
                }
            }
            System.out.println("Prime");
        }
    }
}
