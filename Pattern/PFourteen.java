package Pattern;

class PFourteeen {
    public static void main(String[] args) {
        
        for(int i=5;i>=1;i--){
            for(int j=i;j<5;j++){
                System.out.print(" S");
            }

            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }    
}
