package nyc.C4Q.tarynking;


/**
 * Created by tarynking on 1/15/17.
 */

public class LinkedList {

    private Node head;
    private DLNode dlHead;
    private DLNode dlTail;
    private DLNode sentinel;


    public LinkedList(Node head) {
        this.dlHead = head;

    }

    public LinkedList(Node tail) {

        this.dlTail = tail;
    }

    public LinkedList(){
        this.sentinel = new  DLNode(null);
        sentinel.nextDL = sentinel;
        sentinel.prevDL = sentinel;
    }

    private DLNode head(){
        return sentinel.nextDL;
    }
    private DLNode tail(){
        return sentinel.prevDL;
    }

    public void AddToFront(String newVal){
        DLNode newNode = new DLNode(newVal);

        //set up the new node correctly
        newNode.prevDL = sentinel;
        newNode.nextDL = head();

        //update the old head
        head().prevDL= newNode;

        //update the sentinel
        sentinel.nextDL=newNode;
    }

    public void AddToBack(String newVal){
        DLNode newNode = new DLNode(newVal);

        //set up the new node correctly
        newNode.nextDL = sentinel;
        newNode.prevDL = tail();

        //update the old head
        tail().nextDL= newNode;

        //update the sentinel
        sentinel.prevDL=newNode;
    }


    public int getLength(){
        Node currentNode = head;
        int length = 0;

        while (currentNode != null){
            length++;
            currentNode = currentNode.next;
        }
        return length;
    }

  ]


    public static int findValue(Node nodeSent, int valueToCount) {
        Node currentNode = nodeSent;
        int count = 0;
        while (currentNode.next!=null) {
            if (currentNode.value == valueToCount) {
                count++;
            }
            currentNode = currentNode.next;
        }
        return count;
    }

    public boolean searchValueInList(int valueToFind) {
        Node currentNode = head;
        int count = 0;
        while (currentNode.next!=null) {
            if (currentNode.value == valueToFind) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public void remove (DLNode nodeToRemove){

        nodeToRemove.prevDL.nextDL = nodeToRemove.nextDL;
        nodeToRemove.nextDL.prevDL = nodeToRemove.prevDL;

    }



}
