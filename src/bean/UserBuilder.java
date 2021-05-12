package bean;

public interface UserBuilder {
    UserBuilder setId(int id);
    UserBuilder setName (String  name);
    UserBuilder setSirName (String sirName);
    UserBuilder setEmail (String email);
    UserBuilder setRole1 (Role role1);
    UserBuilder setRole2 (Role role2);
    UserBuilder setMobil1 (String mobil1);
    UserBuilder setMobil2 (String mobil2);
    UserBuilder setMobil3 (String mobil3);
    User build ();
}
