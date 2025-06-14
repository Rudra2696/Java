public class recursion_print {
    public static void print(int n) {
        if(n>0){
        System.out.println(n);
        print(n-1);
        }

    }
    public static void main(String[] args) {
        int n=5;
        print(n);
    }
}
