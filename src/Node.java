public class Node {
  public int num;
  protected Node next;
  protected Node prev;

  public Node(int num) {
    this.num = num;
    next = null;
    prev = null;
  }

  public int getNum() {
    return this.num;
  }

  public void setNum(int num) {
    this.num = num;
  }

  public Node getNext() {
    return this.next;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  public Node getPrev() {
    return this.prev;
  }

  public void setPrev(Node prev) {
    this.prev = prev;
  }
}
