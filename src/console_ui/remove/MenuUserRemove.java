package console_ui.remove;

import constats.AllVariables;

import static console_ui.Validator.isNumber;
import static constats.AllAppConstants.*;
import static constats.AllVariables.dataBaseService;
import static constats.AllVariables.getAnswerFromUser;

public class MenuUserRemove {

    public void removeUser() {
        int choice;
        while (true) {
            choice = getAnswerFromUser.getAnswerFromMenu(firstEditMessage, 2);
            switch (choice) {
                case 1:
                    inputIdMenuForRemove(removeIdMessage);
                    break;
                case 2:
                    return;
            }
        }
    }
    private void removeUserById(int id) {
        int choice;
        while (true) {
            choice = getAnswerFromUser.getAnswerFromMenu(validationRemoveMessage, 2);

            switch (choice) {
                case 1:
                    dataBaseService.removeUserFromDataBase(id);
                    System.out.println("User Id = " + id + " successfully removed");
                    break;
                case 2:
                    return;
            }
        }
    }
    private void inputIdMenuForRemove(String removeIdMessage) {
        String id = "";
        while (true) {
            System.out.println(removeIdMessage);
            if (AllVariables.scanner.hasNextLine()) {
                id = AllVariables.scanner.nextLine();
            }
            if (id.length() > 0 && isNumber(id)
                    && dataBaseService.hasDataBaseUserById(Integer.parseInt(id))) {
                System.out.println(dataBaseService.getUserFromDataBase(Integer.parseInt(id)));
                removeUserById(Integer.parseInt(id));
                return;
            } else {
                getAnswerFromUser.errorMenu("You do not Input correct ID Number, " +
                        "\npress 'Enter' to try again");
            }
        }
    }
}
