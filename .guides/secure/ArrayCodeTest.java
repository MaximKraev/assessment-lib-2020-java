import java.util.*;
import java.io.*;

public class ArrayCodeTest {
  public static void main(String[] args) throws IOException {
    boolean all_passed = true;
    if (!check_output()) {
      System.out.println("Output was incorrect.");
      all_passed = false;
    }
    if (!check_int_array()) {
      System.out.println("The code did not use an int array.");
      all_passed = false;
    }
    if (!check_times_3()) {
      System.out.println("The code did not multiply the numbers by 3.");
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
  
  static boolean check_output() {
    //Generate randomized input
    Random rng = new Random();
    Integer len = rng.nextInt(93) + 7;
    String[] actualArgs = new String[len];
    for (int i = 0; i < actualArgs.length; i++) {
      Integer randomNum = rng.nextInt(100);
      actualArgs[i] = randomNum.toString();
    }
    int correct = Integer.parseInt(actualArgs[5])*3;    
    int test = ArrayConversion.arrayConverter(actualArgs);
    return correct == test;
  }
  
  static boolean check_int_array() throws IOException {
    Scanner s = new Scanner(new FileReader("ArrayConversion.java"));
    while(s.hasNextLine()) {
      String line = s.nextLine().replaceAll("\\s", "");
      if (!is_commented_out(line) && line.contains("int[]")) return true;
    }
    return false;
  }
  
  static boolean check_times_3() throws IOException {
    Scanner s = new Scanner(new FileReader("ArrayConversion.java"));
    while(s.hasNextLine()) {
      String line = s.nextLine().replaceAll("\\s", "");
      if (!is_commented_out(line) && (line.contains("*3") || line.contains("*=3"))) return true;
    }
    return false;
  }
    
}
  