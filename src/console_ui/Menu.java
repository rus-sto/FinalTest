package console_ui;

import bean.Role;
import bean.User;
import bean.UserBuilder;
import bean.UserBuilderImpl;
import io.UserFileWriter;
import service.DataBaseService;
import util.CommandReader;

import java.util.List;
import java.util.Scanner;

import static bean.Role.ADMIN;
import static bean.Role.USER;
import static console_ui.Validator.*;

public class Menu {
    private UserBuilder userBuilder;
    private DataBaseService dataBaseService;


    private final String createNameMessage = "Input NAME and press 'Enter'";
    private final String createSurNameMessage = "Input SURNAME and press 'Enter'";
    private final String createEmailMessage = "Input EMAIL and press 'Enter'";
    private final String createRoleMessage = "Input ROLE  :\n" +
            "1. USER\n" +
            "2. CUSTOMER\n" +
            "3. PROVIDER\n" +
            "4. ADMIN\n" +
            "5. USER and ADMIN\n" +
            "6. USER and PROVIDER \n" +
            "7. CUSTOMER and PROVIDER \n" +
            "8. CUSTOMER and ADMIN \n" +
            "9. SUPER_ADMIN\n" +
            "10. Exit";

    private final String startMessage =
            "1. Create user\n" +
                    "2. Edit user\n" +
                    "3. View all users\n" +
                    "4. Save changes\n" +
                    "5. Exit";
    private final String createUserMessage =
            "1. Input User name\n" +
                    "2. Input User surName\n" +
                    "3. Input User e-mail\n" +
                    "4. Input User role\n" +
                    "5. Input User phone\n" +
                    "6. Add user to DataBase\n" +
                    "7. Return to main menu";
    private final String editUserMessage =
            "1. Edit chosen User name\n" +
                    "2. Edit chosen User surName\n" +
                    "3. Edit chosen User e-mail\n" +
                    "4. Edit chosen User role\n" +
                    "5. Edit chosen User phone\n" +
                    "6. Return to main menu";
    private final String createMobilMessage =
            "1. Input Mobil1 Number\n" +
                    "2. Input Mobil2 Number\n" +
                    "3. Input Mobil3 Number\n" +
                    "4. Exit";
    private final String editMobilMessage =
            "1. Input Mobil1 Number\n" +
                    "2. Input Mobil2 Number\n" +
                    "3. Input Mobil3 Number\n" +
                    "4. Exit";
    private final String enterIdMessage = "Input the ID you want user to be edited, and press 'enter'";
    private final String firstEditMessage = "Input 1 to Input ID \n" +
            "Input 2 to leave menu";
    private final Scanner scanner;

    public Menu() {
        this.scanner = new Scanner(System.in);
        this.dataBaseService = new DataBaseService();
    }

    public void mainMenu() {
        int choice;
        while (true) {
            choice = getAnswerFromMenu(startMessage, 5);
            switch (choice) {
                case 1:
                    createUserMenu();
                    break;
                case 2:
                    firstEditMenu();
                    break;
                case 3:
                    //                   viewUsers();
                    break;
                case 4:
                    saveChanges();
                    break;
                case 5:
                    return;
            }
        }
    }

    private void saveChanges() {
        List<User> users = dataBaseService.getUsersDataBase();
        UserFileWriter.writeToFile(users);
    }

    private int getAnswerFromMenu(String message, int menuSize) {
        String answer;
        int result;
        while (true) {
            System.out.println(message);
            if (scanner.hasNextLine()) {
                answer = scanner.nextLine();
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

    private void errorMenu(String errorMessage) {
        System.out.println(errorMessage);
        scanner.nextLine();
    }

    private void printStartMessage() {
        System.out.println(startMessage);
    }

    public void createUserMenu() {
        int choice;
        userBuilder = new UserBuilderImpl();
        while (true) {
            choice = getAnswerFromMenu(createUserMessage, 7);
            switch (choice) {
                case 1:
                    createNameMenu();
                    break;
                case 2:
                    createSurNameMenu();
                    break;
                case 3:
                    createEmailMenu();
                    break;
                case 4:
                    createRoleMenu();
                    break;
                case 5:
                    createMobilMenu();
                    break;
                case 6:
                    addUserToDataBase();
                    break;
                case 7:
                    return;
            }
        }
    }

    private void inputIdMenu(String enterIdMessage) {
        String id = "";
        while (true) {
            System.out.println(enterIdMessage);
            if (scanner.hasNextLine()) {
                id = scanner.nextLine();
            }
            if (id.length() > 0 && isNumber(id)
                    && dataBaseService.hasDataBaseUserById(Integer.parseInt(id))) {
                System.out.println(dataBaseService.getUserFromDataBase(Integer.parseInt(id)));
                editUserMenu(Integer.parseInt(id));
                return;
            } else {
                errorMenu("You do not Input correct ID Number, " +
                        "\npress 'Enter' to try again");

            }
        }
    }

    private void firstEditMenu() {
        int choice;
        while (true) {
            choice = getAnswerFromMenu(firstEditMessage, 2);
            switch (choice) {
                case 1:
                    inputIdMenu(enterIdMessage);
                    break;
                case 2:
                    return;
            }
        }
    }

    private void editUserMenu(int id) {
        int choice;
        userBuilder = new UserBuilderImpl();
        while (true) {
            choice = getAnswerFromMenu(editUserMessage, 6);
            switch (choice) {
                case 1:
                    editNameMenu(id);
                    break;
                case 2:
                    editSurNameMenu(id);
                    break;
                case 3:
                    editEmailMenu(id);
                    break;
                case 4:
                    editRoleMenu(id);
                    break;
                case 5:
                    editMobilMenu(id);
                    break;
                case 6:
                    return;
            }
        }
    }

    private void editNameMenu(int id) {
        String answer = "";
        while (true) {
            System.out.println(createNameMessage);
            if (scanner.hasNextLine()) {
                answer = scanner.nextLine();
            }
            if (answer.length() > 0 && isLetter(answer)) {
                dataBaseService.getUserFromDataBase(id).setName(answer);
                return;
            } else {
                errorMenu("You do not Input the Name, press 'Enter' to try again");
            }
        }
    }
    private void editSurNameMenu(int id) {
        String answer = "";
        while (true) {
            System.out.println(createNameMessage);
            if (scanner.hasNextLine()) {
                answer = scanner.nextLine();
            }
            if (answer.length() > 0 && isLetter(answer)) {
                dataBaseService.getUserFromDataBase(id).setSirName(answer);
                return;
            } else {
                errorMenu("You do not Input the SurName, press 'Enter' to try again");
            }
        }

    }
    private void editEmailMenu(int id) {
        String answer = "";
        while (true) {
            System.out.println(createNameMessage);
            if (scanner.hasNextLine()) {
                answer = scanner.nextLine();
            }
            if (answer.length() > 0 && isEmail(answer)) {
                dataBaseService.getUserFromDataBase(id).setEmail(answer);
                return;
            } else {
                errorMenu("You do not Input the Email, press 'Enter' to try again");
            }
        }
    }
    private void editRoleMenu(int id) {
        String answer = "";
        while (true) {
            System.out.println(createNameMessage);
            if (scanner.hasNextLine()) {
                answer = CommandReader.readString("Input needed Role number");
            }
            if (answer.length() > 0 && isRole(answer)) {
//                dataBaseService.getUserFromDataBase(id).setRole1(answer);
                return;
            } else {
                errorMenu("You do not Input the Role, press 'Enter' to try again");
            }
        }
    }
    private void editMobilMenu(int id) {
        String answer = "";
        while (true) {
//            System.out.println(editPhoneMessage);
            if (scanner.hasNextLine()) {
                answer = CommandReader.readString("Enter mobil 1: ");
//                answer = scanner.nextLine();
            }
            if (answer.length() > 0 && isPhone(answer)) {
                dataBaseService.getUserFromDataBase(id).setMobil1(answer);
                return;
            } else {
                errorMenu("You do not Input the Mobil Number correct, press 'Enter' to try again");
            }
        }
    }


    public void createNameMenu() {
        String answer = "";
        while (true) {
            System.out.println(createNameMessage);
            if (scanner.hasNextLine()) {
                answer = scanner.nextLine();
            }
            if (answer.length() > 0 && isLetter(answer)) {
                userBuilder.setName(answer);
                return;
            } else {
                errorMenu("You do not Input the Name, press 'Enter' to continue try again");
            }
        }
    }

    public void createSurNameMenu() {
        String answer = "";
        while (true) {
            System.out.println(createSurNameMessage);
            if (scanner.hasNextLine()) {
                answer = scanner.nextLine();
            }
            if (answer.length() > 0 && isLetter(answer)) {
                userBuilder.setSirName(answer);
                return;
            } else {
                errorMenu("You do not Input the surName, press 'Enter' to continue try again");
            }
        }
    }

    public void createEmailMenu() {
        String answer = "";
        while (true) {
            System.out.println(createEmailMessage);
            if (scanner.hasNextLine()) {
                answer = scanner.nextLine();
            }
            if (answer.length() > 0 && isEmail(answer)) {
                userBuilder.setSirName(answer);
                return;
            } else {
                errorMenu("You do not Input the Email, press 'Enter' to continue try again");
            }
        }
    }


    public void createRoleMenu() {
        int choice;
        while (true) {
            choice = getAnswerFromMenu(createRoleMessage, 10);
            switch (choice) {
                case 1:
                    userBuilder.setRole1(Role.USER);
                    userBuilder.setRole2(Role.EMPTY_ROLE);
                    break;
                case 2:
                    userBuilder.setRole1(Role.CUSTOMER);
                    userBuilder.setRole2(Role.EMPTY_ROLE);

                    break;
                case 3:
                    userBuilder.setRole1(Role.PROVIDER);
                    userBuilder.setRole2(Role.EMPTY_ROLE);

                    break;
                case 4:
                    userBuilder.setRole1(Role.ADMIN);
                    userBuilder.setRole2(Role.EMPTY_ROLE);

                    break;
                case 5:
                    userBuilder.setRole2(Role.ADMIN);
                    userBuilder.setRole1(Role.USER);
                    break;
                case 6:
                    userBuilder.setRole2(Role.PROVIDER);
                    userBuilder.setRole1(Role.USER);
                    break;
                case 7:
                    userBuilder.setRole2(Role.PROVIDER);
                    userBuilder.setRole1(Role.CUSTOMER);
                    break;
                case 8:
                    userBuilder.setRole2(Role.ADMIN);
                    userBuilder.setRole1(Role.CUSTOMER);
                    break;
                case 9:
                    userBuilder.setRole1(Role.SUPER_ADMIN);
                    userBuilder.setRole2(Role.EMPTY_ROLE);

                    break;
                case 10:
                    System.out.println("You are exit to prev menu");
                    return;
            }
            System.out.println("The role # " + choice + " is chosen");
            return;
        }
    }

    public void createMobilMenu() {
        int choice;
        while (true) {
            choice = getAnswerFromMenu(createMobilMessage, 4);
            switch (choice) {
                case 1:
                    userBuilder.setMobil1(getMobileData());
                    break;
                case 2:
                    userBuilder.setMobil2(getMobileData());
                    break;
                case 3:
                    userBuilder.setMobil3(getMobileData());
                    break;
                case 4:
                    return;
            }
        }
    }

    private String getMobileData() {
        String answer = "";
        while (true) {
            System.out.println("Input Mobil Number like +375xxxxxxxxx");
            if (scanner.hasNextLine()) {
                answer = scanner.nextLine();
            }
            if (answer.length() > 0 && isPhone(answer)) {
                return answer;
            } else {
                errorMenu("You do not Input the Mobil Number, " +
                        "\npress 'Enter' to try again");
            }
        }
    }

    private void addUserToDataBase() {
        User user = userBuilder.build();
        dataBaseService.addToDataBase(user);
        System.out.println("User saved successfully");
    }
}