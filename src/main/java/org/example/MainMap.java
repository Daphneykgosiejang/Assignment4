package org.example;
import java.util.Map;
import java.util.HashMap;

public class MainMap {
    public static void main(String args[]){
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(100,"Ari");
        map.put(101,"Payne");
        map.put(102,"Bontle");
        map.put(103, "Lucy");

        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
