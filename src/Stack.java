public class Stack {
  protected Node top;
  protected int size;

  public Stack() {
    this.top = null;
    this.size = 0;
  }

  public void push(int num) {
    Node new_node = new Node(num);
    new_node.setNext(this.top);
    this.top = new_node;
    this.size++;
  }

  public int pop() {
    int num = this.top.getNum();
    this.top = this.top.getNext();
    return num;
  }

  public int peek() {
    return this.top.getNum();
  }

  public void print() {
    Node aux = this.top;

    while (aux != null) {
      System.out.println(aux.getNum());
      aux = aux.getNext();
    }
  }

  public boolean isEmpty() {
    return this.top == null;
  }
}
