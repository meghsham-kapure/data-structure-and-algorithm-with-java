# Function

- Functions in Java are blocks of code that perform a specific task. 
- They are reusable blocks of code, accept input parameters and can return a value
- Help in code organization and modularity and Avoid code duplication implementing DRY (Don't Repeat Yourself)
- Function / Methods are declared inside a class and by convention, named with verb and follow `camelCase`.

### Basic Syntax

```java
public returnType functionName(parameters) {
    // body
}

/*  Components of a Function
    * Access modifier : public / private / protected / no modifier
    * Return type : datatype primitive / non-primitive / void
    * Function name : function identifier
    * Parameters (optional) : inputs 
    * Body enclosed in braces
*/
```

- Methods are called using an object  or class name if `static` and arguments are passed inside parentheses.
- Dot operator (.) is used to call a method

    ```java
    object.methodName();
    object.methodName(arg1, arg2);
    ```

### Types of method

#### Instance methods: called on objects

    ```java
    public class Car {
        
        public void drive() {
            System.out.println("Car is driving");
        }
        
        public static void main(String[] args) {
            Car myCar = new Car();
            myCar.drive();
        }
    }
    ```

#### Static methods: called on class name

    ```java
    public class Car {
        
        public static void drive() {
            System.out.println("Car is driving");
        }
        
        public static void main(String[] args) {
            Car.drive();
        }
    }
    ```

#### Abstract methods: declared without body

    ```java
    // Abstracted method
    interface Vehicle {
        void drive();
    }

    public class Car implements Vehicle {
        
        @Override
        public void drive() {
            System.out.println("Car is driving");
        }
        
        public static void main(String[] args) {
            Vehicle myCar = new Car();
            myCar.drive();
        }
    }
    ```

#### Final methods: cannot be overridden

    ```java
    interface Vehicle {
        void drive();
    }

    public class Car implements Vehicle {
        
        @Override
        public final void drive() {
            System.out.println("Car is driving");
        }
        
        public static void main(String[] args) {
            Vehicle myCar = new Car();
            myCar.drive();
        }
    }
    ```

#### Default Method : Interface method that has body and optimally overridden

    ```java
    interface Vehicle {
        default void drive() {
            System.out.println("Vehicle is driving");
        }
    }

    public class Car implements Vehicle {
        
        public static void main(String[] args) {
            Vehicle myCar = new Car();
            myCar.drive();
        }
    }
    ```

## Method Overloading

- Method overloading allows multiple methods in the same class to have the same name but different parameters.
- Compile-time polymorphism /  static polymorphism


### Rules for Method Overloading

- Methods must have the same name
- Parameter list must be different (type, number, or order)
- Return type can be different but not sufficient for overloading
- Access modifiers can be different
- Can be done in the same class or subclass

### Examples

```java
public class Calculator {
    
    public int add(int a, int b) {
        return a + b;
    }
    
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    public double add(double a, double b) {
        return a + b;
    }
}
```

## Method Overriding

Method overriding allows a subclass to provide a specific implementation of a method that is already defined in its superclass or interface.

### Rules for Method Overriding

- Method must have the same name, return type, and parameters
- Access modifier cannot be more restrictive (`private` -> `default` -> `protected` -> `public`)
- Cannot override final methods
- Cannot override static methods
- Must use @Override annotation for best practice

### Example with Interface Inheritance Overriding

```java
interface Vehicle {
    void drive();
}

public class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Car is driving");
    }
}
```

### Example with Class Inheritance Overriding

```java
class Animal {
    public void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}
```

### Access Modifier Rules

```java
class Parent {
    protected void display() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    @Override
    public void display() { // protected to public allowed (less restrictive)
        System.out.println("Child");
    }
}
```
## Pass by Value / Pass by Reference in Java

### Pass by Value
- Java always uses pass by value
- A copy of the value is passed to the method
- Changes to the parameter inside the method do not affect the original variable
- When a primitive value is copied by pass by value to another variable, changing the original or copied variable does not affect the other value.
- But when a non-primitive (object) is passed, the reference value is copied. Changing the object's internal state affects the original object, but reassigning the reference does not affect the original reference.

### Pass by Reference
- Java does not support pass by reference directly
- When an object reference is passed, the reference value is copied
- Changes to the object's state affect the original object
- Reassigning the reference inside the method does not affect the original reference

## Block Scope

Block scope refers to the visibility and lifetime of variables declared within a block of code enclosed in curly braces `{}`.
- Variables declared inside a block are only accessible within that block
- Blocks include method bodies, loops, conditional statements, and static/instance initializers
- Variables declared in a block are created when the block is entered and destroyed when the block exits
- Outer blocks cannot access variables from inner blocks
- Inner blocks can access variables from outer blocks (unless shadowed)
- The same variable name cannot be declared twice in the same block but shadowing is allowed.

### Examples

```java
public class ScopeExample {
    
    public void method() {
        int x = 10; // method scope
        
        if (x > 5) {
            int y = 20; // block scope (inside if)
            System.out.println(x); // accessible
            System.out.println(y); // accessible
        }
        
        // System.out.println(y); // error - y not accessible here
    }
    
    public void loopScope() {
        for (int i = 0; i < 5; i++) {
            int z = i; // block scope (inside loop)
            System.out.println(z);
        }
        // System.out.println(z); // error - z not accessible here
        // System.out.println(i); // error - i not accessible here
    }
}
```

### Local Variable Shadowing

Shadowing occurs when a variable declared in an inner scope has the same name as a variable in an outer scope. The inner variable temporarily hides or "shadows" the outer variable within that inner scope.

```java
public class ShadowExample {
    int value = 100; // instance variable
    
    public void method() {
        int value = 50; // local variable shadows instance variable
        System.out.println(value); // prints 50
        System.out.println(this.value); // prints 100
    }
}
```

#### Shadowing with Outer and Inner Functions

When an outer method and an inner method both have a variable with the same name, the inner method's variable shadows the outer method's variable. The outer variable is hidden within the inner method.

```java
public class Example {
    
    public void outerMethod() {
        int x = 10; // outer method variable
        
        // Inner method or block
        if (true) {
            int x = 20; // inner block variable shadows outer x
            System.out.println(x); // prints 20
        }
        
        System.out.println(x); // prints 10
    }
}
```

- The inner variable only exists inside the inner block
- The outer variable remains unchanged and accessible outside the inner block
- To access the outer variable inside the inner block, use `this` if it is an instance variable

### Loop Scopes

Variables declared inside a loop are limited to the loop body and are not accessible outside the loop.

### Key Points

- Variables declared inside the loop body are created each iteration and destroyed after each iteration
- Variables declared in the loop initialization are accessible only within the loop
- Variables declared outside the loop are accessible inside the loop
- The same variable name cannot be declared twice within the same loop body

### Examples

```java
    public static void main(String[] args) {
        int num = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println(i); // accessible

            int x = i * 2; // created each iteration
            System.out.println(x);// accessible

            System.out.println(num); // accessible
        }

        // System.out.println(i); // error - i not accessible

        // System.out.println(x); // error - x not accessible

        System.out.println(sum); // accessible
    }
```

## Varargs in Java

Varargs (variable-length arguments) allow a method to accept zero or more arguments of a specified type.
- Denoted by three dots (...)
- Must be the last parameter in the method
- Only one varargs parameter allowed per method
- Works with any data type including objects
- Internally treated as an array
- Can be called with zero or more arguments
- Can also accept an array directly and `null` can be passed if method handles it

### Syntax

```java
returnType methodName(dataType... variableName)
```

### Examples

```java
public class VarargsExample {
    
    public void printNumbers(int... numbers) {
        for (int num : numbers) {
            System.out.println(num);
        }
    }
    
    public void display(String prefix, String... names) {
        for (String name : names) {
            System.out.println(prefix + " " + name);
        }
    }
    
    public static void main(String[] args) {
        VarargsExample obj = new VarargsExample();
        
        obj.printNumbers(); // zero arguments
        obj.printNumbers(1, 2, 3); // multiple arguments
        obj.printNumbers(new int[]{4, 5, 6}); // array
        
        obj.display("Hello", "John", "Jane", "Doe");
    }
}
```
