package bounds_homework;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GenericUtils.printNum(14);
        GenericUtils.printNum(14.14);
        GenericUtils.printNum(14L);


        Integer [] numbers = {1,5,10,20};
        Double [] prices = {10.5,20.5,5.0};
        System.out.println(GenericUtils.sum(numbers));
        System.out.println(GenericUtils.sum(prices));


        List<Integer> integerList = new ArrayList<>();
        List<Number> numberList = new ArrayList<>();
        List<Object> objectList = new ArrayList<>();

        GenericUtils.addNumbers(integerList);
        GenericUtils.addNumbers(numberList);
        GenericUtils.addNumbers(objectList);

        System.out.println(integerList);
        System.out.println(numberList);
        System.out.println(objectList);


        List<Integer> integers = List.of(2 ,1 ,3);
        List<String> names = List.of("Avetis" , "Karen");
        List<Double> doubles = List.of(2.3 ,1.3 ,3.3);

        GenericUtils.printList(integers);
        GenericUtils.printList(names);
        GenericUtils.printList(doubles);

    }
}
