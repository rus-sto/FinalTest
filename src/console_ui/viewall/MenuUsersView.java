package console_ui.viewall;

import bean.User;
import constats.AllVariables;

import java.util.List;

public class MenuUsersView {

    public void viewUsers() {
        List<User> userList = AllVariables.dataBaseService.getUsersDataBase();
        for (int i = 0; i < userList.size(); i++) {
            System.out.println(userList.get(i));
        }
    }
}
