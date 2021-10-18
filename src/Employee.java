public class Employee implements Comparable<Employee>{
  private int document;
  private String fullName;

  public Employee(int document, String full_name) {
    this.document = document;
    this.fullName = full_name;
  }

  public int getDocument() {
    return this.document;
  }

  public void setDocument(int document) {
    this.document = document;
  }

  public String getFullName() {
    return this.fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  @Override
  public int compareTo(Employee employee) {
    if (this.document == employee.getDocument()) {
      return 0;
    } else if (this.document < employee.getDocument()) {
      return -1;
    }
    return 1;
  }

  @Override
  public String toString() {
    return "{ document: \"" + this.getDocument() + "\", fullName: \"" + this.getFullName() + "\" }";
  }
}
