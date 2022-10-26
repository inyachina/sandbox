package utils;

public class Child extends Parent {
    public Child(){
        System.out.println("child");
    }
    public Child(int i){
        super(i);
        System.out.println("child");
    }
}
