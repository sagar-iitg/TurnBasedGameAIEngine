package com.sagar;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        ans.add(2);
        ans.add(3);

        // Convert the list to an array
        Integer[] array = ans.toArray(new Integer[4]);
        //System.out.println(array);

        // Print the elements of the array
        for (Integer element : array) {
            System.out.println(element);
        }
    }
}
