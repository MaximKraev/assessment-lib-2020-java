public class BalancedParen {
  public static void main(String[] args) {
    //Use this area for testing
    // Balanced: should return True
    System.out.println(paren_balanced("(())"));
    System.out.println(paren_balanced("(())()(())"));
    System.out.println(paren_balanced(""));
    System.out.println(paren_balanced("()"));
                
    //Unbalanced: should return False
    System.out.println(paren_balanced(")"));
    System.out.println(paren_balanced("("));
    System.out.println(paren_balanced("))"));
    System.out.println(paren_balanced("(()))(())"));
    
  }
  
  static boolean paren_balanced(String s) {
    //Your code here
    
  }
  
}


//Starter Code: you are given a Stack class
class Stack<T> {
  
  Node<T> first_node;
  
  public Stack() {
    first_node = null;
  }
  
  public void push(Node<T> new_node) {
    if (first_node != null) {
      first_node.prev = new_node;
      new_node.next = first_node;
    }
    first_node = new_node;
  }
  
  public void push(T value) {
    Node<T> new_node = new Node<T>(value);
    this.push(new_node);
  }
  
  public T pop() {
    Node<T> temp_node = first_node;
    if (temp_node == null) return null;
    first_node = first_node.next;
    if (first_node != null) first_node.prev = null;
    return temp_node.value;
  }
  
  public T peek() {
    if (first_node == null) return null;
    return first_node.value;
  }
  
  public boolean isEmpty() {
    return first_node == null;
  }
  
}

class Node<T> {
  T value;
  Node<T> prev;
  Node<T> next;
  
  public Node(T val) {
    value = val;
  }
  
}