public class divisors {
    public static void main(String[] args) {
        
        int num = 45;
        for(int i=2;i<=num/2;i++){
            if(num % i == 0){
                System.out.println(i);
            }
        }
    }
}
