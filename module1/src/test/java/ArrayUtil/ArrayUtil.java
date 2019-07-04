package ArrayUtil;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * ArrayUtil exercises.
 */
public class ArrayUtil {

  /**
   * Finds the common elements between two arrays (String values).
   *
   * @param array1 first array
   * @param array2 second array
   * @return String array with common elements
   */
  public static String[] findCommon(String[] array1, String[] array2) {
    HashSet<String> hashSet = new HashSet();
    List arrayList1 = Arrays.asList(array1);
    List arrayList2 = Arrays.asList(array2);
    for (int i = 0; i < arrayList1.size(); i++) {
      if (arrayList2.contains(arrayList1.get(i))) {
        hashSet.add(arrayList1.get(i).toString());
      }
    }

    return hashSet.toArray(new String[hashSet.size()]);
  }
}