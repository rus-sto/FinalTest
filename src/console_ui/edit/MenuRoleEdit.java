package console_ui.edit;

import bean.Role;
import constats.AllVariables;

import static bean.Role.USER;
import static constats.AllAppConstants.createRoleMessage;

public class MenuRoleEdit {

    public void editRoleMenu(int id) {
        int choice;
        while (true) {
            choice = AllVariables.getAnswerFromUser.getAnswerFromMenu(createRoleMessage, 10);
            switch (choice) {
                case 1:
                    AllVariables.dataBaseService.getUserFromDataBase(id).setRole1(USER);
                    AllVariables.dataBaseService.getUserFromDataBase(id).setRole2(Role.EMPTY_ROLE);
                    break;
                case 2:
                    AllVariables.dataBaseService.getUserFromDataBase(id).setRole1(Role.CUSTOMER);
                    AllVariables.dataBaseService.getUserFromDataBase(id).setRole2(Role.EMPTY_ROLE);

                    break;
                case 3:
                    AllVariables.dataBaseService.getUserFromDataBase(id).setRole1(Role.PROVIDER);
                    AllVariables.dataBaseService.getUserFromDataBase(id).setRole2(Role.EMPTY_ROLE);

                    break;
                case 4:
                    AllVariables.dataBaseService.getUserFromDataBase(id).setRole1(Role.ADMIN);
                    AllVariables.dataBaseService.getUserFromDataBase(id).setRole2(Role.EMPTY_ROLE);

                    break;
                case 5:
                    AllVariables.dataBaseService.getUserFromDataBase(id).setRole2(Role.ADMIN);
                    AllVariables.dataBaseService.getUserFromDataBase(id).setRole1(Role.USER);
                    break;
                case 6:
                    AllVariables.dataBaseService.getUserFromDataBase(id).setRole2(Role.PROVIDER);
                    AllVariables.dataBaseService.getUserFromDataBase(id).setRole1(Role.USER);
                    break;
                case 7:
                    AllVariables.dataBaseService.getUserFromDataBase(id).setRole2(Role.PROVIDER);
                    AllVariables.dataBaseService.getUserFromDataBase(id).setRole1(Role.CUSTOMER);
                    break;
                case 8:
                    AllVariables.dataBaseService.getUserFromDataBase(id).setRole2(Role.ADMIN);
                    AllVariables.dataBaseService.getUserFromDataBase(id).setRole1(Role.CUSTOMER);
                    break;
                case 9:
                    AllVariables.dataBaseService.getUserFromDataBase(id).setRole1(Role.SUPER_ADMIN);
                    AllVariables.dataBaseService.getUserFromDataBase(id).setRole2(Role.EMPTY_ROLE);

                    break;
                case 10:
                    System.out.println("You are exit to prev menu");
                    return;
            }
            System.out.println("The role # " + choice + " is chosen");
            return;
        }
    }
}
