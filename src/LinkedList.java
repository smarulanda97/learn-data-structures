public class LinkedList {
  /**
   * The head of linked list
   */
  protected Node head;

  public LinkedList() {
    this.head = null;
  }

  public void push(int num) {
    Node new_node = new Node(num);
    new_node.setNext(head);
    head = new_node;
  }

  public void append(int num) {
    Node new_node = new Node(num);
    new_node.setNext(null);

    if (this.head == null) {
      this.head = new_node;
    } else {
      Node last = head;
      while (last.getNext() != null) {
        last = last.getNext();
      }
      last.setNext(new_node);
    }
  }

  public void deleteNode(int searchNum) {
    Node current = head;
    Node previous = null;

    if (current != null && current.getNum() == searchNum) {
      head = current.getNext();
      return;
    }

    while (current != null  && current.getNum() != searchNum) {
      previous = current;
      current = current.getNext();
    }

    if (current == null) {
      return;
    }

    previous.setNext(current.getNext());
  }

  public void print() {
    Node node = head;
    while (node != null) {
      System.out.println(node.getNum());
      node = node.getNext();
    }
  }
}
