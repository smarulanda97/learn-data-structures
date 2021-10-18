public class LinkedListSorted extends LinkedList {
  public LinkedListSorted() {
    super();
  }

  public void insert(int num) {
    Node new_node = new Node(num);
    if (head == null) {
      head = new_node;
    } else if (head.getNum() > num) {
      new_node.setNext(head);
      head = new_node;
    } else {
      Node current = head;
      Node previous = null;

      while (current != null && current.getNum() < num) {
        previous = current;
        current = current.getNext();
      }

      previous.setNext(new_node);
      new_node.setNext(current);
    }
  }
}
