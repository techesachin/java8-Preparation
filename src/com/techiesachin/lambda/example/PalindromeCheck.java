package com.techiesachin.lambda.example;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PalindromeCheck {
    public static void main(String[] args) {
        String input = "ababcd";

        // Step 1: Count occurrences of each character using Streams
        Map<Character, Long> charCountMap = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("Character Occurrences: " + charCountMap);

        // Step 2: Check if it can be rearranged into a palindrome
        long oddCount = charCountMap.values().stream()
                .filter(count -> count % 2 != 0)
                .count();

        if (oddCount > 1) {
            System.out.println("The string cannot be rearranged into a palindrome.");
        } else {
            System.out.println("The string can be rearranged into a palindrome.");
          //  return "The string can be rearranged into a palindrome.";
        }

    }
}

