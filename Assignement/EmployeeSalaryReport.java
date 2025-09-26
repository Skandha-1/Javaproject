package Assignement;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EmployeeSalaryReport {
    public static void main(String[] args) throws IOException {
        String filePath = "C:/Users/DELL/Desktop/excel/EmployeeSalaryReport.xlsx";

        // ---------------- CREATE EXCEL FILE ----------------
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("SalarySheet");

        // Employee data: Header + 5 employees
        Object[][] employeeData = {
            {"EmployeeID", "Name", "Department", "Salary"},
            {101, "Skandha", "HR", 50000},
            {102, "Ankush", "IT", 60000},
            {103, "Sagar", "Finance", 55000},
            {104, "Priyanaka", "Marketing", 48000},
            {105, "shreya", "Sales", 53000}
        };

        for (int i = 0; i < employeeData.length; i++) {
            Row row = sheet.createRow(i);
            for (int j = 0; j < employeeData[i].length; j++) {
                Cell cell = row.createCell(j);
                Object value = employeeData[i][j];
                if (value instanceof String)
                    cell.setCellValue((String) value);
                else if (value instanceof Integer)
                    cell.setCellValue((Integer) value);
                else if (value instanceof Double)
              cell.setCellValue((Double) value);
            }
        }

        FileOutputStream fos = new FileOutputStream(filePath);
        workbook.write(fos);
        fos.close();
        workbook.close();
        System.out.println("Excel file created successfully!");

        // ---------------- READ EXCEL FILE ----------------
        FileInputStream fis = new FileInputStream(filePath);
        Workbook readWorkbook = new XSSFWorkbook(fis);
        Sheet readSheet = readWorkbook.getSheetAt(0);

        double totalSalary = 0;
        System.out.println("\nEmployee Details:");
        for (int i = 1; i <= 5; i++) {
            Row row = readSheet.getRow(i);
            int empId = (int) row.getCell(0).getNumericCellValue();
            String name = row.getCell(1).getStringCellValue();
            String dept = row.getCell(2).getStringCellValue();
            double salary = row.getCell(3).getNumericCellValue();

            totalSalary += salary;

            System.out.println("ID: " + empId + ", Name: " + name + ", Dept: " + dept + ", Salary: " + salary);
        }

        System.out.println("\nTotal Salary: " + totalSalary);
        readWorkbook.close();
    }
}
