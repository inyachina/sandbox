package utils;

public class Parent {
    public Parent() {
        System.out.println("parent");
    }

    public Parent(int a) {
        System.out.println("parent");
    }

    @Override
    public int hashCode() {
        return 3;
    }
}
