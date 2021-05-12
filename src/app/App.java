package app;

import bean.Role;
import bean.User;
import bean.UserBuilderImpl;
import console_ui.Menu;
import io.UserFileReader;
import io.UserFileWriter;
import service.DataBaseService;
import util.CommandReader;

import javax.swing.text.Utilities;


public class App {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.mainMenu();

    }


}
