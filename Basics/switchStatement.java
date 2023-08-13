import java.util.Scanner;

public class switchStatement {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'a':
                System.out.println("You chose a");
                break;
            case 'b':
                System.out.println("You chose b");
                break;
            default:
                System.out.println("You chose " + ch);
        }
        sc.close();
    }
}
