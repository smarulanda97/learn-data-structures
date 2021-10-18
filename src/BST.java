public class BST implements IBST<Employee> {
  private Employee value;

  private BST left, right;

  @Override
  public boolean isLeaf() {
    return this.value != null && this.left == null && this.right == null;
  }

  @Override
  public boolean isEmpty() {
    return this.value == null;
  }

  @Override
  public void insert(Employee employee) {
    if (this.value == null) {
      this.value = employee;
      return;
    }

    if (employee.compareTo(this.value) < 0) {
      if (this.left == null) this.left = new BST();

      this.left.insert(employee);
    } else if (employee.compareTo(this.value) > 0) {
      if (this.right == null ) this.right = new BST();

      this.right.insert(employee);
    } else {
     throw new RuntimeException("Inserting duplicate element.");
    }
  }

  @Override
  public boolean exists(int document) {
    if (this.value == null) {
      return false;
    }

    if (document == this.value.getDocument()) {
      return true;
    } else if (this.left != null && document < this.value.getDocument()) {
      return left.exists(document);
    } else if (this.right != null && document > this.value.getDocument()){
      return right.exists(document);
    } else {
      return false;
    }
  }

  @Override
  public Employee get(int document) {
    if (this.value == null) {
      return null;
    }

    if (document == this.value.getDocument()) {
      return this.value;
    } else if (this.left != null && document < this.value.getDocument()) {
      return left.get(document);
    } else if (this.right != null && document > this.value.getDocument()){
      return right.get(document);
    } else {
      return null;
    }
  }

  private void preOrderImp(String prefix) {
    if (this.value != null) {
      System.out.println(prefix + this.value);
      if (this.left != null)
        this.left.preOrderImp(prefix + "-- ");
      if (this.right != null)
        this.right.preOrderImp(prefix + "-- ");
    }
  }

  /**
   * preOrder
   * 1. Root node
   * 2. Process left three
   * 3. Process right three
   */
  @Override
  public void preOrder() {
    this.preOrderImp("");
  }

  /**
   * inOrder
   * 1. Process left three
   * 2. Process root
   * 3. Process right three
   */
  @Override
  public void inOrder() {
    if (this.value != null) {
      if (this.left != null)
        this.left.preOrder();

      System.out.println(this.value);

      if (this.right != null)
        this.right.preOrder();
    }
  }

  /**
   * postOrder
   * 1. Process left three
   * 2. Process right three
   * 3. Process root
   */
  @Override
  public void postOrder() {
    if (this.value != null) {
      if (this.left != null)
        this.left.preOrder();

      if (this.right != null)
        this.right.preOrder();

      System.out.println(this.value);
    }
  }

  @Override
  public void delete(int document) {

  }
}
