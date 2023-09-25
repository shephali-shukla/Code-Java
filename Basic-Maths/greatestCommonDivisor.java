public class greatestCommonDivisor {
    public static void main(String[] args) {
        
        int n1 = 90;
        int n2 = 30;
        int gcd = 0;

        int min = Math.min(n1, n2);

        for(int i=1;i<=min;i++){
            if(n1 % i == 0 && n2 % i == 0){
                gcd = i;
            }
        }
        System.out.println("The GCD for " + n1 + " & " + n2 + " is " + gcd);
    }
}
