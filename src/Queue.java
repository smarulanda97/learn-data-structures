public class Queue {
  protected Node first;
  protected Node last;

  public Queue() {
    this.first = this.last = null;
  }

  public boolean isEmpty() {
    return this.first == null;
  }

  public void enqueue(int num) {
    Node new_node = new Node(num);

    if (this.isEmpty()) {
      this.first = new_node;
    } else {
      this.last.setNext(new_node);
    }

    this.last = new_node;
  }

  public void print() {
    Node aux = this.first;

    while (aux != null) {
      System.out.println(aux.getNum());
      aux = aux.getNext();
    }
  }
}
