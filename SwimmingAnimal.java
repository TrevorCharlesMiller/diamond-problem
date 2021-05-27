public interface SwimmingAnimal extends Animal {
    default void move() {
        System.out.println("Swimming");
    }
}