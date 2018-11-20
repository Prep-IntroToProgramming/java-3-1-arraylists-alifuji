
public class Cat {
    //declaring name & weight variables, making them private
    private String name;
    private double weight;
    //getter/setter methods for name and weight variables
    public void setName(String newName) {
        //assigning private variable name to the new name
        name = newName;
    }

    public void setWeight(double newWeight) {
        //assigning private variable weight to the new weight
        weight = newWeight;
    }

    public String getName() {
        //returning the private variable name
        return name;
    }

    public double getWeight() {
        //returning the private variable weight
        return weight;
    }
    //constructor w/out parameters
    public Cat () {
    }
    //constructor that takes a String and assigns the name instance variable to it
    public Cat(String argname) {
        name = argname;
    }
    //method that prints out meow
    public void sayMeow() {
        System.out.println("Meow!");
        return;
    }
}