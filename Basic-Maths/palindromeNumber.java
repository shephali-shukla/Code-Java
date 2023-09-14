public class palindromeNumber {
    public static void main(String[] args) {
        
        int n = 121;
        int d = n; int rev = 0;

        while(n > 0){
            int digit = n % 10;
            rev = (rev * 10) + digit;
            n /= 10;
        }

        //System.out.println(rev);

        if(rev == d){
            System.out.println("Palindrome!");
        }else{
            System.out.println("Not Palindrome!");
        }
    }
}
