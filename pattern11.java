//Solid Rhombus

public class pattern11 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=(5-i);j++){
                System.out.print(" ");
            }
            for(int z=1;z<=5;z++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
