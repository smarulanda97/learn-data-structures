import java.util.Hashtable;

public class Main {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.push(45);
    list.push(12);
    list.push(3);
    list.append(666);
    list.push(35);
    list.append(999);
    list.deleteNode(3);
    list.deleteNode(12);
    list.print();

    System.out.println("--------------------------------------");

    LinkedListSorted list_sorted = new LinkedListSorted();
    list_sorted.insert(999);
    list_sorted.insert(5);
    list_sorted.insert(3);
    list_sorted.insert(8);
    list_sorted.insert(1);
    list_sorted.print();

    System.out.println("--------------------------------------");

    DoublyLinkedList doubly_list = new DoublyLinkedList();
    doubly_list.insert(1);
    doubly_list.insert(5);
    doubly_list.insert(3);
    doubly_list.insert(9988);
    doubly_list.deleteNode(3);
    doubly_list.deleteNode(5);
    doubly_list.deleteNode(1);
    doubly_list.insert(24);
    doubly_list.insert(333);
    doubly_list.insert(5588);
    doubly_list.print();

    System.out.println("--------------------------------------");

    Stack stack = new Stack();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    stack.push(6);
    stack.push(7);
    stack.print();

    System.out.println("--------------------------------------");

    stack.pop();
    stack.pop();
    stack.pop();
    stack.print();

    System.out.println("--------------------------------------");

    Queue queue = new Queue();
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    queue.enqueue(4);
    queue.enqueue(5);
    queue.enqueue(6);
    queue.print();

    System.out.println("--------------------------------------");

    Hashtable<String, String> hashtable = new Hashtable<String,String>();
    hashtable.put("santiago", "colombian");
    hashtable.put("leidy", "colombian");
    System.out.println(hashtable.toString());

    System.out.println("--------------------------------------");
    Employee employee1 = new Employee(1026157113, "Santiago Marulanda Molina");
    Employee employee2 = new Employee(1152216634, "Leidy Yohana Mejia Rincon");
    Employee employee3 = new Employee(71394833, "Francier Marulanda Vasquez");
    Employee employee4 = new Employee(43400960, "Diana Molina Zapata");

    BST bst = new BST();
    System.out.println("BST isEmpty() " + bst.isEmpty() + " isLeaf() " + bst.isLeaf());
    bst.insert(employee1);
    bst.insert(employee2);
    bst.insert(employee3);
    bst.insert(employee4);

    if (bst.exists(1026157113)) {
      System.out.println("Employee found: " + bst.get(1026157113));
    } else {
      System.out.println("Employee not found.");
    }

    System.out.println("--------------------------------------");
    bst.preOrder();
  }
}
