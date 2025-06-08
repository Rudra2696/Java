//Solid Diamond pattern
//   *
//  *** 
// *****
//******* 
//*******
// ***** 
//  ***
//   *



public class pattern14 {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int j=1;j<=(4-i);j++){
                System.out.print(" ");
            }
            for(int x=1;x<=(2*i)-1;x++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=4;i>=1;i--){
            for(int j=(4-i);j>=1;j--){
                System.out.print(" ");
            }
            for(int x=(2*i)-1;x>=1;x--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
