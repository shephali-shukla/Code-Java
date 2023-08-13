public class loops {
    public static void main(String[] args) {
        
        //for loop
        System.out.println("For Loop:");
        for(int i=1;i<=5;i++){
            System.out.println(i);
        }

        //while loop
        System.out.println("While Loop");
        int x = 1;
        while(x < 6){
            System.out.println(x);
            x++;
        }

        //do-while loop
        System.out.println("Do While Loop:");
        int a = 1;
        do {
            System.out.println(a);
            a++;
        } while(a < 6);

        //Similar to conditional statements, we can have ladder loop(loop inside loop) statements.
    }
}
