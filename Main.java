public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");
    System.out.println(12 + 32);
    System.out.println(12 - 2);
    // use for comment in java programing.
    System.out.println("i am java developer"); // this code about java developer.
    /*
     * i am learning java programing language. Jav is popular langauge.
     * and im very glad to learn java. thank you.
     */
    // creating variable in java as syntax: data_type variable_name = value;
    String name = "java bro";
    System.out.println(name);
    int number = 34;
    System.out.println(number);
    float decimalNumber = 3.14f;
    System.out.println(decimalNumber);
    char letter = 'A';
    System.out.println(letter);
    boolean isJavaFun = true;
    System.out.println(isJavaFun);

    final int num = 122; // constant variable
    System.out.println(num);

    final float num1 = 112.33f;
    System.out.println(num1);

    String fname = "java";
    String lname = "developer";
    System.out.println(fname + " " + lname);

    int x = 9;
    int y = 11;
    System.out.println(x + y);

    // multiple variable in one line1
    int x1 = 12, y1 = 33, z1 = 45;
    System.out.println("sum is : " + (x1 + y1 + z1));

    // one value to multiple variable
    int a, b, c;
    a = b = c = 50;
    System.out.println(a + b + c);

    byte mynum = 50; // byte
    System.out.println(mynum);

    short mynum1 = 5000; // short
    System.out.println(mynum1);

    int mynum2 = 100000; // int
    System.out.println(mynum2);

    long mynum3 = 15000000000L; // long
    System.out.println(mynum3);

    double mynum4 = 19.99d; // double
    System.out.println(mynum4);

    float mynum5 = 5.75f; // float
    System.out.println(mynum5);

    // scientific number
    double mynum6 = 5.67e3d; // 5.67 * 10^3
    System.out.println(mynum6);

    float mynum7 = 8.12e4f; // 8.12 * 10^4
    System.out.println(mynum7);

    boolean isJava = true; // boolean
    System.out.println(isJava);

    boolean isFishTasty = false; // boolean
    System.out.println(isFishTasty);

    char myLetter = 'D'; // char
    System.out.println(myLetter);

    char myLetter1 = 65, myLetter2 = 66, myLetter3 = 67; // char using ASCII value
    System.out.println(myLetter1);
    System.out.println(myLetter2);
    System.out.println(myLetter3);

    String myText = "Hello World"; // String
    System.out.println(myText);

    // java var
    var myVar = "I am a java developer";
    System.out.println(myVar);

    var x11 = 105;
    System.out.println(x11);

    // widening casting (automatically) - converting a smaller type to a larger type
    // size
    int myInt = 9;
    double myDouble = myInt; // Automatic casting: int to double
    System.out.println(myInt);
    System.out.println(myDouble);

    // narrowing casting (manually) - converting a larger type to a smaller size
    // type
    double myDouble1 = 9.78;
    int myInt1 = (int) myDouble1; // Manual casting: double to int
    System.out.println(myDouble1);
    System.out.println(myInt1);

    // operators in java
    int p = 10;
    int q = 5;
    System.out.println("Addition: " + (p + q));
    System.out.println("Subtraction: " + (p - q));

    // arithmetic operators
    int x2 = 12;
    int y2 = 5;
    System.out.println(x2 + y2); // Addition
    System.out.println(x2 - y2); // Subtraction
    System.out.println(x2 * y2); // Multiplication
    System.out.println(x2 / y2); // Division
    System.out.println(x2 % y2); // Modulus
    System.out.println(++x2); // Increment
    System.out.println(--y2); // Decrement

    // assignment operators
    int a1 = 10;
    a1 += 5; // a1 = a1 + 5
    System.out.println(a1);
    a1 -= 3; // a1 = a1 - 3
    System.out.println(a1);
    a1 *= 2; // a1 = a1 * 2
    System.out.println(a1);
    a1 /= 4; // a1 = a1 / 4
    System.out.println(a1);
    a1 %= 3; // a1 = a1 % 3
    System.out.println(a1);

    // comparison operators
    int a2 = 10;
    int b2 = 20;
    System.out.println(a2 == b2); // Equal to
    System.out.println(a2 != b2); // Not equal to
    System.out.println(a2 > b2); // Greater than
    System.out.println(a2 < b2); // Less than
    System.out.println(a2 >= b2); // Greater than or equal to
    System.out.println(a2 <= b2); // Less than or equal to

    // logical operators
    boolean x3 = true;
    boolean y3 = false;
    System.out.println(x3 && y3); // Logical AND
    System.out.println(x3 || y3); // Logical OR
    System.out.println(!x3); // Logical NOT

    System.out.println("--------------------------------");
    // java string methods
    String str = "Hello, Java Developer!";
    System.out.println(str.length()); // Length of the string

    System.out.println(str.toUpperCase()); // Convert to uppercase
    System.out.println(str.toLowerCase()); // Convert to lowercase

    System.out.println(str.indexOf("Java")); // Find index of substring
    // charAt()
    System.out.println(str.charAt(7)); // Character at index 7
    System.out.println(str.replace("Java", "World")); // Replace substring

    // comparing strings
    String str1 = "Hello";
    String str2 = "hello";
    System.out.println(str1.equals(str2)); // false
    System.out.println("--------------------------------");
    // remove whitespace
    String str3 = "   Hello World   ";
    System.out.println(str3);
    System.out.println(str3.trim()); // Remove whitespace

    // string concatenation
    String firstName = "Java";
    String lastName = "Developer";
    String fullName = firstName + " " + lastName;
    System.out.println(fullName);

    // concat() method
    String fullName1 = firstName.concat(" ").concat(lastName);
    System.out.println(fullName1);

    String a11 = "Java ";
    String b1 = "is ";
    String c1 = "fun!";
    String result = a11.concat(b1).concat(c1);
    System.out.println(result);

    // java math methods
    int absValue = Math.abs(-10);
    System.out.println("Absolute value: " + absValue);
    int maxValue = Math.max(5, 19);
    System.out.println("Maximum value: " + maxValue);
    int minValue = Math.min(5, 19);
    System.out.println("Minimum value: " + minValue);
    double sqrtValue = Math.sqrt(64);
    System.out.println("Square root: " + sqrtValue);
    double powerValue = Math.pow(2, 3);
    System.out.println("Power value: " + powerValue);
    double roundValue = Math.round(5.67);
    System.out.println("Rounded value: " + roundValue);
    double ceilValue = Math.ceil(5.12);
    System.out.println("Ceiling value: " + ceilValue);
    double floorValue = Math.floor(5.89);
    System.out.println("Floor value: " + floorValue);
    int randomValue = (int) (Math.random() * 100);
    System.out.println("Random value between 0 and 99: " + randomValue);

    // boolean methods
    String testStr = "Hello World";
    System.out.println(testStr.isEmpty()); // Check if string is empty
    System.out.println(testStr.startsWith("Hello")); // Check if string starts with substring
    System.out.println(testStr.endsWith("World")); // Check if string ends with substring
    System.out.println(testStr.contains("lo Wo")); // Check if string contains substring

  }
}
