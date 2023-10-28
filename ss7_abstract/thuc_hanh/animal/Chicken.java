package ss7_abstract.thuc_hanh.animal;

public class Chicken extends Animal implements IEdible{

    @Override
    public String makeSound() {
        return "Chicken: o ó o";
    }

    @Override
    public String howToEat() {
        return null;
    }
}
