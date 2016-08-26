/**
 * Created by Anders on 8/25/2016.
 */

public class LinkedListTest {
    public static LinkedList linkedList;

    public static void main(String[] args) {

        linkedList = new LinkedList();

        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        linkedList.add("4");
        linkedList.add("5");

        System.out.println(".get(3): \t\t" + linkedList.get(3));
        System.out.println(".remove(0): \t\t" + linkedList.remove(0));
        System.out.println(".size(): \t\t" + linkedList.size());
        System.out.println(linkedList.returnReverse(5));
    }

}
