package com.records.academicrecords;

/**
 *
 * @author lucky
 */
public class User {
    
    private String name;
    private String surname;
    private String actor;
    private String username;
    private String password;
    
    public User(String name, String surname, String Actor) {
        this.name = name;
        this.surname = surname;
        this.actor = actor;
    }
    
    public String getName() {
        return name;
    }
    
    public String getSurname() {
        return surname;
    }
    
    public String getActor() {
        return actor;
    }
    
    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }
}
