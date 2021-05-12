package bean;

public enum Role {
    USER ("lev 1"),
    CUSTOMER ("lev 1"),
    ADMIN ("lev 2"),
    PROVIDER ("lev 2"),
    SUPER_ADMIN ("lev 3"),
    EMPTY_ROLE("lev 0");
private  String level;

    Role(String level) {
        this.level = level;
    }
}
