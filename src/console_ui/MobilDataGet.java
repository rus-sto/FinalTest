package console_ui;

import constats.AllVariables;

import static console_ui.Validator.isPhone;

public class MobilDataGet {

    public String getMobileData() {
        String answer = "";
        while (true) {
            System.out.println("Input Mobil Number like +375xxxxxxxxx");
            if (AllVariables.scanner.hasNextLine()) {
                answer = AllVariables.scanner.nextLine();
            }
            if (answer.length() > 0 && isPhone(answer)) {
                return answer;
            } else {
                AllVariables.getAnswerFromUser.errorMenu("You do not Input the Mobil Number, " +
                        "\npress 'Enter' to try again");
            }
        }
    }
}
