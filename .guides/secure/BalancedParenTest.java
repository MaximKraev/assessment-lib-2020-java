import java.util.*;
import java.io.*;

public class BalancedParenTest {
  public static void main(String[] args) {
    boolean all_passed = true;
    String[] cases = new String[]{"", "()", "(())()(())", ")", "(", "))", "(()))(())", "())()("};
    boolean[] truths = new boolean[]{true, true, true, false, false, false, false, false};
    for (int i = 0; i < cases.length; i++) {
      if (!check_case(cases[i], truths[i])) {
        System.out.print("System did not return ");
        System.out.print(truths[i]);
        System.out.println(" for case " + cases[i]);
        System.out.println("Test not passed.");
        System.exit(1);
      }
    }
    System.out.println("Test passed!");
    System.exit(0);    
  }
  
  static boolean check_case(String str, boolean result) {
    return BalancedParen.paren_balanced(str) == result;
  }
}