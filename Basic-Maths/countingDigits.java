public class countingDigits {
    public static void main(String[] args) {
        
        int n=76546;
        int count = 0;

        while(n > 0){
            n /= 10;
            count++;
        }

        System.out.println("Digits present = " + count);
    }
}
