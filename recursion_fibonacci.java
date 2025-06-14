public class recursion_fibonacci {
    public static void fibo(int n,int x, int y) {
        if(n==2){
           return;
       }
        else if(n>0){
            int a1=x;
            int a2=y;
            int a3=x+y;
            System.out.print(a3+" ");
            fibo(n-1,a2,a3);
        }
        
    }
    public static void main(String[] args) {
        System.out.print("0 1 ");
        fibo(5,0,1);
    }
}
