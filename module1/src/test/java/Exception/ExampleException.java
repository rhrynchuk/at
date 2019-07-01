package Exception;

public class ExampleException {
  public static int rectangleArea(int a, int b) {
    if (a < 1 | b < 1) throw new IllegalArgumentException("Input value is below zero!");

    return a * b;
  }
}


