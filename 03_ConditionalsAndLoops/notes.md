# Conditional and loops

## Conditional Statements in Java

- Conditional statements allow the program to make decisions and execute different logic controlled blocks of code based on certain conditions.
- Gives ability to handle multiple scenarios with Nested conditions supported

### Types of Conditional Statements

- `if` statement: Executes a block if the condition is true

  ```java
  if (age >= 18) {
      System.out.println("Adult");
  }
  ```

- `if-else` statement: Executes one block if true, another if false

  ```java
  if (score >= 60) {
      System.out.println("Pass");
  } else {
      System.out.println("Fail");
  }
  ```

- `else-if` ladder: Tests multiple conditions in sequence

  ```java
  if (marks >= 90) {
      System.out.println("A");
  } else if (marks >= 75) {
      System.out.println("B");
  } else {
      System.out.println("C");
  }
  ```

- `switch` statement: Selects one of many code blocks to execute

  ```java

  switch (day) {
      case 1:
          System.out.println("Monday");
          break;
      case 2:
          System.out.println("Tuesday");
          break;
      default:
          System.out.println("Invalid");
  }
  ```

> Braces are optional only when the block contains exactly one statement. Omitting braces can make code less readable and error-prone, especially with nested statements.

## Logical Operators in Java

Logical operators combine multiple boolean conditions in conditional statements and loops.

### `&&` (Logical AND)

- True only if both conditions are true

  ```java
  if (age >= 18 && hasID == true) {
      System.out.println("Allowed");
  }
  ```

### `||` (Logical OR)

- True if at least one condition is true
  ```java
  if (temperature > 100 || pressure > 50) {
      System.out.println("Alert");
  }
  ```

### `!` (Logical NOT)

- Reverses the boolean value
  ```java
  if (!isLoggedIn) {
      System.out.println("Please login");
  }
  ```

## Loops in Java

- Loops are used to execute a block of code repeatedly based on a condition.
- Iteration of loop can be Counter-controlled & Condition-controlled which Iterates over data structures

### Types of Loops

#### 1. `for` loop:

- Iterates a specific `n` number of times
- used when number of iteration is already known before entering the loop

  ```java
  for (int i = 0; i < 5; i++) {
      System.out.println(i);
  }
  ```

#### 2. `while` loop:

- Used when number of iterations is unknown before entering the loop. The condition is checked at the entry of the loop and the loop continues to run while the condition is true. If the condition is false, the loop is exited.\

  ```java
  while (i < 5) {
      System.out.println(i);
      i++;
  }
  ```

#### 3. `do-while` loop:

- Used when number of iterations is not known before entering the loop. The condition is checked at the exit of the loop, so the loop runs at least once, then repeats while condition is true.

  ```java
  int j = 0;
  do {
      System.out.println(j);
      j++;
  } while (j < 5);
  ```

#### 4. `for-each` loop (Enhanced For):

- Used when iterating over arrays or collections. It iterates through each element sequentially without the need for an index or counter. The loop automatically handles the iteration and stops when all elements have been processed.

  ```java
  int[] numbers = {1, 2, 3, 4, 5};
  for (int num : numbers) {
      System.out.println(num);
  }
  ```

#### 5. Ternary Operator

The ternary operator is a shorthand conditional operator that evaluates a boolean expression and returns one of two values. Works as a compact if-else statement and can be nested for multiple conditions

### Syntax

```java
condition ? valueIfTrue : valueIfFalse
```

### Rules

- Condition must evaluate to a boolean and both `valueIfTrue` and `valueIfFalse` must be of compatible types
- Used only for simple conditions, not complex logic

### Example

```java
// Simple Ternary Operator Example 1
int age = 18;
String result = (age >= 18) ? "Adult" : "Minor";

// Simple Ternary Operator Example 2
int score = 85;
System.out.println((score >= 60) ? "Pass" : "Fail");

// Nested Ternary Operator Example
int score = 85;
String grade = (score >= 90) ? "A" : (score >= 75) ? "B" : (score >= 60) ? "C" : "F";
```

## Assignment, Equality, and Comparison in Java

### = (Assignment Operator)

Assigns a value to a variable.

```java
int x = 10;          // Assigns 10 to x
String name = "John"; // Assigns "John" to name
x = 20;              // Reassigns 20 to x
```

### == (Equality Operator)

Compares primitive values or object references.

```java
// Primitive comparison
int a = 5;
int b = 5;
if (a == b) {         // true

}

// Object reference comparison
String s1 = "Hello";
String s2 = "Hello";
if (s1 == s2) {       // true (same string pool)

}

String s3 = new String("Hello");
String s4 = new String("Hello");
if (s3 == s4) {       // false (different objects)

}
```

### .equals() (Method)

Compares the actual content of objects.

```java
String s1 = "Hello";
String s2 = "Hello";
if (s1.equals(s2)) {  // true

}

String s3 = new String("Hello");
String s4 = new String("Hello");
if (s3.equals(s4)) {  // true (content same)

}

// For custom classes, override equals()
// Integer comparison
Integer num1 = 100;
Integer num2 = 100;
if (num1.equals(num2)) { // true

}
```

## Switch Case in Java

A switch statement is a conditional control structure that allows a variable or expression to be tested for equality against a list of case values.

- The expression must evaluate to a constant or literal
- All case values must be of the same type as the expression
- The matching case block is executed

```java syntax
switch (constantOrExpression) {
    case 1:
        // code-block
        break;
    case 2:
        // code-block
        break;
    case 3:
        // code-block
        break;
    default:
        // code-block
    }

    String fruit = "Apple";
    switch (fruit) {
        case "Apple":
            System.out.println("Red");
            break;
        case "Banana":
            System.out.println("Yellow");
            break;
        default:
            System.out.println("Unknown");
    }
```

- If a case matches and has no break statement, execution falls through to all subsequent cases below it until a break is encountered or the switch ends.

```java

// Without break (fall-through)
int num = 1;
switch (num) {
    case 1:
        System.out.println("One");
    case 2:
        System.out.println("Two");
    case 3:
        System.out.println("Three");
    default:
        System.out.println("Default");
}
// Output: One, Two, Three, Default
```

- If no case matches, the default block executes, if it exists.By convention, the default block is placed at the end

```java syntax
// Default not at the end
int value = 5;
switch (value) {
    default:
        System.out.println("Default");
        break;
    case 1:
        System.out.println("One");
        break;
    case 2:
        System.out.println("Two");
        break;
}
```

### Nested Switch in Java

- Inner switch executes only when outer case matches
- Break applies to the innermost switch
- Use braces for inner switch in enhanced syntax
- Default case recommended for both inner and outer switches

```java
int category = 1;
int subCategory = 2;

switch (category) {
    case 1:
        System.out.println("Electronics");
        switch (subCategory) {
            case 1:
                System.out.println("Mobile");
                break;
            case 2:
                System.out.println("Laptop");
                break;
            default:
                System.out.println("Unknown item");
        }
        break;
    case 2:
        System.out.println("Clothing");
        switch (subCategory) {
            case 1:
                System.out.println("Shirt");
                break;
            case 2:
                System.out.println("Jeans");
                break;
            default:
                System.out.println("Unknown item");
        }
        break;
    default:
        System.out.println("Invalid category");
}
```

### Switch as Expression (yield)

- Switch can return a value
- `yield` returns value from a block
- Value assigned to a variable

  ```java
  // Using colon with yield (older style)
  int num = 2;
  String result = switch (num) {
      case 1: yield "One";
      case 2: yield "Two";
      default: yield "Other";
  };

  System.out.println(result); // Two
  ```

### Enhanced Switch - Multiple Case Labels

- No break required with arrow syntax
- No fall-through
- Can return values as expressions
- `yield` keyword for returning values from blocks
- Multiple case labels with commas
- More readable and less error-prone

  ```java
  int day = 3;
  switch (day) {
      case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
      case 6, 7 -> System.out.println("Weekend");
      default -> System.out.println("Invalid");
  };
  ```

### Enhanced Switch - Multiple Case Labels With Block Statements

    ```java
    switch (day) {
        case 1, 2, 3, 4, 5 -> {
            System.out.println("Weekday");
            System.out.println("Working day");
        }
        case 6, 7 -> {
            System.out.println("Weekend");
            System.out.println("Holiday");
        }
        default -> System.out.println("Invalid");
    }
    ```

### Enhanced Switch as Expression (arrow function)

    ```java
    int day = 3;
    String result = switch (day) {
        case 1 -> "Monday";
        case 2 -> "Tuesday";
        case 3 -> {
            String msg = "Wednesday";
            yield msg;
        }
        default -> "Invalid";
    };

    System.out.println(result); // Wednesday
    ```

### Enhanced Syntax with Nested

```java
int type = 1;
int size = 2;

String result = switch (type) {
    case 1 -> {
        String output = "Type A - ";
        output += switch (size) {
            case 1 -> "Small";
            case 2 -> "Medium";
            case 3 -> "Large";
            default -> "Unknown";
        };
        yield output;
    }
    case 2 -> {
        String output = "Type B - ";
        output += switch (size) {
            case 1 -> "XS";
            case 2 -> "S";
            case 3 -> "M";
            default -> "Unknown";
        };
        yield output;
    }
    default -> "Invalid";
};
```
