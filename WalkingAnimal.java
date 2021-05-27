public interface WalkingAnimal extends Animal {
    default void move() {
        System.out.println("Walking");
    }
}