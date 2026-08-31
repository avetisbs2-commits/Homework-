package collectionsOperations;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapOperations {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A" , 1);
        map.put("B" , 2);
        map.put("C" , 3);
        map.put("D" , 4);
        System.out.println( copyValuesToList(map) );


        String sentence = "hello world hello java world";
        System.out.println(countWords(sentence));

        addContact("Alice", "555-1234");
        addContact("Bob", "555-5678");
        addContact("Charlie", "555-9012");

        System.out.println(getNumber("Alice"));


        System.out.println("All contacts:");
        showAll();
    }

    // 17. Copy Map Values into a List

    /**
     * Copies all the values from the given map into a new list.
     *
     * @param map the map whose values will be copied
     * @return a new ArrayList containing all the values from the map
     */
    public static ArrayList<Integer> copyValuesToList(HashMap<String, Integer> map){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> sList = new ArrayList<>();
        sList.addAll(map.keySet());

        for (int i = 0 ; i < map.size() ; i++ ){
            list.add(map.get(sList.get(i)));
        }
        return list;
    }

    // 18. Count how many times each word appears in a given sentence using HashMap.
    //     String sentence = "hello world hello java world";

    /**
     * Counts how many times each word appears in the given sentence.
     * Words are split on spaces; each unique word becomes a key, and its
     * value is the number of times it appears in the sentence.
     *
     * @param sentence the sentence to analyze
     * @return a map from each word to its number of occurrences
     */
    public static HashMap<String, Integer> countWords(String sentence) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] splited = sentence.split(" ");

        for (int i = 0; i < splited.length; i++) {
            if (map.containsKey(splited[i])) {
                map.put(splited[i], map.get(splited[i]) + 1);
            } else {
                map.put(splited[i], 1);
            }
        }
        return map;
    }

    // 19. Implement a phone book where names (keys) map to phone numbers (values).

    static HashMap<String, String> contacts = new HashMap<>();

    /**
     * Adds a new contact, or updates the number if the name already exists.
     *
     * @param name        the contact's name
     * @param phoneNumber the contact's phone number
     */
    public static void addContact (String name , String phoneNumber){
        contacts.put(name, phoneNumber);
    }

    /**
     * Looks up a contact's phone number by name.
     *
     * @param name the name to search for
     * @return the phone number if found, or a "not found" message otherwise
     */
    public static String getNumber(String name){
        if ( contacts.get(name) == null){
            return "Phone number aren't found";
        }else {
            return contacts.get(name);
        }
    }

    /**
     * Prints every contact in the phone book, one per line.
     */
    public static void showAll(){
        for (String name : contacts.keySet()){
            System.out.println(name + ": " + contacts.get(name));
        }
    }
}