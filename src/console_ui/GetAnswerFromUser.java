package console_ui;

import constats.AllVariables;

import static console_ui.Validator.isNumber;

public class GetAnswerFromUser {

    public int getAnswerFromMenu(String message, int menuSize) {
        String answer;
        int result;
        while (true) {
            System.out.println(message);
            if (AllVariables.scanner.hasNextLine()) {
                answer = AllVariables.scanner.nextLine();
                if (isNumber(answer)) {
                    result = Integer.parseInt(answer);
                    if (result <= menuSize && result > 0) {
                        return result;
                    } else {
                        errorMenu("Please input digits from 1 to "
                                + menuSize + "\npress any key to continue");

                    }
                } else {
                    errorMenu("Please input only digits "
                            + "\npress any key to continue");
                }
            }
        }
    }

    public void errorMenu(String errorMessage) {
        System.out.println(errorMessage);
        AllVariables.scanner.nextLine();
    }

}
