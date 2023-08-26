package Pattern;

public class PEight {
    public static void main(String[] args) {
        
        for(int i=1;i<=5;i++){
            //space
            for(int j=5;j>i;j--){
                System.out.print(" ");
            }
            //digits
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
