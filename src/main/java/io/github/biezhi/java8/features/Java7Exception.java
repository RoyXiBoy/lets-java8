package io.github.biezhi.java8.features;

import java.io.*;
import java.lang.reflect.InvocationTargetException;

public class Java7Exception {

    public void tryWithResources() throws IOException {
        try (InputStream inputStream = new FileInputStream("/home/biezhi/a.txt")) {
            char charStr = (char) inputStream.read();
            System.out.print(charStr);
        }

        try (
                InputStream is = new FileInputStream("/home/biezhi/a.txt");
                OutputStream os = new FileOutputStream("/home/biezhi/b.txt")
        ) {
            char charStr = (char) is.read();
            os.write(charStr);
        }

    }

    public void catchMultipleException() {
        try {
            Thread.sleep(20000);
            FileInputStream fis = new FileInputStream("/a/b.txt");
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }

    public void reflectException(Object object) {
        try {
            Class<?> clazz = Class.forName("com.biezhi.apple.User");
            clazz.getMethods()[0].invoke(object);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Class<?> clazz = Class.forName("com.biezhi.apple.User");
            clazz.getMethods()[0].invoke(object);
        } catch (ReflectiveOperationException e){
            e.printStackTrace();
        }
    }

}
