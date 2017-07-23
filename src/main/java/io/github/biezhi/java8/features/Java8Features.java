package io.github.biezhi.java8.features;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;
import java.util.stream.Stream;

public class Java8Features {

    @Repeatable(Basics.class)
    @interface Basic {
        String name();
    }

    @Retention(RetentionPolicy.RUNTIME)
    @interface Basics {
        Basic[] value();
    }

    @Basic(name = "fix")
    @Basic(name = "todo")
    class Person {}

    public static void main(String[] args) {
        String str = String.join(",", "a", "b", "c");
        System.out.println(str);

        Basic[] basics = Person.class.getAnnotationsByType(Basic.class);
        Stream.of(basics).forEach(b -> System.out.print(b.name() + ' '));

        Stream.of("a", "c", null, "d")
                .filter(Objects::nonNull)
                .forEach(System.out::println);

    }
}
