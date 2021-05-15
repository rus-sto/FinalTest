package console_ui.edit;

import constats.AllVariables;

import static console_ui.Validator.isLetter;
import static constats.AllAppConstants.createNameMessage;
import static constats.AllVariables.dataBaseService;
import static constats.AllVariables.getAnswerFromUser;

public class MenuSurNameEdit {

    public void editSurNameMenu(int id) {
        String answer = "";
        while (true) {
            System.out.println(createNameMessage);
            if (AllVariables.scanner.hasNextLine()) {
                answer = AllVariables.scanner.nextLine();
            }
            if (answer.length() > 0 && isLetter(answer)) {
                dataBaseService.getUserFromDataBase(id).setSirName(answer);
                return;
            } else {
                getAnswerFromUser.errorMenu("You do not Input the SurName, press 'Enter' to try again");
            }
        }
    }
}
