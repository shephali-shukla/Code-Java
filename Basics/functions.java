/**
 * This class demonstrates return type and non-return type methods in Java.
 */
public class functions {

    /**
     * This method takes two integers and returns their sum.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The sum of 'a' and 'b'.
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * This method takes a String message and prints it to the console.
     *
     * @param message The message to be printed.
     */
    public void printMessage(String message) {
        System.out.println(message);
    }

    /**
     * Main method to demonstrate return type and non-return type methods.
     */
    public static void main(String[] args) {
        functions example = new functions();

        // Using the return type method
        int sum = example.add(5, 7);
        System.out.println("Sum: " + sum);

        // Using the non-return type method
        example.printMessage("Hello, Java!");

        // Explanation of the code
        System.out.println("\nExplanation:");
        System.out.println("1. The 'add' method calculates the sum of two integers and returns the result.");
        System.out.println("2. The 'printMessage' method prints a given message to the console.");
        System.out.println("3. In the 'main' method, we demonstrate both methods.");
    }
}
