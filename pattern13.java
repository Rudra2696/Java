//Palindromic pattern

//        1
//      2 1 2
//    3 2 1 2 3
//  4 3 2 1 2 3 4 
//5 4 3 2 1 2 3 4 5

public class pattern13 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=2*(5-i);j++){
                System.out.print(" ");
            }
            for(int z=i;z>=1;z--){
                System.out.print(z+" ");
            }
            for(int x=2;x<=i;x++){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
