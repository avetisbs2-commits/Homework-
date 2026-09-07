package enumeration_homework;

public class CoffeeTest {
    public static void main(String[] args) {
        for (CoffeeSize size : CoffeeSize.values()) {
            System.out.println("Size: " + size.name() + " | Ordinal: " + size.ordinal());
        }
    }
}