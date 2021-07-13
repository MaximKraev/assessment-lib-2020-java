import java.util.*;
import java.io.*;

public class FindHashTable {
  public static void main (String[] args) {
    
    //INPUT CODE -- don't modify!
    Hashtable<String, Integer> fave_nums = new Hashtable<String, Integer>();
    for (int i = 0; i < args.length; i += 2) {
      fave_nums.put(args[i], Integer.parseInt(args[i + 1]));
    }
    
    //Your code here (the Hashtable is called fave_nums)
  }
}