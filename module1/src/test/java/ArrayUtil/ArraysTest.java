package ArrayUtil;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ArraysTest {

  /**
   * Test data for common array elements.
   *
   * @return test data array
   */
  @DataProvider(name = "ArrayUtil")
  public static Object[][] arrays() {
    return new Object[][]{
        {
            new String[]{"Python", "JAVA", "PHP", "C#", "C++", "SQL"},
            new String[]{"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"},
            new String[]{"JAVA", "SQL"}
        },
        {
            new String[]{"Kyiv", "Budapest", "Kyiv", "Warsaw", "Tbilisi", "Lima"},
            new String[]{"Washington", "Lima", "Brasilia", "Dakar", "Kyiv"},
            new String[]{"Lima", "Kyiv"}
        },
        {
            new String[]{"BMW", "Lexus", "Infinity", "Kia", "Mazda", "Audi", "Opel", "GMC"},
            new String[]{"Ford", "Honda", "Toyota"},
            new String[]{}
        }
    };
  }

  @Test(dataProvider = "ArrayUtil")
  public void testFindCommon(String[] array1, String[] array2, String[] expectedResult) {

    assertEquals(ArrayUtil.findCommon(array1, array2), expectedResult,
        "Common elements are not correct");
  }
}