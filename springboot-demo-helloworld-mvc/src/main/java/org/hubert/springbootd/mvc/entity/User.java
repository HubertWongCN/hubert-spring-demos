package org.hubert.springbootd.mvc.entity;

/**
 * @author hubertwong
 */
public class User {
    /**
     * user id
     */
    private Integer userid;
    /**
     * user name
     */
    private String username;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
