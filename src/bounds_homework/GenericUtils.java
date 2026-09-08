package bounds_homework;

import java.util.List;

public class GenericUtils {
    public static <T extends Number> void printNum(T num){
        System.out.println(num);
    }

    public static <T extends Number> double sum(T [] numbers){
        double sum = 0.0;
        for (T number :  numbers){
            sum = sum + number.doubleValue();
        }
        return sum;
    }

    public static void addNumbers(List<? super Integer> list){
        list.add(12);
        list.add(11);
        list.add(13);
    }

    public static void printList(List<?> list){
        for (Object o : list){
            System.out.println(o);
        }
    }
}
