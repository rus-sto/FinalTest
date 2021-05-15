package console_ui.create;

import bean.UserBuilder;
import bean.UserBuilderImpl;
import console_ui.GetAnswerFromUser;
import constats.AllVariables;

import java.util.Scanner;

import static console_ui.Validator.isLetter;
import static constats.AllAppConstants.createNameMessage;
import static constats.AllVariables.userBuilder;

public class MenuNameCreate {

    public void createNameMenu() {
        String answer = "";
        while (true) {
            System.out.println(createNameMessage);
            if (AllVariables.scanner.hasNextLine()) {
                answer = AllVariables.scanner.nextLine();
            }
            if (answer.length() > 0 && isLetter(answer)) {
                userBuilder.setName(answer);
                return;
            } else {
                AllVariables.getAnswerFromUser.errorMenu("You do not Input the Name, press 'Enter' to continue try again");
            }
        }
    }
}
