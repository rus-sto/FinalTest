package console_ui.create;

import bean.UserBuilder;
import bean.UserBuilderImpl;
import console_ui.GetAnswerFromUser;
import constats.AllVariables;

import java.util.Scanner;

import static console_ui.Validator.isEmail;
import static constats.AllAppConstants.createEmailMessage;

public class MenuEmailCreate {

    public void createEmailMenu() {
        String answer = "";
        while (true) {
            System.out.println(createEmailMessage);
            if (AllVariables.scanner.hasNextLine()) {
                answer = AllVariables.scanner.nextLine();
            }
            if (answer.length() > 0 && isEmail(answer)) {
                AllVariables.userBuilder.setEmail(answer);
                return;
            } else {
                AllVariables.getAnswerFromUser.errorMenu("You do not Input the Email, press 'Enter' to continue try again");
            }
        }
    }
}
