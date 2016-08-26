/**
 * Created by Anders on 8/25/2016.
 */

public class LinkedList {

    private static int counter;
    private Node head;

    // Default constructor
    public LinkedList() {
    }

    public void add(Object data) {
        if (head == null) {
            head = new Node(data);
        }
        Node temp = new Node(data);
        Node currentPlacement = head;

        if (currentPlacement != null) {
            // we walk up the array of items to the end
            while (currentPlacement.getNext() != null) {
                currentPlacement = currentPlacement.getNext();
            }
            //  add the new data and node to this last placement
            currentPlacement.setNext(temp);
        }
        counter++;
    }

    public Object get(int index) {
        if (index <= 0) {
            return null;
        }
        Node currentPos = null;
        if (head != null) {
            currentPos = head.getNext();
            for (int i = 0; i < index; i++) {
                if (currentPos.getNext() == null) {
                    return null;
                }
                currentPos = currentPos.getNext();
            }
            return currentPos.getData();
        }
        return currentPos;
    }

    public boolean remove(int index) {
        Node currentPos = head;
        if (index < 0 || index > size()) {
            return false;
        }
        if (index == 0) {
            head = currentPos.getNext();
            counter--;
            return true;
        }
        if (head != null) {
            for (int i = 0; i < index; i++) {
                if (currentPos.getNext() == null) {
                    return false;
                } else {
                    currentPos = currentPos.getNext();
                }
            }
            currentPos.setNext(currentPos.getNext().getNext());

            counter--;
            return true;
        }
        return false;
    }

    public Node returnReverse(int arraySize) {
        Node temp = head;
        Node posMinusOne = temp;
        Node currentPosition = temp;
        Node firstItem = head;
        Node posPlusOne = head.getNext();

       for(int i = 0; i <arraySize -1; i ++){
           System.out.println("Node " + i + "   =   "  + currentPosition);
            if (i == 0){
                // do nothing
            }
            else {
                posMinusOne = currentPosition; //                         get the previous value
                posPlusOne = posPlusOne.getNext(); //                     up the positive index by one
                posMinusOne.setNext(posPlusOne); //                       delete the current value from old position
                firstItem = currentPosition; //                           add the current position to the front
                System.out.println("The new first item is " + firstItem);
                currentPosition = currentPosition.getNext(); //           up the currentPosition by one
                posMinusOne = posMinusOne.getNext(); //                   up the negative one index by one
                System.out.println("current " + currentPosition);
                // a b c d e
                // b a c d e
                // c b a d e
                // d c b a e
                // e d c b a
            }

        }
        return (firstItem);
        // this works :)
    }

    public int size() {
        return getCounter();
    }

    private static int getCounter() {
        return counter;
    }
}
