package console_ui.edit;

import constats.AllVariables;

import static console_ui.Validator.isLetter;
import static constats.AllAppConstants.createNameMessage;

public class MenuNameEdit {

    public void editNameMenu(int id) {
        String answer = "";
        while (true) {
            System.out.println(createNameMessage);
            if (AllVariables.scanner.hasNextLine()) {
                answer = AllVariables.scanner.nextLine();
            }
            if (answer.length() > 0 && isLetter(answer)) {
                AllVariables.dataBaseService.getUserFromDataBase(id).setName(answer);
                return;
            } else {
                AllVariables.getAnswerFromUser.errorMenu("You do not Input the Name, press 'Enter' to try again");
            }
        }
    }
}
