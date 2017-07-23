package io.github.biezhi.java8.features;

import java.util.Optional;

public class OptionalDemo {

    static class User {
        String name;

        public String getName() {
            return name;
        }
    }

    public static String getUserName(User user) {
        return user.getName();
    }

    public static String getUserNameByOptional(User user) {
        Optional<String> userName = Optional.ofNullable(user).map(User::getName);
        return userName.orElse(null);
    }

    public static void main(String[] args) {
        User user = new User();
        user.name = "hello";
        String name = getUserNameByOptional(user);
        System.out.println(name);
        System.out.println(getUserNameByOptional(null));

        Optional<User> emptyUser = Optional.empty();

        Optional<User> userOptional = Optional.of(user);

        Optional<User> ofNullOptional = Optional.ofNullable(user);
        Optional<String> userName = ofNullOptional.map(User::getName);
    }

}
