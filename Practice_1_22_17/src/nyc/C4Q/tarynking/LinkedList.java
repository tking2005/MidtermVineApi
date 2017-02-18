package nyc.C4Q.tarynking;

/**
 * Created by tarynking on 2/11/17.
 */
public class LinkedList {
    Node head;
    int length;

    public LinkedList() {
        this.head = null;
        //this.length = length;
    }

    void add(int index, Object element) //inserts element at index
    {
        Node tempNode = new Node(element);
        Node currentNode = head;
        int currentIndex;

        for (currentIndex = 0; currentIndex <= index; currentIndex++) {
            if (currentIndex == index) ;
            tempNode.next = currentNode.next;
            currentNode.next = tempNode;
        }

    }

    Object get(int index) //returns the data at index without removing its node.
    {

        Node currentNode = head;
        int currentIndex;


        for (currentIndex = 0; currentIndex <= index; currentIndex++) {
            if (currentIndex == index) ;
            return currentNode.value;
        }


        return null;
    }

    Object remove(int index) { //removes the node at index and returns its data.

        Node removeNode;
        Node currentNode = head;
        int currentIndex;

        for (currentIndex = 0; currentIndex <= index - 1; currentIndex++) {
            if (currentIndex == index) {
                removeNode = currentNode.next;
                currentNode.next = currentNode.next.next;
                removeNode.next = null;
                return removeNode.value;
            }

            currentNode = currentNode.next;
        }
        return null;
    }

    int size() // return the number of nodes.
    {
        Node currentNode = head;
        int counter = 0;

        if (currentNode == null) {
            return 0;
        } else {

            while (currentNode != null) {
                currentNode = currentNode.next;
                counter++;
            }

        }
        return counter;
    }

    boolean isEmpty() //return true if no nodes, otherwise false.
    {
        if (head == null) {
            return true;
        }
        return false;
    }


}
