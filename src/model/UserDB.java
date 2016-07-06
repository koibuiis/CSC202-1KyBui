package model;


import java.util.ArrayList;
import java.util.LinkedList;


/**
 * Created by Koi on 7/4/2016.
 */
public class UserDB {
    private static ArrayList<User> users = new ArrayList<>();

    public static ArrayList<User> getUsers(){
        return users;
    }

    public static void setUsers(ArrayList<User> users){
        UserDB.users = users;
    }

}
