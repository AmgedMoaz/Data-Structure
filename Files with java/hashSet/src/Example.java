// Write a common example about hashSet concept

import java.util.HashSet;
import java.util.Set;

public class Example {
    public static void main(String[] args) {

     Set<Integer> s1 = new HashSet<>();
     Set<Integer> s2 = new HashSet<>();

     int numbers[] = {1,2,3,4,5,1,2,6,7,8,5,10,10,1};

        for(int i = 0 ; i < numbers.length ; i++) {
            // شرط حل المسألة
            if(!(s1.add(numbers[i])))
                s2.add(numbers[i]);
        }

        System.out.println("S1 list : " + s1);
        System.out.println("S2 list : " + s2);

        s1.removeAll(s2);
        System.out.println("S1 list : " + s1);
        System.out.println("S2 list : " + s2);

    }
}