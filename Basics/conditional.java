public class conditional {
    public static void main(String[] args) {
        
        int i=9,j=8;
        //if:
        if(i > j){
            System.out.println("i is greater!");
        }

        //if-else:
        if(j > i){
            System.out.println("j is greater!");
        }else{
            System.out.println("i is greater!");
        }

        //if-else if-else:
        int k=10;
        if(i > 5){
            System.out.println("i is greater!");
        }else if(i > j && i < k){
            System.out.println("i is greter than j but less than k!");
        }else{
            System.out.println("k is greatest!");
        }
        
        //ladder if | nested if:
        if(i > j){
            if(i < k){
                System.out.println("k is greater than i & i is greater than j!");
            }
        }
        else{
            System.out.println("If the above if condition fails, this statement will get printed.");
        }

        //Ternary Operator:
        boolean ans = i > k ? true:false;
        System.out.println(ans);
    }
}
