public class Dog {
    private String breed;
    private int height;
    private int weight;

    // Default constructor
    public Dog() {
        this.breed = "Unknown";
        this.height = 0;
        this.weight = 0;
    }

    // Parameterized constructor
    public Dog(String breed, int height, int weight) {
        this.breed = breed;
        this.height = height;
        this.weight = weight;
    }

    public void displayDetails() {
        System.out.println("Breed: " + breed);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
    }

    public static void main(String[] args) {
        Dog defaultDog = new Dog(); // Calls default constructor
        Dog customDog = new Dog("Labrador", 50, 30); // Calls parameterized constructor

        System.out.println("Default Dog Details:");
        defaultDog.displayDetails();

        System.out.println("\nCustom Dog Details:");
        customDog.displayDetails();
    }
}
