package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Regular expressions.
 */
public class RegExp {

  /**
   * Get IP address from text.
   * @param text text to parse
   * @return String with IP address
   */
  public static String getIpAddress(String text) {

    String regex = "(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-5][0-4])(\\.|$)){4}";  //"(\\d{1,3}\\.*)+";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(text);
    while (matcher.find()) {
      return matcher.group();
    }
    return "";
  }
}