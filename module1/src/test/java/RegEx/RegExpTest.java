package RegEx;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegExpTest {

  /**
   * Test data.
   *
   * @return test data array
   */
  @DataProvider(name = "text")
  public static Object[][] text() {
    return new Object[][]{
        {"8.8.8.8", "8.8.8.8"},
        {"http://192.168.1.1/index.html", "192.168.1.1"},
        {"This text contains a valid IP address 254.254.254.254, find it!", "254.254.254.254"},
        {"IP could not have negative numbers like -1.-2.-3.-4", ""},
        {" Invalid IP: 300.300.300.300!", ""},
        {"My localhost is: 127.0.0.1", "127.0.0.1"},
        {"Very bad example: 01.02.03.04", ""}
    };
  }

  @Test(dataProvider = "text")
  public void testSumArray(String text, String expectedResult) {
    String actualResult = RegExp.getIpAddress(text);

    assertEquals(actualResult, expectedResult, "IP address is not correct");
  }
}