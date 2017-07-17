package io.github.biezhi.java8.lambda;

/**
 * 第一个Lambda表达式程序
 * <p>
 * Created by biezhi on 2017/7/17.
 */
public class HelloLambda {

    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Hello::" + Thread.currentThread());
        new Thread(runnable).start();
    }

}
