package nyc.C4Q.tarynking;

/**
 * Created by tarynking on 10/29/16.
 */
public class NodeToLinkedList {

    public NodeToLinkedList(int[] integers) {


    }

    private Node head;
    private Node tail;
    private int size;

    public List(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    //- return true if no items, otherwise false.
    boolean isEmpty(){
        return this.size()==0;
    }


    ///return the number of items.
    int size(){
        return size;
    }

    /**
     * inserts element at index.
     */
    void add (int index, Object element){ //2, 'a'

        Node newNode = new Node(element);
        if (index==0){ //only case where we update the head
            newNode.next = this.head;
            this.head = newNode;
            size++;
            return;
        }
        //if index is 0 put it at the head
        Node node = this.head;
        int counter = 0;
        while (counter <index-1){
            node = node.next;
            ++counter;
        }
        // node is the NODE which is ONE BEFORE the index we want to insert into
        newNode.next = node.next;
        node.next = newNode;
    }

}
