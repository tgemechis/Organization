package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // declare all the variables at the top

        Scanner keyboard = new Scanner(System.in);
        Xyz zXyz;
        Employees zEmployees;
        String employeeAnswer;
        String xyzAnswer;
        boolean employeeDone = false;
        boolean xyzDone = false;

        ArrayList<Xyz> Xyzs = new ArrayList<>();

        do {
            zEmployees = new Employees();

            zXyz = new Xyz();

            System.out.println("Enter your employee number");
            zEmployees.setEmployeeNumber(keyboard.nextLine());

            System.out.println("Enter employee first name");
            zEmployees.setFirstName("Empyee first name");

            System.out.println("Enter employee last name");
            zEmployees.setLastName(keyboard.nextLine());

            System.out.println("You entered: Employee number "+ zEmployees.getEmployeeNumber()+"First Name:"+zEmployees.getFirstName()+"Last Name:"+zEmployees.getEmployeeNumber());

            zXyz.addEmployees(zEmployees);

            System.out.println("Do you want to enter details for another course?");
            employeeAnswer=keyboard.nextLine();

        }while(!employeeDone);

    }
}
