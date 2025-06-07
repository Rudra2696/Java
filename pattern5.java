//    *
//   **
//  ***
// **** 

public class pattern5 {
    public static void main(String[] args) {
        for (int i=1;i<=4;i++){
            for(int z=1;z<=(4-i);z++){
                System.out.print(" ");
            } 
              for(int j=1;j<=i;j++){
                  System.out.print("*");
                }
                System.out.println();
            }
        }
    }

