package lambda_expression;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Greeting g = () -> System.out.println("Hello, World!");
        g.sayHello();

        Calculator c = (a ,b) -> a + b;
        c.calculate(5 , 10);

        NumberChecker n = (number ) -> number % 2 == 0;
        System.out.println( n.check(15) );
        System.out.println( n.check(10) );

        StringConverter s = (text ) -> text.toUpperCase();
        System.out.println(s.stringConverter("hello") );
        System.out.println(s.stringConverter("java") );

        NumberComparator nC = (a, b ) -> Math.max(a, b);
        System.out.println(nC.compare(10 ,12));
        System.out.println(nC.compare(15 ,12));

        List <Integer> integers = Arrays.asList(1,5,10,20,30);
        integers.forEach(var -> System.out.println(var));

        List <Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
        numbers.forEach(num -> {
            if ( num % 2 == 0) {
                System.out.println(num);
            }
        });

        List <String> names = Arrays.asList("anna","john","bob","mike");
        names.forEach( name -> {
            name = name.toString().toUpperCase();
         System.out.println(name);
        });

        List <Integer> numbers2 = Arrays.asList(1,5,2,20,3);
        numbers2.sort(Comparator.naturalOrder());
                System.out.println(numbers2);

        List<String> names2 = new ArrayList<>(Arrays.asList(
                "Anna",
                "Bob",
                "Alexander",
                "John",
                "Andrew"
        ));

        names2.removeIf(name -> name.length() < 5);
        System.out.println(names2);
        }
    }