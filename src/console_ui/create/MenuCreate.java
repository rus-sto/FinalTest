package console_ui.create;

import bean.UserBuilder;
import bean.UserBuilderImpl;
import constats.AllVariables;

import static constats.AllAppConstants.createUserMessage;
import static constats.AllVariables.*;

public class MenuCreate {
    private UserBuilder userBuilder;

    public void createUserMenu() {
        int choice;
        userBuilder = new UserBuilderImpl();
        while (true) {
            choice = AllVariables.getAnswerFromUser.getAnswerFromMenu(createUserMessage, 7);
            switch (choice) {
                case 1:
                    menuNameCreate.createNameMenu();
                    break;
                case 2:
                    menuSurNameCreate.createSurNameMenu();
                    break;
                case 3:
                    menuEmailCreate.createEmailMenu();
                    break;
                case 4:
                    menuRoleCreate.createRoleMenu();
                    break;
                case 5:
                    menuMobilCreate.createMobilMenu();
                    break;
                case 6:
                    dataBaseAddingTheUser.addUserToDataBase();
                    break;
                case 7:
                    return;
            }
        }
    }
}
