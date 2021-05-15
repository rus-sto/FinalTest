package console_ui.create;

import bean.Role;
import constats.AllVariables;

import static constats.AllAppConstants.createRoleMessage;

public class MenuRoleCreate {

    public void createRoleMenu() {
        int choice;
        while (true) {
            choice = AllVariables.getAnswerFromUser.getAnswerFromMenu(createRoleMessage, 10);
            switch (choice) {
                case 1:
                    AllVariables.userBuilder.setRole1(Role.USER);
                    AllVariables.userBuilder.setRole2(Role.EMPTY_ROLE);
                    break;
                case 2:
                    AllVariables.userBuilder.setRole1(Role.CUSTOMER);
                    AllVariables.userBuilder.setRole2(Role.EMPTY_ROLE);

                    break;
                case 3:
                    AllVariables.userBuilder.setRole1(Role.PROVIDER);
                    AllVariables.userBuilder.setRole2(Role.EMPTY_ROLE);

                    break;
                case 4:
                    AllVariables.userBuilder.setRole1(Role.ADMIN);
                    AllVariables.userBuilder.setRole2(Role.EMPTY_ROLE);

                    break;
                case 5:
                    AllVariables.userBuilder.setRole2(Role.ADMIN);
                    AllVariables.userBuilder.setRole1(Role.USER);
                    break;
                case 6:
                    AllVariables.userBuilder.setRole2(Role.PROVIDER);
                    AllVariables.userBuilder.setRole1(Role.USER);
                    break;
                case 7:
                    AllVariables.userBuilder.setRole2(Role.PROVIDER);
                    AllVariables.userBuilder.setRole1(Role.CUSTOMER);
                    break;
                case 8:
                    AllVariables.userBuilder.setRole2(Role.ADMIN);
                    AllVariables.userBuilder.setRole1(Role.CUSTOMER);
                    break;
                case 9:
                    AllVariables.userBuilder.setRole1(Role.SUPER_ADMIN);
                    AllVariables.userBuilder.setRole2(Role.EMPTY_ROLE);

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
