package inheritance_homework;

public class Parent {
    void showMessage() {
        System.out.println("Hello Parent class");
    }
}

class Child extends Parent {
    @Override
    void showMessage() {
        super.showMessage();
        System.out.println("Hello Child class");
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.showMessage();
    }
}