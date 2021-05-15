package console_ui;

import constats.AllVariables;

import static constats.AllAppConstants.startMessage;
import static constats.AllVariables.*;

public class Menu {

    public void mainMenu() {
        int choice;
        while (true) {
            choice = AllVariables.getAnswerFromUser.getAnswerFromMenu(startMessage, 6);
            switch (choice) {
                case 1:
                    menuCreate.createUserMenu();
                    break;
                case 2:
                    AllVariables.menuEdit.editMenu();
                    break;
                case 3:
                    menuUsersView.viewUsers();
                    break;
                case 4:
                    menuChangesSave.saveChanges();
                    break;
                case 5:
                    menuUserRemove.removeUser();
                    break;
                case 6:
                    return;
            }
        }
    }

    private void printStartMessage() {
        System.out.println(startMessage);
    }

}