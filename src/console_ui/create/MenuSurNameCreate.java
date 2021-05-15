package console_ui.create;

import constats.AllVariables;

import static console_ui.Validator.isLetter;
import static constats.AllAppConstants.createSurNameMessage;

public class MenuSurNameCreate {

    public void createSurNameMenu() {
        String answer = "";
        while (true) {
            System.out.println(createSurNameMessage);
            if (AllVariables.scanner.hasNextLine()) {
                answer = AllVariables.scanner.nextLine();
            }
            if (answer.length() > 0 && isLetter(answer)) {
                AllVariables.userBuilder.setSirName(answer);
                return;
            } else {
                AllVariables.getAnswerFromUser.errorMenu("You do not Input the surName, press 'Enter' to continue try again");
            }
        }
    }
}
