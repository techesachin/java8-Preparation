package com.techiesachin.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LazyEvaluationDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anna", "bob", "Charlie", "David");
        Stream<String> stream = names.stream()
                .filter(name -> {
                    System.out.println("filtering" + name);
                    return name.length() > 3;
                });
        System.out.println("Before terminal Operation");
        Set<String> result = stream.collect(Collectors.toSet());
        System.out.println("After terminal Operation");

        System.out.println(result);

    }
}
