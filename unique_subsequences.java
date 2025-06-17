
import java.util.HashSet;


public class unique_subsequences {
    public static void subsequences(String a,int n,String ne,HashSet<String> set){
        if(n==a.length()){
        
        if(set.contains(ne)){
            return;
        }
        else{
            System.out.println(ne);
            set.add(ne);
            return;
        }
        }
        char curr=a.charAt(n);
        subsequences(a, n+1, ne+curr,set);
        subsequences(a, n+1, ne,set);
    }
    public static void main(String []args){
        HashSet<String> set = new HashSet<>();
        subsequences("aaa", 0, "",set);
    }
}

