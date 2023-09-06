package Pattern;

public class PSeventeen {
    public static void main(String[] args) {
        
        for(char i='A';i<='D';i++){

            for(char j='D';j>i;j--){
                System.out.print("_");
            }

            for(char j='A';j<=i;j++){
                System.out.print(j);
            }

            for(char j=(char) (i-1);j>='A';j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
