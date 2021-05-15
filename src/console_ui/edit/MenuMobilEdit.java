package console_ui.edit;

import constats.AllVariables;

import static constats.AllAppConstants.createMobilMessage;
import static constats.AllVariables.mobilDataGet;

public class MenuMobilEdit {

    public void editMobilMenu(int id) {
        int choice;
        while (true) {
            choice = AllVariables.getAnswerFromUser.getAnswerFromMenu(createMobilMessage, 4);
            switch (choice) {
                case 1:
                    AllVariables.dataBaseService.getUserFromDataBase(id).setMobil1(mobilDataGet.getMobileData());
                    break;
                case 2:
                    AllVariables.dataBaseService.getUserFromDataBase(id).setMobil2(mobilDataGet.getMobileData());
                    break;
                case 3:
                    AllVariables.dataBaseService.getUserFromDataBase(id).setMobil3(mobilDataGet.getMobileData());
                    break;
                case 4:
                    return;
            }
        }
    }
}
