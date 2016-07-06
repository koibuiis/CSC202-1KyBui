package model;

import java.io.*;

/**
 * Created by Koi on 7/4/2016.
 */
public class UserIO {
    public static void writeUsers(Object data)throws IOException{
        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("users.dat"));
        output.writeObject(data);

    }
    public static Object readUsers() throws IOException, ClassNotFoundException {
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("users.dat"));
        return input.readObject();
    }
}
