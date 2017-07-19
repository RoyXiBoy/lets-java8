package io.github.biezhi.java8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by biezhi on 2017/7/18.
 */
public class CollectDemo {

    public static void main(String[] args) {
        Property p1 = new Property("叫了个鸡", 1000, 500, 2);
        Property p2 = new Property("张三丰饺子馆", 2300, 1500, 3);
        Property p3 = new Property("永和大王", 580, 3000, 1);
        Property p4 = new Property("肯德基", 6000, 200, 4);

        List<Property> properties = Arrays.asList(p1, p2, p3, p4);

        properties.stream()
                .sorted(Comparator.comparingInt(x -> x.distance))
                .limit(2)
                .collect(Collectors.toList());

        properties.stream()
                .map(p -> p.name)
                .collect(Collectors.toList());

        Map<String, Integer> map = properties.stream()
                .collect(Collectors.toMap(Property::getName, Property::getPriceLevel));


        Map<Integer, List<Property>> priceMap = properties.stream()
                .collect(Collectors.groupingBy(Property::getPriceLevel));

        properties.stream()
                .filter(p -> p.priceLevel < 4)
                .sorted(Comparator.comparingInt(Property::getDistance))
                .map(Property::getName)
                .limit(2)
                .collect(Collectors.toList());
    }

}
