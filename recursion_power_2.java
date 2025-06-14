public class recursion_power_2 {
    
    public static int power(int n,int x) {
        if(n==0){
            return 1;
        }
        else if(x==0){
            return 0;
        }
        if(n%2==0){
            return power(n/2,x)*power(n/2,x);
        }
        else{
           return power(n/2,x)*power(n/2,x) * x; 
        }
    }
    public static void main(String[] args) {
        System.out.println(power(2,5));
    }
}
