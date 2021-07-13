public class StackMain {
  public static void main(String[] args) {
    //Instantiate and test your class here!

  }
}

class DIYStack<T> {
  
  Node<T> first_node;
  
  public DIYStack() {
    //Fill in the constructor for your stack here if necessary

  }
  
  public void push(Node<T> new_node) {
    //This method should push a new Node onto the stack

  }
  
  public void push(T value) {
    //This method should push a value onto the stack (by creating a Node containing the value and pushing that behind the scenes)

  }
  
  public T pop() {
    //This method should pop the next element from the stack

  }
  
  public T peek() {
    //This method should return the value of the next element w/o removing it

  }
  
  public String allNodesString() {
   //This method should return a string containing the values of all the nodes,
   //starting at the next element to be popped, with a new line between each node

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