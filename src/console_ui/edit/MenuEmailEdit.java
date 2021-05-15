package console_ui.edit;

import constats.AllVariables;

import static console_ui.Validator.isEmail;
import static constats.AllAppConstants.createNameMessage;

public class MenuEmailEdit {

    public void editEmailMenu(int id) {
        String answer = "";
        while (true) {
            System.out.println(createNameMessage);
            if (AllVariables.scanner.hasNextLine()) {
                answer = AllVariables.scanner.nextLine();
            }
            if (answer.length() > 0 && isEmail(answer)) {
                AllVariables.dataBaseService.getUserFromDataBase(id).setEmail(answer);
                return;
            } else {
                AllVariables.getAnswerFromUser.errorMenu("You do not Input the Email, press 'Enter' to try again");
            }
        }
    }
}
