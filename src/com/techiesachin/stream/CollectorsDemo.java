package com.techiesachin.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsDemo {
    public static void main(String[] args) {
        //Collectors is a utility class
        //provided a set of method to create common Collectors.
        List<String> names = Arrays.asList("Anna", "bob", "Charlie", "David");
        List<String> res = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(res);

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9,2,4,6,8);
        Set<Integer> set = nums.stream().collect(Collectors.toSet());
        System.out.println(set
        );
    }
}
