import java.util.*;
import java.io.*;

public class StackCodeTest {
  public static void main(String[] args) throws IOException {
    boolean all_passed = true;
    
    if (!check_push_print()) {
      System.out.println("The push method or string nodes method was incorrect.");
      all_passed = false;
    }
    if (check_extends()) {
      System.out.println("The code extended another stack class.");
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
      DIYStack<Integer> test = new DIYStack<Integer>();
      test.push(1);
      test.push(2);
      test.push(new Node<Integer>(3));
      String s = test.allNodesString();
      s = s.replace(" ", "");
      s = s.replace("\n", " ");
      String[] testarr = s.split(" ");
      return Integer.parseInt(testarr[0]) == 3 && Integer.parseInt(testarr[1]) == 2 && Integer.parseInt(testarr[2]) == 1;
    }catch (Exception e) {
      System.out.println("Error in code");
      return false;
    }    
  }
  
  static boolean check_extends() throws IOException {
    Scanner s = new Scanner(new FileReader("StackMain.java"));
    while(s.hasNextLine()) {
      String line = s.nextLine().replaceAll("\\s", "");
      if (!is_commented_out(line) && line.contains("class DIYStack extends")) return true;
    }
    return false;
  }
  
  static boolean check_pop() throws IOException {
    try {
      DIYStack<Integer> test = new DIYStack<Integer>();
      test.push(1);
      test.push(2);
      int var_a = test.pop();
      test.push(new Node<Integer>(3));
      int var_b = test.pop();
      int var_c = test.pop();
      Integer var_d = test.pop();
      return (var_a == 2) && (var_b == 3) && (var_c == 1) && (var_d == null);
    }catch (Exception e) {
      System.out.println("Error in code");
      return false;
    }
  }
  
  static boolean check_peek() throws IOException {
    try {
      DIYStack<Integer> test = new DIYStack<Integer>();
      Integer var_b = test.peek();
      test.push(1);
      test.push(2);
      int var_a = test.peek();
      return (var_a == 2) && (var_b == null);
    }catch (Exception e) {
      System.out.println("Error in code");
      return false;
    }
  }
  
}