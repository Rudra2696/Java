public class recursion_sum {
    public static void sum(int n,int suma) {
        if(n>0){
            suma +=n;
            sum(n-1,suma);  
        }
        else if(n==0){
            System.out.println(suma);
        }
    }
    public static void main(String[] args) {
        int n=5;
        sum(n,0);
    }
}
