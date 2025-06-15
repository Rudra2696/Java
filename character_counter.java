public class character_counter {
    public static void counter(String a,char b,int n,int count) {
        char c=a.charAt(n);
        if(c==b){
            count++;
        }
        else if(n==0){
            System.out.println(count);
            return;
        }
        counter(a, b, n-1, count);
    }
    public static void main(String[] args) {
        String a="aaaabcdcsb";
        char b='m';
        int count=0;
        counter(a, b, a.length()-1, count);
    }
}
