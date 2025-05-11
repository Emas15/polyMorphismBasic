# 🐾 Java Polymorphism Demo

This project demonstrates essential **Object-Oriented Programming (OOP)** concepts in Java:

- ✅ Polymorphism
- ✅ Method Overriding
- ✅ Upcasting & Downcasting
- ✅ Use of `instanceof` keyword
- ✅ Primitive Type Casting (explicit & implicit)

## 📁 Files Included

- `Animal.java` – Base class with a `makeSound()` method.
- `Dog.java` – Subclass of `Animal` with overridden `makeSound()` and a custom `bark()` method.
- `Cat.java` – Subclass of `Animal` with its own `makeSound()` method.
- `Poly.java` – Main class demonstrating polymorphism, casting, and runtime type checking.

## 🚀 Key Concepts

### 🧠 Polymorphism

Using a superclass (`Animal`) reference to call overridden methods in subclasses (`Dog`, `Cat`):

```java
Animal dog = new Dog(); 
dog.makeSound(); // Output: Woof
