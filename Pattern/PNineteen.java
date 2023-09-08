package Pattern;

public class PNineteen {
    public static void main(String[] args) {
        
        //Upper-half
        for(int i=5;i>=1;i--){

            for(int j=1;j<=i;j++){
                System.out.print(j);
            }

            for(int j=i;j<5;j++){
                System.out.print(" ");
            }

            for(int j=5;j>i;j--){
                System.out.print(" ");
            }

            for(int j=i;j>=1;j--){
                System.out.print(j);
            }

            System.out.println();
        }

        //Lower-half
        for(int i=1;i<=5;i++){
            
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }

            for(int j=i;j<5;j++){
                System.out.print(" ");
            }

            for(int j=i;j<5;j++){
                System.out.print(" ");
            }

            for(int j=i;j>=1;j--){
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
