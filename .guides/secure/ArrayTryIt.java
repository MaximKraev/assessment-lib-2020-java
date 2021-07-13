import java.util.*;
import java.io.*;

public class ArrayTryIt {
  public static void main(String[] args) {
    Random rng = new Random();
    Integer len = rng.nextInt(93) + 7;
    String[] actualArgs = new String[len];
    for (int i = 0; i < actualArgs.length; i++) {
      Integer randomNum = rng.nextInt(100);
      actualArgs[i] = randomNum.toString();
    }
    System.out.println("Original array: ");
    for(String s : actualArgs) {
      System.out.println(s);
    }
    System.out.println("Your solution: ");
    System.out.println(ArrayConversion.arrayConverter(actualArgs));
  }
  
}