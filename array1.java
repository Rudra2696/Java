import java.util.Scanner;


public class array1{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements do you want to enter : ");
        int a = sc.nextInt();
        int [] user = new int [a];
        for(int i=0;i<a;i++){
            System.out.println("Enter "+(i+1)+" term : ");
             user[i] = sc.nextInt();
        }
        System.out.println("Now enter the element you want to find index : ");
        int b = sc.nextInt();
        for(int j=0;j<a;j++){
            if(user[j]==b){
                System.out.println("The index of "+b+" = "+(j+1));
                break;
            }
        }
    }
}
