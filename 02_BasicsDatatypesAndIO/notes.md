# 02 Basics, Data Types and Input / Output

## Java Code Convention

1. Filename Convention

- The entry file is the one containing the `main()` method. It must be named exactly as the public class defined in it.
- If the class is public, the filename must match the class name exactly (case-sensitive) and have a `.java` extension. For example, `HelloWorld.java` must contain `public class HelloWorld`.

2. Naming Conventions (Class, Function, Variable, Constant, Static)

- Class names: PascalCase : e.g., `StudentDetails`, `CarFactory`.
- Method names: camelCase : e.g., `calculateTotal()`, `getName()`.
- Variable names: camelCase : e.g., `studentName`, `totalMarks`.
- Constants (`static final`): UPPER_SNAKE_CASE : e.g., `MAX_VALUE`, `PI`.
- Static variables follow the same convention as instance variables unless they are constants.

## `main()` method in Java

- This is the entry point of a standalone Java application. The JVM calls it when the program starts.
- `public` makes the method accessible from anywhere.
- `static` lets the JVM call it without creating an object.
- `void` means the method does not return a value.
- `main` is the fixed name the JVM looks for.
- `String[] args` accepts command-line arguments as an array of strings. `String... args` is also valid.
- The standard signature is `public static void main(String[] args)`. Different modifier order is also allowed.

```java
public class Main {
  public static void main(String[] args) {
      System.out.println("Hello, World!");
  }
}
```

## Rules Around the `main` Method

- The method name must be `main` (case-sensitive) and it must accept one `String[]` argument, or use the equivalent varargs form `String... args`.
- The modifier order may be `static public`, but `public static` is the usual form. `final` is optional.
- A missing `public` or `static`, a different return type, or different parameters will not be recognized as the application entry point.
- The containing class may be public or package-private. A top-level class cannot be `protected` or `private`.

### Commands to compile and run a HelloWorld class

```shell
# compilation, create .class file
javac HelloWorld.java

# execution
java HelloWorld
```

### Latest updates in Java

- From Java 11 onwards, a single-file program can be run directly; the `java` launcher compiles it in the background.

```bash
java HelloWorld.java
```

- Java 23 finalized simplified `main` method signatures:

```java
void main() { }
void main(String[] args) { }
```

## `System` Class in Java

- `System` is a utility class in the `java.lang` package that provides standard system resources and utility methods.
- It cannot be instantiated because its constructor is private. Its members are static, and it is available without an import statement.

### Key components

- `System.in` : standard input stream, typically the keyboard.
- `System.out` : standard output stream, typically the console.
- `System.err` : standard error stream.
- `System.getProperties()` : returns current system properties.
- `System.getProperty(String key)` : gets a property such as `java.version` or `os.name`.
- `System.exit(int status)` : terminates the JVM.
- `System.gc()` : suggests garbage collection; it is not guaranteed.
- `System.currentTimeMillis()` : returns the current time in milliseconds.
- `System.nanoTime()` : returns high-precision time in nanoseconds.
- `System.arraycopy()` : copies arrays efficiently.
- `System.console()` : returns the console for reading input, or may return `null` in non-interactive environments.

## Input and Output

### `System.out`

- `System.out` is a static field of type `PrintStream`.
- `PrintStream` converts data to strings automatically and provides `print()`, `println()`, `printf()`, and `format()`.
- `write(int b)` writes a byte, `write(byte[] b)` writes an array, `flush()` flushes output, and `close()` closes the stream (rarely used for `System.out`).

#### I/O example

```java
import java.util.Scanner;

public class DisplayName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name ?  => ");
        String name = sc.nextLine();

        System.out.println("Hello," + name);
        sc.close();
    }
}
```

### Scanner Class

- The `Scanner` class is part of the `java.util` package.
- It is used to read input from various sources like the keyboard (System.in), files, or strings.
- It breaks input into tokens using a delimiter (whitespace by default).
- Provides methods like `nextInt()`, `nextLine()`, `nextDouble()` to read different data types.
- Common constructors:
  - `Scanner(InputStream source)` – for reading from System.in.
  - `Scanner(File source)` – for reading from a file.
  - `Scanner(String source)` – for parsing a string.
- Useful methods:
  - `hasNext()` – checks if there is another token.
  - `hasNextInt()` – checks if the next token is an integer.
  - `close()` – closes the scanner to free resources.
- Example:
  ```java
  Scanner sc = new Scanner(System.in);
  int age = sc.nextInt();
  String name = sc.nextLine();
  sc.close();
  ```
- Note – Always close the scanner when done, or use try‑with‑resources for automatic closure.

#### nextDatatype() Methods in Scanner

- `nextInt()` – reads an integer value.
- `nextDouble()` – reads a double value.
- `nextFloat()` – reads a float value.
- `nextLong()` – reads a long value.
- `nextShort()` – reads a short value.
- `nextByte()` – reads a byte value.
- `nextBoolean()` – reads a boolean value (true/false).
- `nextLine()` – reads an entire line of text (including spaces).
- `next()` – reads a single word (stops at whitespace).
- `nextBigInteger()` – reads a BigInteger value.
- `nextBigDecimal()` – reads a BigDecimal value.

#### Type Mismatch in Scanner Methods

- If you try to input a value of one type where a different type is expected (e.g., entering "abc" for `nextInt()`), the program throws an `InputMismatchException` at runtime.
- The scanner does not automatically convert types; it expects the exact matching format for each method.

## Datatype

- A datatype defines the type of data a variable can hold and specifies its size, range, and supported operations.
- Java has two categories: primitive types and reference types.

### Datatype in Java

- Primitive types store actual values directly in memory. They are predefined, non-object types with fixed sizes: `int`, `double`, `char`, `boolean`, `byte`, `short`, `long`, and `float`.
- Reference types store a reference to an object on the heap. They include classes, interfaces, arrays, and enums, such as `String`, `Scanner`, `int[]`, and custom classes.

### Built-in primitive data types in Java

### Datatype `byte`:
- Used to store small whole numbers (positive or negative). Often used for memory-saving in large arrays.
- Range: -128 to 127
- Size: 8 bits (1 byte)
- Default value: 0

### Datatype `short`:
- Used to store medium-sized whole numbers (positive or negative) when memory is a concern.
- Range: -32,768 to 32,767
- Size: 16 bits (2 bytes)
- Default value: 0

### Datatype `int`:
- Used to store whole numbers (positive or negative) : the most common integer type.
- Range: -2³¹ to 2³¹-1 (-2,147,483,648 to 2,147,483,647)
- Size: 32 bits (4 bytes)
- Default value: 0

### Datatype `long`:
- Used when a wider range than int is needed, e.g., for large counters or timestamps.
- Range: -2⁶³ to 2⁶³-1
- Size: 64 bits (8 bytes)
- Must be declared with an `L` suffix (e.g., `100L`).
- Default value: 0L

### Datatype `float`:
- Used to store fractional numbers (decimals) with single precision. Saves memory compared to double.
- Range: Approx. ±3.4e-38 to ±3.4e+38 (6-7 significant digits)
- Size: 32 bits (4 bytes)
- Must be declared with an `f` suffix (e.g., `3.14f`).
- Default value: 0.0f

### Datatype `double`:
- Used for fractional numbers with double precision : default choice for decimals.
- Range: Approx. ±1.7e-308 to ±1.7e+308 (15-16 significant digits)
- Size: 64 bits (8 bytes)
- Default value: 0.0d

### Datatype `char`:
- Used to store a single Unicode character (text symbol).
- Range: 0 to 65,535 (unsigned, represents Unicode code points)
- Size: 16 bits (2 bytes) : holds UTF-16 code units.
- Literals are enclosed in single quotes (e.g., `'A'`).
- Default value: '\u0000' (null character)

### Datatype `boolean`:
- Used for logical values (true/false), typically for conditions and flags.
- Range: Only two values: `true` or `false`
- Size: JVM-dependent, but typically 1 bit (or 1 byte for array).
- Default value: `false`


## Reference Types

- Definition : Variables of reference type hold a memory address (reference) to an object stored on the heap, not the actual data.
- Examples : Classes, interfaces, arrays, enums. `String`, `Scanner`, `int[]`, custom classes.
- Size : Varies (typically 4 or 8 bytes for the reference, depending on JVM/architecture) : actual object size differs.
- Default value : `null` for all reference types.

##  Literal and Identifier

- Literal : A fixed value directly written in the source code, representing a constant data value. Examples: `10`, `3.14`, `'A'`, `"Hello"`, `true`, `null`.
- Identifier : A name given to a variable, method, class, or other user-defined element in Java. It must start with a letter, underscore (`_`), or dollar sign (`$`), and cannot be a reserved keyword. Examples: `studentName`, `calculateTotal`, `MAX_VALUE`.




### Casting and Conversions

- Type Casting – Converting a value from one data type to another.
    - Implicit (Widening) Conversion – Automatic conversion from smaller to larger type (no data loss). Occurs when assigning a smaller type to a larger type.
        * `byte → short → int → long → float → double`
        * Example: `int x = 10; double y = x;` (automatic)
    - Explicit (Narrowing) Conversion – Manual conversion from larger to smaller type (may lose data). Requires casting operator `(type)`.
        * `double → float → long → int → short → byte`
        * Example: `double x = 10.5; int y = (int) x;` (y becomes 10, .5 lost)

- Numeric Promotion – When performing operations on mixed types, smaller types are promoted to larger types before calculation.
  * Example: `int + double → double`

- String Conversion – Any type concatenated with a String becomes a String.
  * Example: `"Value: " + 10 → "Value: 10"`

- Object Casting – Casting between classes in an inheritance hierarchy (up-casting/down-casting).
  * Up-casting: `Animal a = new Dog();` (automatic)
  * Down-casting: `Dog d = (Dog) a;` (explicit, risky)

- Wrapper Class Conversions – Converting between primitives and their wrapper classes:
  * Auto-boxing: `Integer i = 10;` (automatic)
  * Un-boxing: `int x = i;` (automatic)

  ### Rounding During Narrowing
    - Casting `double` to `int` truncates (drops decimal), not rounds. Example: `(int) 10.9` → `10`.
    - Use `Math.round()` for actual rounding. Example: `Math.round(10.5)` → `11`.
    - Casting larger integral type to smaller (e.g., long to int) causes overflow (wraps around modulo range), no rounding.


## Comments in Java

Comments are text in the source code that are ignored by the compiler. They are used to explain code, make notes, or disable code temporarily.

### Single-line Comments
Start with `//` and continue to the end of the line.

```java
// This is a single-line comment
int x = 10; // This comment is at the end of a line
```

### Multi-line Comments
Start with `/*` and end with `*/`. They can span multiple lines.

```java
/*
 This is a multi-line comment.
 It can cover several lines.
*/
int y = 20;
```

### Documentation Comments
Start with `/**` and end with `*/`. Used to generate API documentation.

```java
/**
 * This is a documentation comment.
 * It describes the class or method.
 */
public void myMethod() { }
```