import java.util.ArrayList;
// import java.util.List;

public class ArrayListOperation {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();

        // Adding elements
        l1.add(10);
        l1.add(20);
        l1.add(30);

        System.out.print("Values of ArrayList l1 after adding elements: ");
        for (Integer val : l1) {
            System.out.print(val + " ");
        }

        System.out.println();

        ArrayList<Integer> l2 = new ArrayList<>();

        // Adding all elements from l1
        l2.addAll(l1);

        System.out.print("Values of ArrayList l2 after adding all items from l1: ");
        for (Integer val : l2) {
            System.out.print(val + " ");
        }

        System.out.println();

        // Update elements
        l1.set(0, 100);
        System.out.println("Updated l1: " + l1);

        // Removing elements
        l1.remove(0);
        System.out.println("After removing element from l1: " + l1);

        // Removing all elements
        l1.clear();
        System.out.print("After removing all elements from list l1: " + l1);
    }
}

// Remember - Collection accept the value while removing element or list accept index of the element