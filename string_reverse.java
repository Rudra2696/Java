


public class string_reverse {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Rudra");
        for(int i=0;i<sb.length()/2;i++){
            int f=i;
            int b = sb.length()-i-1;
            char fr=sb.charAt(f);
            char ba=sb.charAt(b);
            sb.setCharAt(f, ba);
            sb.setCharAt(b, fr);
        }
        System.out.println(sb);
    }
}
