package com.psoft.me;

public class Person {
    String firstName;//data or field or instance variable or attribute or property
    String middleName;
    String lastName;

    public Person(String firstName, String middleName,String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }

    public Person(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }


    public String getFullName(){

        return firstName+" "+lastName+" "+middleName;//variable
    }


}
