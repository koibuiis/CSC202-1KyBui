package model;

import javafx.application.Application;

import java.io.Serializable;

/**
 * Created by Koi on 7/4/2016.
 */
public class Person implements Serializable {
    private String firstName;
    private String lastName;
    private String SSN;
    private String DOB;
    private String GEN;

    public Person(){

    }
    public Person(String firstName, String lastName, String DOB, String GEN) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.DOB = DOB;
        this.GEN = GEN;
    }

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;

    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;

    }
    public String getSSN(){
        return SSN;
    }
    public void setSSN(String SSN){
        this.SSN = SSN;
    }
    public String getDOB(){
        return DOB;
    }
    public void setDOB(String DOB){
        this.DOB = DOB;
    }
    public String getGEN(){
        return GEN;
    }
    public void setGEN(String GEN){
        this.GEN = GEN;
    }


    @Override
    public String toString(){
      return "Person( '" +
              "FirstName= '" + firstName + '\'' +
              ", LastName= '" + lastName + '\'' +
              ", SSN= '" + SSN + '\'' +
              ", DOB= '" + DOB + '\'' +
              ", GEN= '" + GEN + '\'' + ')';

    }
    }




