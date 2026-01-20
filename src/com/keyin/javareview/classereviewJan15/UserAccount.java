package com.keyin.javareview.classereviewJan15;

import java.util.List;

//--------------------------------------------------
//        |                  UserAccount                   |
//        --------------------------------------------------
//        | - id: int                                      |
//        | - username: String                             |
//        | - passwordHash: String                         |
//        | - email: String                                |
//        | - roles: List<String>                          |
//        | - active: boolean                              |
//        --------------------------------------------------
//        | + UserAccount(id, username, email)             |
//        | + setPassword(password: String): void          |
//        | + addRole(role: String): void                  |
//        | + removeRole(role: String): void               |
//        | + deactivate(): void                           |
//        | + isActive(): boolean                          |
//        | + getUsername(): String                        |
//        --------------------------------------------------
public class UserAccount {
    private int id;
    private String username;
    private String passwordHash;
    private String email;
    private List<String> roles;
    private boolean active;

    public UserAccount(int id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void addRoleString(String role){
        roles.add(role);
    }

    public void removeRoleString(String role){
        roles.add(role);
    }

    public void deactivate(){
        active = false;
    }
    public boolean isActiveString(){
        return active;
    }


}
