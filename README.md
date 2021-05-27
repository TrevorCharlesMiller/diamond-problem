# Diamond Problem

A simple demonstration of the diamond problem using Java 8 interfaces with default methods. 

Attempting to compile Duck.java results in the following compiler error
```
diamond-problem > javac Duck.java 
Duck.java:1: error: class Duck inherits unrelated defaults for move() from types SwimmingAnimal and WalkingAnimal
public class Duck implements SwimmingAnimal, WalkingAnimal {
       ^
1 error

```