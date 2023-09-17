import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int d = n, sum = 0;

        while(n > 0){
            int digit = n % 10;
            sum += Math.pow(digit, 3);
            n /= 10;
        }

        if(sum == d){
            System.out.println("Armstrong Number!");
        }else{
            System.out.println("!Armstrong Number");
        }
        sc.close();
    }
}
