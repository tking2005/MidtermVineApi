package nyc.C4Q.tarynking;

/**
 * Created by tarynking on 2/11/17.
 */
public class Queue {

    Node head;
    int length;

    public Queue() {
        this.head = null;
        //this.length = length;
    }

    void enqueue(Object element) { //inserts element at the rear of the queue.
        Node currentNode = head;
        Node newNode = new Node(element);
        while (currentNode.next!=null){

        currentNode = currentNode.next;
        }
        currentNode.next =newNode;

    }

    Object dequeue() { //remove node from front of queue and return its data.
        if (head==null)
            return null;
        else
            head=head.next;
        return head;
    }

    int size(){ //return the number of nodes.

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

    boolean isEmpty() { //return true if no nodes, otherwise false.
        if (head == null) {
            return true;
        }
        return false;
    }

    Object front(){ //return data at the front of the queue without removing its node.

        return head.value;

    }
}
