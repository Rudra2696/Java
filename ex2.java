
import java.util.Scanner;


public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth term : ");
        int n = sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("\n The summation of "+n+"th term = "+sum);
        sc.close();
    }
}
