// Write a common example of hashMap

import java.util.HashMap;

public class Example {
    public static void main(String[] args) {

        HashMap<String,Integer> names = new HashMap<>();

        String name[] = {"Hager","Hadeer","Ahmed","Amged","Mohamed", "Ahmed"};

        // For-each
        for(String s: name) {
            Integer value = names.get(s);

            names.put(s,(value == null) ? 1 : value+1);
        }

        System.out.println("Size of list : " + names.size());
        System.out.println(names);
    }
}