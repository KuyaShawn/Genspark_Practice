// Subclass
public class Tiger extends Animal {
    private String breed;

    public Tiger(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public void roar() {
        System.out.println(name + " is roaring!");
    }
    
    public void wagTail() {
        System.out.println(name + " wags tail!");
    }

    // Override example
    // we have overridden the makeSound() method in the Tiger class to print out\
    // "roars!" instead of "makes a sound"
    // This allows us to define a new implementation of a method in a subclass that
    // has the same name, return type, and parameters as a method in its superclass.
    @Override
    public void makeSound() {
        System.out.println(name + " roars!");
    }

    // Overloading example
    // This method is not present in the Animal class and is only specific to the Dog class.
    // This allows us to define methods with the same name but with different parameters.
    public void makeSound(String sound) {
        System.out.println(name + " makes a " + sound + " sound.");
    }
}
