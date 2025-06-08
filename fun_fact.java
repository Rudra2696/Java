
import java.util.Scanner;



public class fun_fact {

    public static void fact(int a) {
        if(a==0){
            System.out.println("The factorial of 0 = 0");;
        }
        else if(a<0){
            System.out.println("You entered negative integer");
        }
        else {
            int mul=1;
            for(int i=1;i<=a;i++){
                mul=mul*i;
            }
        }    
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any integer : ");
        int a=sc.nextInt();
        fact(a);
    }
}
