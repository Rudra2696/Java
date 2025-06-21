public class choice_way {
   
   public static int choice(int n){
   if(n<=1){
    return 1;
   }
    int single=choice(n-1);
    int pair=(n-1)*choice(n-2);
    return single+pair;
   }
    public static void main(String[] args) {
        System.out.println(choice(4));
    }
    
}
