package com.company;

public class PersonAndCustomerDemo {

    public static void main(String[] args) {
        CustomerClass patron = new CustomerClass();

        patron.setCustomerNumber(1992);
        patron.setName("Anthony Felix");
        patron.setAddress("324 Waccisa Rd");
        patron.setPhone("850-817-7572");
        patron.setMailing(true);

        System.out.println(patron);
    }
}
