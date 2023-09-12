public class countingDigits {
    public static void main(String[] args) {

        //Solution 1: while loop
        int n=76546;
        int count = 0;

        while(n > 0){
            n /= 10;
            count++;
        }
        System.out.println("Digits present = " + count);


        //solution 2: convert int to String & use function
        int n1=76546;
        String val = String.valueOf(n1); // Integer.toString(n1);

        System.out.println("Sol 2 = " + val.length());

        //Solution 3:Using log10()+1

    }
}
