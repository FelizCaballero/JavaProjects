package com.company;

public class EmployeeDemo
{
    public static void main(String[] args)
    {
        Employeeclass emp1 = new Employeeclass("Susan Meyers", 47899, "Accounting", "Vice President");
        Employeeclass emp2 = new Employeeclass("Mark Jones", 39119, "IT", "Programmer");
        Employeeclass emp3 = new Employeeclass("Joy Rodgers", 81774, "Manufacturing", "Engineer");

        Employeeclass[] Emps = new Employeeclass[3];
        Emps[0] = emp1;
        Emps[1] = emp2;
        Emps[2] = emp3;

        for(int i = 0; i < 3; i++)
        {
            System.out.println(Emps[i].getName());
            System.out.println(Emps[i].getIdNumber());
            System.out.println(Emps[i].getDeptartment());
            System.out.println(Emps[i].getPosistion());
            System.out.println();
        }
    }
}

