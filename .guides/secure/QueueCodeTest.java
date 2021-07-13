import java.util.*;
import java.io.*;

public class QueueCodeTest {
  public static void main(String[] args) throws IOException {
    boolean all_passed = true;
    
    if (!check_push_print()) {
      System.out.println("The push method or string nodes method was incorrect.");
      all_passed = false;
    }
    if (check_extends()) {
      System.out.println("The code extended another class.");
      all_passed = false;
    }
    if (!check_pop()) {
      System.out.println("The pop method was incorrect.");
      all_passed = false;
    }
    if (!check_peek()) {
      System.out.println("The peek method was incorrect.");
      all_passed = false;
    }
    if (!all_passed) {
      System.out.println("Code did not pass");
      System.exit(1);
    }else{
      System.out.println("Yay, you passed!");
      System.exit(0);
    }
  }
 
  
  static boolean is_commented_out(String line) throws IOException {
    return line.startsWith("//");
  }
  
  static boolean check_push_print() {
     try {
      DIYQueue<Integer> test = new DIYQueue<Integer>();
      test.queue(1);
      test.queue(2);
      test.queue(new Node<Integer>(3));
      String s = test.allNodesString();
      s = s.replace(" ", "");
      s = s.replace("\n", " ");
      String[] testarr = s.split(" ");
      return Integer.parseInt(testarr[0]) == 3 && Integer.parseInt(testarr[1]) == 2 && Integer.parseInt(testarr[2]) == 1;
    }catch (Exception e) {
      System.out.println("Error occurred when queueing");
      return false;
    }    
  }
  
  static boolean check_extends() throws IOException {
    Scanner s = new Scanner(new FileReader("CreateQueue.java"));
    while(s.hasNextLine()) {
      String line = s.nextLine().replaceAll("\\s", "");
      if (!is_commented_out(line) && line.contains("class DIYQueue extends")) return true;
    }
    return false;
  }
  
  static boolean check_pop() throws IOException {
    try {
      DIYQueue<Integer> test = new DIYQueue<Integer>();
      test.queue(1);
      test.queue(2);
      int var_a = test.dequeue();
      test.queue(new Node<Integer>(3));
      int var_b = test.dequeue();
      int var_c = test.dequeue();
      Integer var_d = test.dequeue();
      return (var_a == 1) && (var_b == 2) && (var_c == 3) && (var_d == null);
    }catch (Exception e) {
      System.out.println("Error occurred while dequeueing");
      return false;
    }
  }
  
  static boolean check_peek() throws IOException {
    try {
      DIYQueue<Integer> test = new DIYQueue<Integer>();
      Integer var_b = test.peek();
      test.queue(1);
      test.queue(2);
      int var_a = test.peek();
      return (var_a == 1) && (var_b == null);
    }catch (Exception e) {
      System.out.println("Error occurred while peeking");
      return false;
    }
  }
  
}