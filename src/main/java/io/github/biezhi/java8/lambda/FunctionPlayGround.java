package io.github.biezhi.java8.lambda;

import java.util.function.*;
import java.util.stream.IntStream;

/**
 * Created by biezhi on 2017/7/17.
 */
public class FunctionPlayGround {

    public static Integer function(String str, Function<String, Integer> function) {
        return function.apply(str);
    }

    public static Long bitFunction(String s1, String s2, BiFunction<String, String, Long> biFunction) {
        return biFunction.apply(s1, s2);
    }

    public static String intFunction(int val, IntFunction<String> intFunction) {
        return intFunction.apply(val);
    }

    public static int toIntBiFunction(String t, Integer u, ToIntBiFunction<String, Integer> toIntBiFunction) {
        return toIntBiFunction.applyAsInt(t, u);
    }

    public static double supplier(Supplier<Double> supplier) {
        return supplier.get();
    }

    public static int intSupplier(IntSupplier intSupplier) {
        return intSupplier.getAsInt();
    }

    public static void consumer(String data, Consumer<String> consumer) {
        consumer.accept(data);
    }

    public static Long unaryOperator(Long t, UnaryOperator<Long> unaryOperator) {
        return unaryOperator.apply(t);
    }

    public static void main(String[] args) {
        Integer intVal = function("28", x -> Integer.parseInt(x));
        System.out.println(intVal);

        long result = bitFunction("2", "3", (s1, s2) -> Long.parseLong(s1) * Long.parseLong(s2));
        System.out.println(result);

        String s = intFunction(244, value -> value + "");
        System.out.println(s);

        int i = toIntBiFunction("a", 10, (t, u) -> {
            if ("a".equals(t)) {
                return u;
            }
            return u * 2;
        });
        System.out.println(i);

        double d = supplier(() -> 29.4D);
        System.out.println(d);

        int i2 = intSupplier(() -> 39);
        System.out.println(i2);

        consumer("jack", name -> System.out.println(name.toUpperCase()));

        long ll = unaryOperator(29L, val -> val);
        System.out.println(ll);

        IntStream c = IntStream.rangeClosed(5, 10); // [1, 2, 3, 4, 5]
        c.forEach(action -> System.out.print(action + ","));

    }
}
