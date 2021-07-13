import java.util.*;
import java.io.*;

public class ALCodeTest {
  
  public static void main(String[] args) throws IOException { 
    
    boolean all_passed = true;
    if (!check_output()) {
      System.out.println("Output was incorrect.");
      all_passed = false;
    }
    if (!check_array_list()) {
      System.out.println("The code did not use an ArrayList.");
      all_passed = false;
    }
    if (!check_add()) {
      System.out.println("The code did not add anything to the ArrayList.");
      all_passed = false;
    }
    if (!check_remove()) {
      System.out.println("The code did not remove anything from the ArrayList.");
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
  
  //Check that a line of code is not commented out
  static boolean is_commented_out(String line) throws IOException {
    return line.startsWith("//");
  }
  
  //Check that the output is 321 followed by 42
  static boolean check_output() throws IOException {
    String[] test = {"Hi"};
    CreateArrayList.main(test);
    Scanner s = new Scanner(new FileReader("output.txt"));
    int result1 = s.nextInt();
    int result2 = s.nextInt();
    return result1 == 321 && result2 == 42;
  }
  
  //Check that an ArrayList is used -- is there a way to import the arraylist itself and see what's happening to it?
  static boolean check_array_list() throws IOException {
    Scanner s = new Scanner(new FileReader("CreateArrayList.java"));
    while(s.hasNextLine()) {
      String line = s.nextLine();
      if (!is_commented_out(line) && line.contains("ArrayList<Integer>")) return true;
    }
    return false;
  }
  
  //Check that the add method is used on the array list
  static boolean check_add() throws IOException {
    Scanner s = new Scanner(new FileReader("CreateArrayList.java"));
    while(s.hasNextLine()) {
      String line = s.nextLine();
      if (!is_commented_out(line) && line.contains(".add(")) return true;
    }
    return false;
  }
  
  //check that the remove method is used on the array list
  static boolean check_remove() throws IOException {
    Scanner s = new Scanner(new FileReader("CreateArrayList.java"));
    while(s.hasNextLine()) {
      String line = s.nextLine();
      if (!is_commented_out(line) && line.contains(".remove(")) return true;
    }
    return false;
  }
  
}