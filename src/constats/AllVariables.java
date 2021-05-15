package constats;

import bean.UserBuilder;
import bean.UserBuilderImpl;
import console_ui.GetAnswerFromUser;
import console_ui.MobilDataGet;
import console_ui.create.*;
import console_ui.edit.*;
import console_ui.remove.MenuUserRemove;
import console_ui.save.MenuChangesSave;
import console_ui.viewall.MenuUsersView;
import service.DataBaseService;

import java.util.Scanner;

public class AllVariables {

    public final static DataBaseAddingTheUser dataBaseAddingTheUser = new DataBaseAddingTheUser();
    public final static MenuCreate menuCreate = new MenuCreate();
    public final static GetAnswerFromUser getAnswerFromUser = new GetAnswerFromUser();
    public final static MenuMobilCreate menuMobilCreate = new MenuMobilCreate();
    public final static MenuEmailCreate menuEmailCreate = new MenuEmailCreate();
    public final static MenuNameCreate menuNameCreate = new MenuNameCreate();
    public final static MenuSurNameCreate menuSurNameCreate = new MenuSurNameCreate();
    public final static MenuRoleCreate menuRoleCreate = new MenuRoleCreate();
    public final static MenuEdit menuEdit = new MenuEdit();
    public final static Scanner scanner = new Scanner(System.in);
    public final static DataBaseService dataBaseService = new DataBaseService();
    public final static MenuUserEdit menuUserEdit = new MenuUserEdit();
    public final static MenuUsersView menuUsersView = new MenuUsersView();
    public final static MenuChangesSave menuChangesSave = new MenuChangesSave();
    public final static MenuUserRemove menuUserRemove = new MenuUserRemove();


    public final static MenuNameEdit menuNameEdit = new MenuNameEdit();
    public final static MenuSurNameEdit menuSurNameEdit = new MenuSurNameEdit();
    public final static MenuEmailEdit menuEmailEdit = new MenuEmailEdit();
    public final static MenuRoleEdit menuRoleEdit = new MenuRoleEdit();
    public final static MenuMobilEdit menuMobilEdit = new MenuMobilEdit();
    public final static MobilDataGet mobilDataGet = new MobilDataGet();

    public static UserBuilder userBuilder = new UserBuilderImpl();
}
