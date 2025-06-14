public class recursion_factorial {
    public static void fact(int n, int mul){
        if(n>0){
            mul*=n;
            fact(n-1,mul);
        }
        else if(n==0){
            System.out.println(mul);
        }
    }
    public static void main(String[] args) {
        fact(5,1);
    }
}
