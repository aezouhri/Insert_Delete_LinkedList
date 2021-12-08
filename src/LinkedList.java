/**
 * This class contains the adding and removing method for a LinkedList.
 * @author aezouhri
 */
public class LinkedList {

    /**
     * First node of a LinkedList
     */
    private Node head;

    /**
     * Variable that stores the size of a LinkedList
     */
    private static int size;


    /**
     * Constructor for LinkedList, creates an empty LinkedList.
     */
    public LinkedList() {

        size = 0;
        head = null;

    }

    /**
     * Getter for the size of a LinkedList.
     * @return The size of a LinkedList.
     */
    public int getSize() {
        return size;
    }

    /**
     * Method to check whether or not a LinkedList is empty.
     * @return true if the LinkedList is empty.
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Method to add a node at a given position with it's given value in a LinkedList.
     * @param pos position where we want to add the node
     * @param val element of the node we're adding
     */
    public void add(int pos, Object val) {

        if (pos == 0) {

            if (isEmpty()) {
                head = new Node(val, null);
            } else {

                Node temp = head;
                head = new Node(val, null);
                head.setNext(temp);

            }

        } else if (pos == getSize()) {

            Node temp = head;

            for (int i = 0; i < pos - 1; i++) {
                temp = temp.getNext();
            }

            Node to_be_added = new Node(val, null);
            temp.setNext(to_be_added);

        } else {
            try {

                Node temp = head;

                for (int k = 0; k < pos-1; k++) {
                    temp = temp.getNext();

                }

                Node next_node = temp.getNext();
                Node to_add = new Node(val, null);
                temp.setNext(to_add);
                to_add.setNext(next_node);

            } catch (Exception E) {
                System.out.println("Error! You cannot add an element at this position.");
            }


        }
        size++;
    }

    /**
     * Method to remove a node from a LinkedList at a given position.
     * @param pos position where to remove the node.
     */
    public void remove(int pos) {


        if (pos == 0) {
            head = head.getNext();
        } else if (pos == getSize()) {

            Node running = head;

            for (int k = 0; k < getSize() - 2; k++) {
                running = running.getNext();

            }

            Node new_last = running;
            new_last.setNext(null);


        } else {
            try {
                Node run = head;

                for (int k = 0; k < pos - 1; k++) {
                    run = run.getNext();

                }

                Node previous = run;
                Node next = previous.getNext().getNext();
                run.setNext(null);
                previous.setNext(next);


            } catch (Exception E) {
                System.out.println("Error! You cannot remove an element at this position.");
            }
        }

        size--;
    }

    /**
     * Method to convert a LinkedList to a string so it can be displayed to the user.
     * @return String version of the LinkedList.
     */
    public String toString() {
        String s;
        Node n;
        s = "[";
        n = head;
        if (n == null) {
            return s + "empty list]";
        }
        while (n != null) {
            s = s + n.getElement();
            if (n.getNext() != null) s = s + ", ";
            n = n.getNext();
        }
        return s + "]";
    }

    //////Are we supposed to make this interactive ?!?1?1


    /**
     * Runs different method to see if everything is working correctly.
     * @param args Java command.
     */
    public static void main(String[] args) {


        LinkedList test = new LinkedList();
        test.add(0, 1);
        test.add(1, 3);
        test.add(2, 2);
        test.add(3, 5);
        test.add(4,28);
        test.add(5,18);
        test.add(6,4);
        test.add(7,37);

        System.out.println("Starting list: \n" + test.toString()+ "\n");

        System.out.println("Removing element at position 1: ");
        test.remove(1);
        System.out.println(test.toString()+"\n");

        System.out.println("Removing element at position 0: ");
        test.remove(0);
        System.out.println(test.toString()+"\n");

        System.out.println("Adding element at position 0: ");
        test.add(0, 69);
        System.out.println(test.toString()+"\n");

        System.out.println("Removing element at position 5: ");
        test.remove(5);
        System.out.println(test.toString()+"\n");


        System.out.println("Adding element at position 4: ");
        test.add(4,56);
        System.out.println(test.toString()+"\n");

        System.out.println("Adding element at position 6: ");
        test.add(6,14);
        System.out.println(test.toString()+"\n");

        System.out.println("Removing element at position 5: ");
        test.remove(5);
        System.out.println(test.toString()+"\n");


        System.out.println("Removing element at position 3: ");
        test.remove(3);
        System.out.println(test.toString()+"\n");

        System.out.println("Removing element at last position : ");
        test.remove(test.getSize());
        System.out.println(test.toString()+"\n");



    }

}


