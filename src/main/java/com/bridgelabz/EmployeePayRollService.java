package com.bridgelabz;

import java.util.List;
import java.util.Scanner;

public class EmployeePayRollService {
    public enum IOService {CONSOLE_IO, DB_IO, REST_IO}

    private List<EmployeePayRollData> employeePayRollList;

    private void readEmployeePayRollData(Scanner consoleInputReader) {
        System.out.println("Enter employee ID: ");
        int id = consoleInputReader.nextInt();
        System.out.println("Enter employee name: ");
        String name = consoleInputReader.next();
        System.out.println("Enter employee salary: ");
        double salary = consoleInputReader.nextDouble();
        employeePayRollList.add(new EmployeePayRollData(id, name, salary));
    }

    private void writeEmployeePayRollData() {
        System.out.println("\n Writing employee payroll roaster to console \n"+employeePayRollList);
    }
}
