public class Dog {
    // Private instance variables (Encapsulation)
    private String breed;
    private int height;
    private int weight;
    private static int age; // Static variable (shared across all objects)

    // Getter and Setter methods
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Dog.age = age;
    }

    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.setBreed("puppy");
        dog.setHeight(50);
        dog.setWeight(55);
        Dog.setAge(10);
        System.out.println(dog.getBreed());
        System.out.println(dog.getWeight());
        System.out.println(dog.getHeight());
        System.out.println(Dog.getAge());
    }
}
