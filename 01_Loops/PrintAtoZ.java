public class PrintAtoZ {

    public static void main(String[] args) {
        //code to print a to z 
        for(char ch = 'a';ch<='z';ch++){
            System.out.print(ch + " ");
        }
        int num = 65;
        System.out.println((char)num);//int to char

        System.out.println((int)'z');//char to int
    }
}