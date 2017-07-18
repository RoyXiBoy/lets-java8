package io.github.biezhi.java8.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by biezhi on 2017/7/18.
 */
public class DefaultFunctionDemo {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 7, 3, 1, 8, 6, 4);
        list.sort(Comparator.naturalOrder());
        System.out.println(list);
    }

}
