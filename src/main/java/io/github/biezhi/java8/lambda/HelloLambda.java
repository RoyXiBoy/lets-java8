package io.github.biezhi.java8.lambda;

/**
 * 第一个Lambda表达式程序
 * <p>
 *
 * @see Runnable
 * Created by biezhi on 2017/7/17.
 */
public class HelloLambda {

    public static void main(String[] args) {

        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("do something.");
            }
        };

        // 使用lambda表达式创建一个Runnable对象
        Runnable runnable = () -> System.out.println("Hello::" + Thread.currentThread());
        new Thread(runnable).start();
    }

}
