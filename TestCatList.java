import java.util.*;

public class TestCatList
{
    public static void main(String[] args) {
        int n = 4;
        ArrayList<Cat> catList = new ArrayList<Cat>(4);
        for (int i = 0; i <= n; i++) {
            catList.add(new Cat());
            catList.get(0).setName("Charlie");

            catList.add(new Cat());
            catList.get(1).setName("Bailey");

            catList.add(new Cat());
            catList.get(2).setName("Billy");

            catList.add(new Cat());
            catList.get(3).setName("Winnie");

        }
        for (int i = 0; 5<i<15; i++) {
             Math.random()*10=5;
        }
        for (int i = 0; i<catList.size(); i_++){
            System.out.print("The cat's name and weight are" +catList.get(i);
        }
    }
}