public class string_op {
    public static void xapp(String a,int n,int count,String newst){
        if(n==a.length()){
            for(int i=0;i<count;i++){
                newst+='x';
            }
            System.out.println(newst);
            return;
        }
        char newc=a.charAt(n);
       if(newc=='x'){
            count++;
            xapp(a, n+1, count, newst);
        }
        else{
            newst+=newc;
            xapp(a, n+1, count, newst);
        }
    }
    public static void main(String[] args) {
        String a="axxbcdgxxhjx";
        xapp(a, 0, 0, "");
    }
}
