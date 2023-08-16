class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }
}

public class ByValueReference {
    public static void main(String[] args) {
        // Example 1: Pass by Value
        int number = 5;
        System.out.println("Before calling modifyValue: " + number);
        modifyValue(number);
        System.out.println("After calling modifyValue: " + number);

        // Example 2: Pass by Reference
        Person person = new Person("Alice");
        System.out.println("Before calling modifyReference: " + person.name);
        modifyReference(person);
        System.out.println("After calling modifyReference: " + person.name);
    }

    // Method to modify a value (pass by value)
    public static void modifyValue(int value) {
        value = 10;
    }

    // Method to modify a reference (pass by reference)
    public static void modifyReference(Person p) {
        p.name = "Bob";
    }
}
