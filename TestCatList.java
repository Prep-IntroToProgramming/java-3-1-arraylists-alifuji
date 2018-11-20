import java.util.*;

public class TestCatList
{
    public static void main(String[] args) {
        //size of ArrayList (4 cats)
        int n = 4;
        //creating a new ArrayList of 4 cats called catList
        ArrayList<Cat> catList = new ArrayList<Cat>(4);
        //enhanced for loop for creating new cat elements and assigning names to each 
        for (int i = 0; i <= n; i++) {
            //creating new cat element, adding it into the catList
            catList.add(new Cat());
            //using a getter method to get element 0 of the catList and assign it a name
            catList.get(0).setName("Charlie");

            catList.add(new Cat());
            catList.get(1).setName("Bailey");

            catList.add(new Cat());
            catList.get(2).setName("Billy");

            catList.add(new Cat());
            catList.get(3).setName("Winnie");

        }
        //enhanced for loop to generate a random weight between 5 & 15 for each cat
        for (int i = 0; i<5; i++) {
            double randomWeight = Math.random()*10+5;
            catList.get(i).setWeight(randomWeight);
        }
        //enhanced for loop to print out the name & weight of each cat; each cat says meow after name/weight is printed
        for (int i = 0; i<catList.size(); i++){
            System.out.println("The cat's name and weight are" +catList.get(i));
            System.out.println("Meowwww!");
        }
    }
}