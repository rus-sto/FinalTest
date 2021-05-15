package console_ui.edit;

import constats.AllVariables;

import static console_ui.Validator.isNumber;
import static constats.AllAppConstants.enterIdMessage;
import static constats.AllAppConstants.firstEditMessage;
import static constats.AllVariables.menuUserEdit;

public class MenuEdit {

    public void editMenu() {
        int choice;
        while (true) {
            choice = AllVariables.getAnswerFromUser.getAnswerFromMenu(firstEditMessage, 2);
            switch (choice) {
                case 1:
                    inputIdMenu(enterIdMessage);
                    break;
                case 2:
                    return;
            }
        }
    }

    private void inputIdMenu(String enterIdMessage) {
        String id = "";
        while (true) {
            System.out.println(enterIdMessage);
            if (AllVariables.scanner.hasNextLine()) {
                id = AllVariables.scanner.nextLine();
            }
            if (id.length() > 0 && isNumber(id)
                    && AllVariables.dataBaseService.hasDataBaseUserById(Integer.parseInt(id))) {
                System.out.println(AllVariables.dataBaseService.getUserFromDataBase(Integer.parseInt(id)));
                menuUserEdit.editUserMenu(Integer.parseInt(id));
                return;
            } else {
                AllVariables.getAnswerFromUser.errorMenu("You do not Input correct ID Number, " +
                        "\npress 'Enter' to try again");
            }
        }
    }
}
