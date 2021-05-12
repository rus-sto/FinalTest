package bean;



public class User {
    int id;
    String name;
    String sirName;
    String email;
    Role role1;
    Role role2;
    String mobil1;
    String mobil2;
    String mobil3;


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setName (String name) { this.name = name;}

    public String getSirName() {
        return sirName;
    }
    public void setSirName(String sirName) {this.sirName = sirName;}

    public String getEmail() {
        return email;
    }
    public void setEmail(String email){this.email = email;}

    public Role getRole1() {
        return role1;
    }
    public void setRole1(Role role1){this.role1 = role1;}

    public Role getRole2() {
        return role2;
    }
    public void setRole2(Role role2){this.role2 = role2;}


    public String getMobil1() {
        return mobil1;
    }
    public void setMobil1(String mobil1) {this.mobil1 = mobil1;}

    public String getMobil2() {
        return mobil2;
    }
    public void setMobil2(String mobil2) {this.mobil2 = mobil2;}


    public String getMobil3() {
        return mobil3;
    }
    public void setMobil3(String mobil3) {this.mobil3 = mobil3;}


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sirName='" + sirName + '\'' +
                ", email='" + email + '\'' +
                ", role1=" + role1 +
                ", role2=" + role2 +
                ", mobil1='" + mobil1 + '\'' +
                ", mobil2='" + mobil2 + '\'' +
                ", mobil3='" + mobil3 + '\'' +
                '}';
    }
}

