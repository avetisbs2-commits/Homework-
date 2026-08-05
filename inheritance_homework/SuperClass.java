package inheritance_homework;

public class SuperClass {
     String message = "Hello SuperClass class";
}

class SubClass extends SuperClass{
     String message = "Hello SubClass class";

    void printString(){
        System.out.println(super.message);
        System.out.println(message);
    }

    public static void main(String[] args){
        SubClass subClass = new SubClass();
        subClass.printString();
    }
}