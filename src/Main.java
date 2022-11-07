import utils.Dog;
import utils.Sex;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog(1, "Sharik", Sex.MALE);
        System.out.println(dog.getSex().getTitle());
    }
}