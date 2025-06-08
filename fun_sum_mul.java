import java.util.Scanner;


public class fun_sum_mul {

    public static int sum(int a,int b) {
        return a+b;
    }
    public static int mul(int a,int b) {
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any integer : ");
        int n = sc.nextInt();
        System.out.print("Enter any integer : ");
        int n1 = sc.nextInt();
        System.out.println("The summation of "+n+" and "+n1+" = "+sum(n,n1));
        System.out.println("The multiplication of "+n+" and "+n1+" = "+mul(n,n1));
    }
}