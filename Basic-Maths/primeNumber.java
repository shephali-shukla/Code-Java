public class primeNumber {
    public static void main(String[] args) {
        
        //Brute Force
        int n = 17;int c = 0;

        for(int i=2;i<n/2;i++){
            if(n % i == 0){
                c++;
            }
        }

        if(c > 0){
            System.out.println("Not a Prime Number");
        }else{
            System.out.println("Prime Number");
        }
    }
}
