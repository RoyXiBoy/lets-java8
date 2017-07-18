package io.github.biezhi.java8.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by biezhi on 2017/7/18.
 */
public class TakeOutDemo {

    public static void main(String[] args) {
        Property p1 = new Property("叫了个鸡", 1000, 500, 2);
        Property p2 = new Property("张三丰饺子馆", 2300, 1500, 3);
        Property p3 = new Property("永和大王", 580, 3000, 1);
        Property p4 = new Property("肯德基", 6000, 200, 4);

        List<Property> properties = Arrays.asList(p1, p2, p3, p4);

        Collections.sort(properties, (x, y) -> x.distance.compareTo(y.distance));

        String name = properties.get(0).name;
        System.out.println("距离我最近的店铺是:" + name);

        /// Stream操作
        String name2 = properties.stream()
                .sorted(Comparator.comparingInt(x -> x.distance))
                .findFirst()
                .get()
                .name;

        int count = 0;
        for (Property property : properties) {
            if (property.sales > 1000) {
                count++;
            }
        }

        Iterator<Property> iterator = properties.iterator();
        while (iterator.hasNext()) {
            Property property = iterator.next();
            if (property.sales > 1000) {
                count++;
            }
        }

        long count2 = properties.stream()
                .filter(p -> p.sales > 1000)
                .count();

        try {
           String content = Files.readAllLines(Paths.get("/home/biezhi/a.txt")).stream()
            .collect(Collectors.joining("\n"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        properties.stream()
                .filter(p -> p.distance < 1000);

        properties.stream()
                .filter(p -> p.name.length() > 5);

        properties.stream()
                .map(p -> p.name);
    }
}
