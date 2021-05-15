package console_ui.save;

import bean.User;
import constats.AllVariables;
import io.UserFileWriter;

import java.util.List;

public class MenuChangesSave {

    public void saveChanges() {
        List<User> users = AllVariables.dataBaseService.getUsersDataBase();
        UserFileWriter.writeToFile(users);
    }
}
