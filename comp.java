import java.util.Scanner;

public class comp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        float a = sc.nextFloat();
        System.out.print("\nEnter 2nd number : ");
        float b = sc.nextFloat();

        if(a==b)
        {
            System.out.println("Both "+a+" and "+b+" are equal.");
        }
        else if(a>b)
        {
            System.out.println(a+" is greater than "+b);
        }
        else
        {
            System.out.println(b+" is greater than "+a);
        }
    }
}
