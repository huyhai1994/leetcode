package generic.back_to_generic;

import java.util.Arrays;
import java.util.List;

public class TestGenerics1 {
    public static void main(String[] args) {
//        List<Animal> animals = Arrays.asList(new Dog(), new Cat(), new Dog());
        List<Dog> dogs = Arrays.asList(new Dog(), new Dog());
        takeAnimals(dogs);

    }

    private static void takeAnimals(List<? extends Animal> animals) {
        for (Animal a : animals) {
            a.eat();
        }
    }

}
