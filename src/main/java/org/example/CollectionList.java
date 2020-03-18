package org.example;
import java.util.ArrayList;
import java.util.Collections;


public class CollectionList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Bontle");
        names.add("Ari");
        names.add("Lucy");
        names.add("Payne");
        Collections.sort(names);

        for (String str : names) {
            System.out.println(str);
        }
    }
}

