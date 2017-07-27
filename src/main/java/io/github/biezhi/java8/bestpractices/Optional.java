package io.github.biezhi.java8.bestpractices;

import io.github.biezhi.java8.model.Location;
import io.github.biezhi.java8.model.User;

/**
 * @author biezhi
 * @date 2017/7/27
 */
public class Optional {

    public static void main(String[] args) {
        String   name     = "jack";
        User     user     = getUser(name); // might return null
        Location location = null;
        if (user != null) {
            location = getLocation(user);
        }
    }

    private static Location getLocation(User user) {
        return null;
    }

    public static User getUser(String name) {
        return null;
    }
}
