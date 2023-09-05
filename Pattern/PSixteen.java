package Pattern;

public class PSixteen {
    public static void main(String[] args) {
        
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }

            for(int j=i;j<5;j++){
                System.out.print("_");
            }

            for(int j=5;j>i;j--){
                System.out.print("_");
            }

            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
