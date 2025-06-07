import java.util.Scanner;

public class ex1
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st element : ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd element : ");
        int b = sc.nextInt();
        int sum=a+b;
        System.out.println("The summation of "+a+" and "+b+" = "+sum);
        
    }
}