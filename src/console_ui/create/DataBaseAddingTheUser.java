package console_ui.create;

import bean.User;
import bean.UserBuilder;
import bean.UserBuilderImpl;
import constats.AllVariables;
import service.DataBaseService;

public class DataBaseAddingTheUser {

    public void addUserToDataBase() {
        User user = AllVariables.userBuilder.build();
        AllVariables.dataBaseService.addToDataBase(user);
        System.out.println("User saved successfully");
    }
}
