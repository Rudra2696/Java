//Butterfly pattern

public class pattern10 {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int x=1;x<=i;x++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(4-i);j++){
                System.out.print(" ");
            }
            for(int z=1;z<=i;z++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=4;i>=1;i--){
           for(int x=1;x<=i;x++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(4-i);j++){
                System.out.print(" ");
            }
            for(int z=1;z<=i;z++){
                System.out.print("*");
            }
            System.out.println(); 
        }
    }
}
