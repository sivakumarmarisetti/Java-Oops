import java.util.*;

public class Dog {
    // Instance variables (each object of Dog will have its own copy)
    String breed = "German Shepherd";
    int height = 30;
    int weight = 35;
    
    // Class variable (static variable, shared among all objects of Dog class)
    static int age = 10;
    
    public static void main(String[] args) {
        // Creating an object of the Dog class. Dog() is the default constructor.
        Dog dog = new Dog();
        
        // Accessing a static variable using the class name (recommended way)
        System.out.println(Dog.age);
        
        // Accessing instance variables using the object reference
        System.out.println(dog.breed);
        System.out.println(dog.height);
        System.out.println(dog.weight);
        
        System.out.println("----------------------");
        
        // Changing the values of instance variables (hardcoded values)
        dog.breed = "Rottweiler";
        dog.height = 40;
        dog.weight = 45;
        
        // Printing updated values
        System.out.println(dog.breed);
        System.out.println(dog.height);
        System.out.println(dog.weight);
        
        // Taking input from the user to modify the breed
        System.out.println("Enter dog breed: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        
        // Updating and printing the breed variable with user input
        dog.breed = name;
        System.out.println("Updated breed: " + dog.breed);
        
        sc.close(); // Closing the scanner to prevent resource leaks
    }
}
