package com.company;

public class CustomerClass extends PersonClass{
    private int CustomerNumber;
    private boolean mailing;

    public CustomerClass(){
    }

    public CustomerClass(int CN, boolean ma){
        CustomerNumber = CN;
        mailing = ma;
    }

    public void setCustomerNumber(int CN){
        CustomerNumber = CN;
    }

    public void setMailing(boolean ma){
        mailing = ma;
    }

    public String getMailing(){
        String str;
        if(mailing==true)
            str = "yes";
        else
            str = "no";
        return str;
    }

    public String toString(){
        String str;
        str = "Name: "+ getName()
                + "\nAddress: " + getAddress()
                + "\nPhone: " + getPhone()
                + "\nCustomer Number: " + CustomerNumber
                + "\nMailing list: " + getMailing();
        return str;
    }
}
