public class SinglyLinkedList {
  private Node head;
  private Node tail;
  private int size;

  SinglyLinkedList() {
    head = null;
    tail = null;
    size = 0;
  }

  public Node getHead() { return this.head; }
  
  public SinglyLinkedList setHead(Node node) {
    this.head = node;
    return this;
  }

  public Node getTail() { return this.tail; }

  public SinglyLinkedList setTail(Node node) {
    this.tail = node;
    return this;
  }

  public int getSize() { return this.size; }

  public void addFirst(Node node) {
    if(this.head == null)  {
      this.head = node;
      this.tail = this.head;
    } else {
      node.setNext(this.head);
      this.head = node;
    }
    this.size++;
  }

  public void addLast(Node node) {
    if(this.tail == null) {
      this.tail = node;
      this.head = this.tail;
    } else {
      this.tail.setNext(node);
      this.tail = node;
    }
    this.size++;
  }
}