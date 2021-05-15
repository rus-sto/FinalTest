package console_ui.create;

import constats.AllVariables;

import static constats.AllAppConstants.createMobilMessage;
import static constats.AllVariables.mobilDataGet;

public class MenuMobilCreate {

    public void createMobilMenu() {

        int choice;
        while (true) {
            choice = AllVariables.getAnswerFromUser.getAnswerFromMenu(createMobilMessage, 4);
            switch (choice) {
                case 1:
                    AllVariables.userBuilder.setMobil1(mobilDataGet.getMobileData());
                    break;
                case 2:
                    AllVariables.userBuilder.setMobil2(mobilDataGet.getMobileData());
                    break;
                case 3:
                    AllVariables.userBuilder.setMobil3(mobilDataGet.getMobileData());
                    break;
                case 4:
                    return;
            }
        }
    }
}
