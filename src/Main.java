import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

  private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
  private static final List<String> strings = new ArrayList<>(
      List.of("один", "два", "два", "три", "три", "три"));

  public static void main(String[] args) {
    task4();
  }

  public static void task1() {
    for (int num : nums) {
      if (num % 2 != 0) {
        System.out.println(num);
      }
    }
  }

  public static void task2() {
    Collections.sort(nums);
    int prewNum = Integer.MIN_VALUE;
    for (int num : nums) {
      for (int i : nums) {
        if (num % 2 == 0 && num != prewNum) {
          System.out.println(num);
          prewNum = num;
        }
      }
    }
  }

  public static void task3() {
    Set<String>uniqeStrings=new HashSet<>(strings);
    System.out.println(uniqeStrings);
  }

  public static void task4() {
    Map<String,Integer>strings1=new HashMap<>();
    for (String string : strings) {
      if (!strings1.containsKey(string)) {
        strings1.put(string, 1);
      } else {
        strings1.put(string, strings1.get(string) + 1);
      }
    }
    System.out.println(strings1.values());

  }
}








