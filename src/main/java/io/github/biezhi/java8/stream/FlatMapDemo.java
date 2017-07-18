package io.github.biezhi.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by biezhi on 2017/7/18.
 */
public class FlatMapDemo {

    public static void main(String[] args) {
        List<List<String>> lists = new ArrayList<>();
        lists.add(Arrays.asList("apple", "click"));
        lists.add(Arrays.asList("boss", "dig", "qq", "vivo"));
        lists.add(Arrays.asList("c#", "biezhi"));

        lists.stream()
                .flatMap(Collection::stream)
                .filter(str -> str.length() > 2)
                .count();
    }
}
