package com.anams.Model;

public class DC {
    private String username;
    private String password;

    private String STR_DEFAULT = "";

    public DC() {
        setUsername(STR_DEFAULT);
        setPassword(STR_DEFAULT);
    }

    public DC(String username, String password) {
        setUsername(username);
        setPassword(password);
    }

    public void setUsername(String username) { this.username = username; }

    public String getUsername() { return this.username; }

    public void setPassword(String password) { this.password = password; }

    public String getPassword() { return this.password; }

    public boolean login(DC tentativa){
        if(!this.username.equalsIgnoreCase(tentativa.username)){
            return false;
        }
        if(!this.password.equalsIgnoreCase(tentativa.password)){
            return false;
        }
        return true;
    }

}
