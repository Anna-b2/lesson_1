package ArrayOfWords;

import java.util.*;

public class ArrayOfWords {
    public static void main(String[] args){
        List<String> fruits = Arrays.asList(
                "Mercedes", "BMW", "Audi", "Toyota", "Reno",
                "Opel", "Subaru", "Range Rover", "Toyota", "Reno",
                "BMW", "Audi", "Toyota", "Lada", "Subaru",
                "Audi", "Toyota", "Subaru", "Subaru", "Lada"
        );

        Set<String> unique = new HashSet<>(fruits);

        System.out.println("Initial array :");
        System.out.println(fruits);
        System.out.println();
        System.out.println("Unique words :");
        System.out.println(unique);
        System.out.println();
        System.out.println("The words are repeated :");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(fruits, key));
        }
    }
}
