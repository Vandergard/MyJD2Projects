package by.pvt.pojo;

import java.sql.Timestamp;

public class UserDetails {
    private long id;
    private String userName;
    private String userPassword;
    private User user;

    private Integer LoginAttemps;
    private Timestamp ExpiredDate;

    public Timestamp getExpiredDate() {
        return ExpiredDate;
    }

    public void setExpiredDate(Timestamp expiredDate) {
        ExpiredDate = expiredDate;
    }

    public Integer getLoginAttemps() {
        return LoginAttemps;
    }

    public void setLoginAttemps(Integer loginAttemps) {
        LoginAttemps = loginAttemps;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}


