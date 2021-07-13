public class CreateQueue {
  public static void main(String[] args) {
    //Instantiate and test your class here!

  }
}

class DIYQueue<T> {
  
  Node<T> first_node;
  Node<T> last_node;
  
  public DIYQueue() {
    //Fill in the constructor for your stack here if necessary
    
  }
  
  public void queue(Node<T> new_node) {
    //This method should queue a new Node
    
  }
  
  public void queue(T value) {
    //This method should queue a value (by creating a Node containing the value and pushing that behind the scenes)
    
  }
  
  public T dequeue() {
    //This method should remove the next element from the queue
    
  }
  
  public T peek() {
    //This method should return the value of the next element w/o removing it
    
  }
  
  public String allNodesString() {
    //Create a string representation of the queue.
    //There should be a newline between each element,
    //and the one on the bottom should be the next one
    //to be removed.
    //So if the user queued 1 and then 2, this method should
    //RETURN AND PRINT OUT the following:
    //2
    //1
    
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