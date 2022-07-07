package com.assignment.practice27;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
    public enum IOService {Console_IO,File_IO,DB_IO,REST_IO }
    private  List<EmployeePayrollData> employeePayrollList;

    public EmployeePayrollService() {}

        EmployeePayrollService(List <EmployeePayrollData>employeePayrollList) {};


    public static void main(String[] args) {
        ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<>();
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
        Scanner consoleInputReader = new Scanner(System.in);
        employeePayrollService.readEmployeePayrollData(consoleInputReader);
        employeePayrollService.writeEmployeePayrollData();
    }

    public void readEmployeePayrollData(Scanner consoleInputReader) {
        System.out.println("Enter Employee ID");
        int id = consoleInputReader.nextInt();
        System.out.println("Enter Employee name");
        String name = consoleInputReader.next();
        System.out.println("Enter employee salary");
        double salary = consoleInputReader.nextDouble();
        employeePayrollList.add(new EmployeePayrollData(id,name,salary));

    }

    private void writeEmployeePayrollData() {
        System.out.println("\n Write Employee Payroll to console" +employeePayrollList);
    }
}
