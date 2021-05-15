package console_ui.edit;

import constats.AllVariables;

import static constats.AllAppConstants.editUserMessage;
import static constats.AllVariables.*;

public class MenuUserEdit {

    public void editUserMenu(int id) {
        int choice;
        while (true) {
            choice = AllVariables.getAnswerFromUser.getAnswerFromMenu(editUserMessage, 6);
            switch (choice) {
                case 1:
                    menuNameEdit.editNameMenu(id);
                    break;
                case 2:
                    menuSurNameEdit.editSurNameMenu(id);
                    break;
                case 3:
                    menuEmailEdit.editEmailMenu(id);
                    break;
                case 4:
                    menuRoleEdit.editRoleMenu(id);
                    break;
                case 5:
                    menuMobilEdit.editMobilMenu(id);
                    break;
                case 6:
                    return;
            }
        }
    }

}
