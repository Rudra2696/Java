// Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
// If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
// If they enter 0 then stop.
// If he/ she scores :
// Marks >=90 -> print “This is Good”
// 89 >= Marks >= 60 -> print “This is also Good”
// 59 >= Marks >= 0 -> print “This is Good as well”


import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 1 to start inputing marks or enter 0 for stop : ");
        int a=sc.nextInt();
        if(a==0){
            System.out.println("You stopped the program");
        }
        else if(a==1){
            System.out.println("If you want to stop program press 0");
            
            while(true){
                System.out.println("Enter marks of student : ");
            int b=sc.nextInt();
            if(b==0){
                System.out.println("You entered 0 so program was stoped");
                break;
            }
            else if(b>=90 && b<=100){
                System.out.println("This is Good");
            }
            else if(b>=60 && b<90){
                System.out.println("This is also Good");
            }
            else if(b>=0 && b<60){
                System.out.println("This is good as well");
            }
            else if(b>100){
                System.out.println("Invalid Input\nMarks should be maximum 100");
            }
            else{
                System.out.println("You entered negative number\nWhich not possible");
            }

        }
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
