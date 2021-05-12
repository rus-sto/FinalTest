package io;

import bean.Role;
import bean.User;
import bean.UserBuilderImpl;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserFileReader {
    public static final String FILE_PATH = "src\\resources\\testFile";

    public static List<User> readFromFile() {

        List<User> userBase = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String txtString;
            while ((txtString = reader.readLine()) != null) {
                User user = toObject(txtString);
                userBase.add(user);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return userBase;
    }

    private static User toObject(String txtString) {
        String[] userFilds = txtString.split(";");

        int id = Integer.parseInt(userFilds[0]);
        String name = userFilds[1];
        String sirName = userFilds[2];
        String email = userFilds[3];
        Role role1 = Role.valueOf(userFilds[4]);
        Role role2 = Role.valueOf(userFilds[5]);
        String mobil1 = userFilds[6];
        String mobil2 = userFilds[7];
        String mobil3 = userFilds[8];

        User user = new UserBuilderImpl()
                .setId(id)
                .setName(name)
                .setSirName(sirName)
                .setEmail(email)
                .setRole1(role1)
                .setRole2(role2)
                .setMobil1(mobil1)
                .setMobil2(mobil2)
                .setMobil3(mobil3)
                .build();
        return user;
    }

}

