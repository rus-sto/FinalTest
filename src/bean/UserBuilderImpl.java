package bean;


public class UserBuilderImpl implements UserBuilder {
    private final User user = new User();

    @Override
    public UserBuilder setId(int id) {
        user.id = id;
        return this;
    }

    @Override
    public UserBuilder setName(String name) {
        user.name = name;
        return this;
    }

    @Override
    public UserBuilder setSirName(String sirName) {
        user.sirName = sirName;
        return this;
    }

    @Override
    public UserBuilder setEmail(String email) {
        user.email = email;
        return this;
    }

    @Override
    public UserBuilder setRole1(Role role1) {
        user.role1 = role1;
        return this;
    }

    @Override
    public UserBuilder setRole2(Role role2) {
        user.role2 = role2;
        return this;
    }

    @Override
    public UserBuilder setMobil1(String mobil1) {
        user.mobil1 = mobil1;
        return this;
    }

    @Override
    public UserBuilder setMobil2(String mobil2) {
        user.mobil2 = mobil2;
        return this;
    }

    @Override
    public UserBuilder setMobil3(String mobil3) {
        user.mobil3 = mobil3;
        return this;
    }

    @Override
    public User build() {
        return user;
    }

}
