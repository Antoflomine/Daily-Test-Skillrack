import java.util.Scanner;

class Parent {
    private String name;
    private int age;

    public Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void updateAge(int yearsToAdd) {
        this.age += yearsToAdd;
    }

    public void display() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
class Child extends Parent {
    private String name;
    private int age;

    public Child(String parentName, int parentAge, String childName, int childAge) {
        super(parentName, parentAge); // Call to Parent constructor
        this.name = childName;
        this.age = childAge;
    }

    @Override
    public void updateAge(int yearsToAdd) {
        super.updateAge(yearsToAdd);  // Update parent's age
        this.age += yearsToAdd;       // Update child's age
    }

    @Override
    public void display() {
        super.display();  // Display parent information
        System.out.println(this.name);  // Display child's name
        System.out.println(this.age);   // Display child's age
    }
}

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for Parent and Child
        String parentName = sc.nextLine().trim();
        int parentAge = Integer.parseInt(sc.nextLine().trim());
        String childName = sc.nextLine().trim();
        int childAge = Integer.parseInt(sc.nextLine().trim());
        int X = Integer.parseInt(sc.nextLine().trim());  // Number of years to add

        // Create Child object
        Child child = new Child(parentName, parentAge, childName, childAge);

        // Update both parent's and child's ages
        child.updateAge(X);

        // Display the updated information
        child.display();
    }
}
