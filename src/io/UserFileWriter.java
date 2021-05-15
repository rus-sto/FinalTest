package io;

import bean.User;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class UserFileWriter {
    public static final String DELIMITER = ";";

    public static String userToString(User user) {
        return user.getId() + DELIMITER
                + user.getName() + DELIMITER
                + user.getSirName() + DELIMITER
                + user.getEmail() + DELIMITER
                + user.getRole1() + DELIMITER
                + user.getRole2() + DELIMITER
                + user.getMobil1() + DELIMITER
                + user.getMobil2() + DELIMITER
                + user.getMobil3() + "\n";
    }

    public static void writeToFile(List<User> usersList) {
        try (FileWriter writer = new FileWriter("src\\resources\\testFile")) {
            for (User ul : usersList) {
                writer.write(UserFileWriter.userToString(ul));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
