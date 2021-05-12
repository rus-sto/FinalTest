package service;

import bean.Role;
import bean.User;
import bean.UserBuilderImpl;
import io.UserFileReader;

import java.util.List;

public class DataBaseService {
    private List<User> usersDataBase;
    private int lastId;

    public DataBaseService() {
        this.usersDataBase = UserFileReader.readFromFile();
        if (usersDataBase.size() == 0) {
            this.lastId = 0;
        } else {
            this.lastId = usersDataBase.get(usersDataBase.size() - 1).getId();
        }
    }

    public List<User> getUsersDataBase() {

        return usersDataBase;
    }

    public User getUserFromDataBase(int id) {
        for (User us : usersDataBase) {
            if (us.getId() == id) {
                return us;
            }
        }
        return new User();
    }
    public void removeUserFromDataBase(int id) {
        for (User us : usersDataBase) {
            if (us.getId() == id) {
                usersDataBase.remove(us);
                break;
            }
        }
            }

    public void addToDataBase(User user) {
        lastId = lastId + 1;
        user.setId(lastId);
        usersDataBase.add(user);
    }

    public List<User> addToDataBase(List<User> userList) {

        usersDataBase.addAll(userList);
        return usersDataBase;
    }

    public boolean hasDataBaseUserById(int id) {
        boolean result = false;
        for (User us : usersDataBase) {
            if (us.getId() == id) {
                result = true;
            }
        }
        return result;
    }
}