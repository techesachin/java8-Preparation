package com.techiesachin.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {
        //feature introduced in java 8
        //process collections of data in `functional and declarative manner.`
        //simplify the data processing
        //Embrace functional programing
        //improve Readability and Maintainability
        //Enable Easy Parallelism

        // how to Use Stream--->Source intermediate operation, terminal operation
        // What is Stream ---> A sequence of elements supporting functional and declarative manner programing.


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> stream = numbers.stream();
        int count = 0;
        for (int i : numbers) {
            if (i % 2 ==0){
                count++;
            }
        }
        System.out.println(count);
        System.out.println(numbers.stream().filter(x -> x % 2 ==0).count());

        // creating stream.
        // from collection.
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Stream<Integer> stream1 = list.stream();
        //from Array.
        String[] array = {"a","b","c","d"};
        Stream<String> stream2 = Arrays.stream(array);
        //using stream.of
        Stream<String> array1 = Stream.of(array);
        //infinite stream.
        Stream<Integer> generate = Stream.generate(() -> 1);
        Stream.iterate(1, x -> x +1).limit(100);


    }
}
