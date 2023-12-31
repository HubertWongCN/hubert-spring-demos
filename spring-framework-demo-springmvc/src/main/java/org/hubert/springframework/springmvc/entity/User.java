package org.hubert.springframework.springmvc.entity;

/**
 * @author hubertwong
 */
public class User {
    /**
     * user's name
     */
    private String name;
    /**
     * user's age
     */
    private Integer age;

    /**
     * constructor
     *
     * @param name name
     * @param age  age
     */
    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
