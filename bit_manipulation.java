public class bit_manipulation {
    public static void main(String[] args) {
        int n=5;
        int pos=2;
        int bitMask=1<<pos;
        int nbitMask=~(bitMask);
        if((nbitMask & n)==0){
            System.out.println("Bit is zero");
        }
        else{
            System.out.println("Bit is non zero");
        }
        System.out.println(nbitMask & n);
    }
}
