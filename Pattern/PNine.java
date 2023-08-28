package Pattern;

class PNine {
    public static void main(String[] args) {
        
        for(int i=1;i<=5;i++){

			for(int j=5;j>i;j--){
				System.out.print(" ");
			}

			for(int j=i;j>=1;j--){
				System.out.print(j);
			}

			for(int j=2;j<=i;j++){  //j<=i is false. So, it skips this loop & doesn't prints on line one.(i=1 for outer loop)
				System.out.print(j);
			}

			System.out.println();
		}
    }    
}
