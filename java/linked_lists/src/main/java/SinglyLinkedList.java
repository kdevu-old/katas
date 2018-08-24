public class SinglyLinkedList implements LinkedList<SinglyLinkedList> {
  public class Node {
    private int num;
    private Node next;

    Node(int num){
      this.num = num;
      this.next = null;
    }

    public int getNum() { return this.num; }
    public Node getNext() { return this.next; }

    public void setNum(int newNum) { this.num = newNum; }
    public void setNext(Node newNext) { this.next = newNext; }
  }
  
  public Node head;
  public Node tail;
  private int size;

  // Constructor for an empty list
  SinglyLinkedList() { }

  // Constructor for a list with one element
  SinglyLinkedList(int firstNum) {
   this.head = new Node(firstNum);
   this.tail = this.head;
   this.size++;
  }

  private SinglyLinkedList makeCopy() {
    if(this.head == null)
      return new SinglyLinkedList();

    SinglyLinkedList newList = new SinglyLinkedList();

    Node pointer = this.head;
    Node node = new Node(pointer.getNum());

    newList.head = node;
    newList.tail = newList.head;

    while(pointer.next != null) {
      pointer = pointer.next;
      node = new Node(pointer.getNum());
      newList.tail.setNext(node);
      newList.tail = node;
    }

    return newList;
  }

  public boolean contains(int num) {
    return true;
  }

  public SinglyLinkedList remove(int num) {
    return null;
  }

  public SinglyLinkedList insertInFront(int num) {
    SinglyLinkedList newList = makeCopy();
    Node newNode = new Node(num);
    newNode.next = newList.head;
    newList.head = newNode;
    newList.size++;
    return newList;
  }

  public SinglyLinkedList insertInEnd(int num) {
    SinglyLinkedList newList = makeCopy();

    Node newNode = new Node(num);

    if(newList.head == null) {
      newList.head = newNode;
      newList.tail = newList.head;
    } else {
      newList.tail.setNext(newNode);
      newList.tail = newNode;  
    }

    newList.size++;

    return newList;
  }

  public int getSize() {
    return this.size;
  }

  public String printAll() {
    if (this.head == null) { throw new IllegalStateException("The list is empty."); }

    String output = "";

    Node pointer = this.head;

    output = output + Integer.toString(pointer.getNum());

    while(pointer .next != null) {
      pointer = pointer.next;
      output = output + " " + Integer.toString(pointer.getNum());
    }

    return output;
  }
}