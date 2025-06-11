public class sort_insert_array {
    public static void main(String[] args) {
        int a[]={5,8,6,9,2};
        for(int i=1;i<a.length;i++){
            int cur=a[i];
            int j=i-1;
            while (j>=0 && cur<a[j]) {
              a[j+1]=a[j];
              j--;  
                
            }
            a[j+1]=cur;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
