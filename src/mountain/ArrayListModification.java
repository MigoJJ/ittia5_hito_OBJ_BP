package mountain;

import java.util.ArrayList;

public class ArrayListModification {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();

    // Adding elements to the ArrayList
    numbers.add(10);
    numbers.add(20);
    numbers.add(30);
    System.out.println("ArrayList before modification: " + numbers);

    // Modifying an element in the ArrayList
    numbers.set(1, 25);
    System.out.println("ArrayList after modification: " + numbers);

    // Removing an element from the ArrayList
    numbers.remove(2);
    System.out.println("ArrayList after removing an element: " + numbers);
  }
}
