package com.company;

public class PersonClass {
    private String name, address, phone;

    public void Person(){
    }

    public void Person(String na, String ad, String ph){
        name = na;
        address = ad;
        phone = ph;
    }

    public void setName(String na){
        name = na;
    }

    public void setAddress(String ad){
        address = ad;
    }

    public void setPhone(String ph){
        phone = ph;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public String getPhone(){
        return phone;
    }
}
