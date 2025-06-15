public class array_strict_increase {
    public static boolean sort(int a[],int n){
        if(n==a.length-1){
            return true;
        }
        if(a[n]<a[n+1]){
            return sort(a, n+1);
        }
        else{
            return false;
        }
        
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,4};
        System.out.print(sort(a, 0));
    }
}
