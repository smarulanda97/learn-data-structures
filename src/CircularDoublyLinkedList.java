public class CircularDoublyLinkedList {
  int size;
  Node head;


  public CircularDoublyLinkedList() {
    this.head = null;
  }

  public void insert(int num) {
    Node new_node = new Node(num);

    if (this.head == null) {
      this.head = new_node;
      this.head.setNext(this.head);
      this.head.setPrev(this.head);
    }
  }
}
