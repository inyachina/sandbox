import utils.Child;
import utils.Parent;

public class Main {

    public static void main(String[] args) {
        Parent child = new Child(1);
        test(child);
    }

    public static void test(Child c){
        System.out.println("child1");

    }
    public static  void test(Parent p){
        System.out.println("parent");
    }
}
