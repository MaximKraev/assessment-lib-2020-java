import java.util.*;
import java.io.*;

public class CreateNodeCT {
  public static void main(String[] args) throws IOException {
    boolean all_passed = true;
    if (!check_output()) {
      System.out.println("Output was incorrect.");
      all_passed = false;
    }
    if (!check_return()) {
      System.out.println("Method did not return a value.");
      all_passed = false;
    }
    if (!check_class()) {
      System.out.println("Code did not use a class.");
      all_passed = false;
    }
    if (!check_name()) {
      System.out.println("Code did not assign a value to the Node.name instance variable.");
      all_passed = false;
    }
    if (!check_next()) {
      System.out.println("Code did not assign a value to the Node.next instance variable.");
      all_passed = false;
    }
    if (!check_variable()) {
      System.out.println("Program does not create a variable of type Node.");
      all_passed = false;
    }
    if (!check_node()) {
      System.out.println("Program does not instantiate the Node class correctly.");
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
  
  static boolean check_output() throws IOException {
    String output = CreateNode.nodeName();
    return (output.equals("Maria"));
  }
  
  static boolean check_return() throws IOException {
    Scanner s = new Scanner(new FileReader("CreateNode.java"));
    while(s.hasNextLine()) {
      String line = s.nextLine().replaceAll("\\s", "");
      if (!is_commented_out(line) && line.replace(" ", "").contains("return")) return true;//this relied a lot on variable names in the original version...
    }
    return false;
  }
  
  static boolean is_commented_out(String line) throws IOException {
    return line.startsWith("//");
  }
  
  static boolean check_class() throws IOException {
    Scanner s = new Scanner(new FileReader("CreateNode.java"));
    int numClasses = 0;
    while(s.hasNextLine()) {
      String line = s.nextLine().replaceAll("\\s", "");
      if (!is_commented_out(line) && line.replace(" ", "").contains("class")) numClasses++;
    }
    return numClasses >= 2;
  }
  
  static boolean check_name() throws IOException {
    Scanner s = new Scanner(new FileReader("CreateNode.java"));
    while(s.hasNextLine()) {
      String line = s.nextLine().replaceAll("\\s", "");
      if (!is_commented_out(line) && line.replace(" ", "").contains("name=")) return true;//this relied a lot on variable names in the original version...
    }
    return false;
  }
  
  static boolean check_next() throws IOException {
    Scanner s = new Scanner(new FileReader("CreateNode.java"));
    while(s.hasNextLine()) {
      String line = s.nextLine().replaceAll("\\s", "");
      if (!is_commented_out(line) && line.replace(" ", "").contains("next=")) return true;//this relied a lot on variable names in the original version...
    }
    return false;
  }
  
  static boolean check_variable() throws IOException {
     Scanner s = new Scanner(new FileReader("CreateNode.java"));
     while(s.hasNextLine()) {
       String line = s.nextLine().replaceAll("\\s", "");
       if (!is_commented_out(line) && line.replace(" ", "").contains("Node") && line.replace(" ", "").contains("=")) return true;//this relied a lot on variable names in the original version...
     }
     return false;
  }
  
  static boolean check_node() throws IOException {
     Scanner s = new Scanner(new FileReader("CreateNode.java"));
     while(s.hasNextLine()) {
       String line = s.nextLine().replaceAll("\\s", "");
       if (!is_commented_out(line) && line.replace(" ", "").contains("newNode") && line.replace(" ", "").contains("Maria")) return true;//this relied a lot on variable names in the original version...
     }
     return false;
  }
  
  
}