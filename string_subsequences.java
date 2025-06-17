

public class string_subsequences {
    public static void subsequences(String a,int n,String ne){
        if(n==a.length()){
            System.out.println(ne);
            return;
        }
        char curr=a.charAt(n);
        subsequences(a, n+1, ne+curr);
        subsequences(a, n+1, ne);
    }
    public static void main(String []args){
        subsequences("abc", 0, "");
    }
}
