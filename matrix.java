import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the numbers of rows : ");
        int i=sc.nextInt();
        System.out.println("Enter the numbers of columns : ");
        int j=sc.nextInt();
        int mat[][] = new int [i][j];
        for(int z=0;z<i;z++){
            System.out.println("Enter the elements of "+(z+1)+" row : ");
            for(int x=0;x<j;x++){
                mat[z][x]=sc.nextInt();
            }
        }
        System.out.println("Enter the element that you want to find index of that element : ");
        int d=sc.nextInt();
        for(int z=0;z<i;z++){
            for(int x=0;x<j;x++){
                if(mat[z][x]==d){
                    System.out.println("The index of "+d+" = "+"("+(z+1)+","+(x+1)+")");
                }
            }
        }
    }
}
