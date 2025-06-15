public class string_remove_duplicate {
   public static boolean arr[]=new boolean[26];
   public static void duplicate(String a,int n,String news) {
       if(n==a.length()){
        System.out.println(news);
        return;
       }
       char newc=a.charAt(n);
       if(arr[newc-'a']){
        duplicate(a, n+1, news);
       }
       else{
        news+=newc;
        arr[newc-'a']=true;
        duplicate(a, n+1, news);
       }
   }
    public static void main(String[] args) {
        duplicate("aabbdfcsrr", 0, "");
    }
}
