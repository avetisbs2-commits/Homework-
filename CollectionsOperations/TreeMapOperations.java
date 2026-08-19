package CollectionsOperations;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 21. Create a TreeMap<String, Double> where the key is a student’s name
        //     and the value is their average grade.

        TreeMap<String, Double> tMap = new TreeMap<>();

        tMap.put("Armen", 7.1);
        tMap.put("Vahag", 6.3);
        tMap.put("Davit", 8.0);
        tMap.put("Levon", 8.5);
        tMap.put("Narek", 10.0);

        System.out.println(tMap);

        double highest = 0.0;
        for (double grade : tMap.values()) {
            if (grade > highest) {
                highest = grade;
            }
        }

        System.out.println("The highest grade: " + highest);


        // 22. Use a TreeMap<String, String> to store country names as keys and their capitals as values.
        TreeMap<String, String> countries = new TreeMap<>();

        countries.put("Armenia", "Yerevan");
        countries.put("Denmark", "Copenhagen");
        countries.put("France", "Paris");
        countries.put("Turkey", "Ankara");
        countries.put("England", "London");
        countries.put("Italy", "Rome");
        countries.put("Brazil", "Brasilia");
        countries.put("Portugal", "Lisbon");

        String key = scanner.nextLine();

        if (countries.containsKey(key)) {
            System.out.println(key + "'s capital: " + countries.get(key));
        } else {
            System.out.println("Country not found");
        }


        // 23. Create a TreeMap<String, Integer> to store product names and their prices.
        TreeMap<String, Integer> products = new TreeMap<>();

        products.put("Laptop", 1000);
        products.put("Phone", 600);
        products.put("Headphones", 40);
        products.put("Keyboard", 10);
        products.put("Mouse", 10);
        products.put("Monitor", 300);

        for (String name : products.keySet()) {
            int newPrice = (int) (products.get(name) * 1.1);
            products.put(name, newPrice);
        }

        for (String name : products.keySet()) {
            System.out.println(name + ": " + products.get(name));
        }

    }
}