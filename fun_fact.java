
import java.util.Scanner;



public class fun_fact {

    public static int fact(int a) {
        int mul=1;
        for(int i=1;i<=a;i++){
            mul=mul*i;
        }
        return mul;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any integer : ");
        int a=sc.nextInt();
        System.out.println("The Factorial of "+a+" = "+fact(a));
    }
}
