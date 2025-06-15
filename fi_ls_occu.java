public class fi_ls_occu {
    public static int first=-1;
    public static int last=-1;
    public static void occurance(String a,int ind, char element){
        if(ind==a.length()){
            System.out.println("first occurance = "+first);
            System.out.println("last occurance = "+last);
            return;
        }
        if(a.charAt(ind)==element){
            if(first==-1){
                first=ind;
            }else{
                last=ind;
            }         
        }
        occurance(a, ind+1, element);

    }
    public static void main(String[] args) {
        occurance("aaaabkhvvwiogagrwobvaghgojao", 0, 'a');
    }

}
