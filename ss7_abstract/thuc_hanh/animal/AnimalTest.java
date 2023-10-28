package ss7_abstract.thuc_hanh.animal;

public class AnimalTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                IEdible iedible = (Chicken) animal;
                System.out.println(iedible.howToEat());
            }
        }
        Fruit[] fruit = new Fruit[2];
        fruit[0] = new Apple();
        fruit[1] = new Orange();
        for (Fruit fruit1 : fruit) {
            System.out.println(fruit1.howToEat());
        }
    }
}
