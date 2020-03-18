package org.example;
import java.util.HashSet;
import java.util.Set;

public class SearchSet {
    public static void main(String[] args){
        Set<String> names = new HashSet<>();
        names.add("Bontle");
        names.add("Ari");
        names.add("Lucy");
        names.add("Payne");

        System.out.printf("The set has %d elements", names.size());

    }

}
