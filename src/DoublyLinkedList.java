public class DoublyLinkedList {
  int size;
  Node head;

  public DoublyLinkedList() {
    this.size = 0;
  }

  public void insert(int num) {
    Node new_node = new Node(num);

    if (this.size != 0) {
      head.setPrev(new_node);
      new_node.setNext(head);
    }
    this.head = new_node;

    this.size++;
  }

  public void deleteNode(int searchNum) {
    if (head == null) {
      return;
    }

    if (head.getNum() == searchNum) {
      this.head = null;
      return;
    }

    Node current = head;
    Node previous = null;
    while (current != null && current.getNum() != searchNum) {
      previous = current;
      current = current.getNext();
    }

    if (current.getNext() != null)
      current.getNext().setPrev(previous);
    if (previous != null)
      previous.setNext(current.getNext());
  }

  public void print() {
    Node current = head;
    while (current != null) {
      if (current.getPrev() != null)
        System.out.println("Prev: " + current.getPrev().getNum());

      System.out.println("Current: " + current.getNum());

      if (current.getNext() != null)
        System.out.println("Next: " + current.getNext().getNum());

      System.out.println("......");
      current = current.getNext();
    }
  }
}
