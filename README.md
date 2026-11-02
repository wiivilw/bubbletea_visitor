# Bubble Tea Ingredient Analysis System

## Project Description

This is a simple Java project about a Bubble Tea Ingredient Analysis System. The main idea is to use the Visitor design pattern to work with different bubble tea ingredients.

The program can calculate the total calories and the total cost of the ingredients. These operations are performed by separate Visitor classes, so we do not need to add calculation methods to every ingredient class.

## Design Pattern

This project uses the **Visitor Design Pattern**, which is a behavioral design pattern.

The main purpose of this pattern is to add new operations to existing classes without changing their code.

In our project, there are two main operations:

- **NutritionVisitor** – calculates the calories of each ingredient and the total number of calories.
- **CostVisitor** – calculates the cost of each ingredient and the total cost of the order.

## Project Structure

```text
src/
├── elements/
│   ├── Ingredient.java
│   ├── Milk.java
│   ├── Tapioca.java
│   ├── TeaBase.java
│   └── FruitJelly.java
│
├── visitors/
│   ├── IngredientVisitor.java
│   ├── NutritionVisitor.java
│   └── CostVisitor.java
│
├── order/
│   └── BubbleTeaOrder.java
│
└── Main.java
```

## Main Components

- **Ingredient** – the main Element interface. It declares the `accept()` method.
- **Milk, Tapioca, TeaBase, FruitJelly** – concrete ingredient classes. Each class implements the `accept()` method.
- **IngredientVisitor** – the Visitor interface. It declares a separate visit method for every ingredient.
- **NutritionVisitor** – handles calorie calculations.
- **CostVisitor** – handles cost calculations.
- **BubbleTeaOrder** – stores the ingredients and allows visitors to go through them.
- **Main** – creates the ingredients, builds an order and runs both visitors.

## How Double Dispatch Works

Double Dispatch is an important part of the Visitor pattern.

In our project, every ingredient has an `accept()` method. When a visitor is passed to this method, the ingredient calls the correct visit method.

For example:

```java
public String accept(IngredientVisitor visitor) {
    return visitor.visitMilk(this);
}
```

This means that the Milk class calls `visitMilk()` on the visitor.

Each ingredient calls its own matching method. Because of this, we do not need to use `instanceof`, `if`, or `switch` to check the ingredient type.

## Clean Code Principles

The project follows several Clean Code principles:

1. **Meaningful Names** – class and method names clearly describe their purpose.
2. **Single Responsibility Principle** – each visitor is responsible for only one operation.
3. **Encapsulation** – ingredient fields are private, and getters are used to access their values.
4. **No Type Checking** – the project uses Double Dispatch instead of manual type checking.
5. **Open/Closed Principle** – we can add a new visitor and a new operation without changing the existing ingredient classes.

## How to Run the Project

1. Open the project in IntelliJ IDEA.
2. Check that all files are in the correct packages.
3. Open `src/Main.java`.
4. Run the `main()` method.

## Program Output

After running the program, two reports are displayed:

- **Nutrition Report** – shows the calories of each ingredient and the total calories.
- **Cost Report** – shows the cost of each ingredient and the total cost in KZT.

## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Visitor Design Pattern