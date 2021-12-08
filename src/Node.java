/**
 * This class contains all of the Node accessor and setter methods and a Constructor for Node.
 * @author aezouhri
 */
public class Node {
    // Instance variables:
    /**
     * Element contained in the node.
     */
    private Object element;

    /**
     * Node pointing to the next
     */
    private Node next;

    /** Creates a node with the given element and next node.
     *
     * @param val value of the element of a node.
     * @param next next node of a node.
     */
    public Node(Object val,Node next) {
        element = val;
        next=null;
    }

    /**
     * Getter for the element of a node.
     * @return The element of a node.
     */
    // return the element in the current node
    public Object getElement() {
        return element;
    }

    /**
     * Getter for the next node.
     * @return The next node of a node, null if there isn't one.
     */
    // returns the pointer to next node
    public Node getNext() {
        return next;
    }

    /**
     * Setter for the element of a node.
     *
     * @param newElem element to set to a node.
     */
    // setter element = to the provided value
    public void setElement(Object newElem) {
        element = newElem;
    }

    /**
     * Setter for the the next node.
     *
     * @param newNext next node to be set.
     */
    // set the next pointer to the provided node
    public void setNext(Node newNext) {
        next = newNext;
    }
}

