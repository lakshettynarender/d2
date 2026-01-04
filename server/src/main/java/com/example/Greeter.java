package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * Greets the specified person.
   * @param someone The name of the person to greet
   * @return A greeting message
   */
  public String greet(String someone) {
    return String.format("Hello How are you, %s!", someone);
  }

  /**
   * Adds two numbers together.
   * @param a The first number
   * @param b The second number
   * @return The sum of a and b
   */
  public int add(int a, int b) {
    return a + b;
  }
}
