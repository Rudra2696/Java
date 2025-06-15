public class Reverse_string {
   public static void reverse_string(String a,int n) {
    if(n==0){
        System.out.print(a.charAt(n));
        return;
    }
    System.out.print(a.charAt(n));
    reverse_string(a, n-1);
       
   }
    public static void main(String[] args) {
        String a= "abcd";
        reverse_string(a, a.length()-1);
    }
}
