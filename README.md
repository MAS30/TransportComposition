# Transport Composition Example

This project demonstrates **Composition** — a key object-oriented design concept that favors *has-a* relationships over inheritance.

## Description
- `Transport` has two components:
  - An **Engine** (e.g., Combustion or Electric)
  - A **Driver** (e.g., Human or Robot)
- Each component is defined via an interface, promoting flexibility.

## Classes Implemented
- **Engines:** `CombustionEngine`, `ElectricEngine`
- **Drivers:** `Human`, `Robot`
- **Transport:** Combines both to perform delivery

## How to Run
You can test this project online using [Programiz Java Compiler](https://www.programiz.com/java-programming/online-compiler).
Just copy all `.java` files and run `Main.java`.

## Clean Code Principles
- Composition over inheritance  
- Dependency injection  
- Open/Closed Principle  
- Clear naming and structure
