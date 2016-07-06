package model;

import java.io.Serializable;

/**
 * Created by Koi on 7/4/2016.
 */

public class User extends Person implements Serializable{
    private String username;
    private String email;
    private String phone;
    private String password;
    private String photo;

    public User(String username, String password){
        this.username = username;
        this.password = password;

    }

    public User(String userName, String email, String phone, String password, String photo){
        this.username = userName;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.photo = photo;

    }

    public User(String firstName, String lastName, String DOB, String GEN, String email, String phone, String password, String photo ){
        super(firstName, lastName, DOB, GEN);
        this.username = username;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.photo = photo;

    }
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;

    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;

    }
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;

    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPhoto(){
        return photo;

    }
    public void setPhoto(String photo){
        this.photo = photo;
    }

    @Override
    public String toString(){
        return "Username{" + username + '\'' +
                "Email= '" + email + '\'' +
                        ", Phone= '" + phone + '\'' +
                        ", Password= '" + password + '\'' +
                        ", Photo= '" + photo + '\'' + '}';

    }
    }
