package com.company;

public class Employeeclass
{
    private String name;
    private int idNumber;
    private String department;
    private String position;

    public Employeeclass(String nameInput, int intInput, String deptInput, String posInput)
    {
        name = nameInput;
        idNumber = intInput;
        department = deptInput;
        position = posInput;
    }

    public Employeeclass(String nameInput, int intInput)
    {
        name = nameInput;
        idNumber = intInput;
        department = "";
        position = "";
    }

    public Employeeclass()
    {
        name = "";
        idNumber = 1;
        department = "";
        position = "";
    }

    public void setName(String stringIn) {
        name = stringIn;
    }

    public void setIdNumber(int intIn) {
        idNumber = intIn;
    }

    public void setDepartment(String deptIn) {
        department = deptIn;
    }

    public void setPosition(String posIn) {
        position = posIn;
    }

    public String getName() {
        return name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getDeptartment() {
        return department;
    }

    public String getPosistion() {
        return position;
    }
}
