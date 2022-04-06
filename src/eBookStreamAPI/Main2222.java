package eBookStreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Main2222 {
    public static void main(String[] args) {


        TreeSet<Integer> treeSet = new TreeSet<>(method());
       // System.out.println(treeSet);
        method().stream().sorted((x2 , x3)-> x2.compareTo(x3)).forEach(System.out::println);


    }
    public static List<Integer> method(){
        return List.of(4,6,7,8,9,8,7,6,5,423,23,22,13,5,678,88,0);
    }
}
