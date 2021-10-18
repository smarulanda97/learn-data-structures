public interface IBST<T extends Comparable>{

  void insert(T employee);

  boolean exists(int document);

  T get(int document);

  boolean isLeaf();

  boolean isEmpty();

  void preOrder();

  void inOrder();

  void postOrder();

  void delete(int document);
}
