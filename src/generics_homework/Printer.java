package generics_homework;

public class Printer {
    public static <T> void print(T value){
        System.out.println(value);
    }

    public static <T> void printArray(T [] array){
        for (T t : array){
            System.out.print(t + " ");
        }
        System.out.println();
    }
}
