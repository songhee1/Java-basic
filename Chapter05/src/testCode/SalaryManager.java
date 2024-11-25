package testCode;

import java.math.BigDecimal;

public class SalaryManager {

    public static void main(String[] args) {
        SalaryManager sm = new SalaryManager();
        double salary = sm.getMonthlySalary(4000);
        double workTax = sm.calculateTax(salary);
        System.out.println("근로소득세 : "+workTax);
        double peopleTax = sm.calculateNationalPension(salary);
        System.out.println("국민연금 : "+ peopleTax);
        double healthTax = sm.calculateHealthInsurance(salary);
        System.out.println("건강보험료 : "+healthTax);
        salary-=(workTax+peopleTax+healthTax);
        System.out.println(salary);
        // 중요계산은 BigDecimal
    }
    public double getMonthlySalary(double yearlySalary){
        return yearlySalary/12.0;
    }
    public double calculateTax(double monthSalary){
        return monthSalary*12.5;
    }
    public double calculateNationalPension(double monthSalary){
        return monthSalary*8.1;
    }
    public double calculateHealthInsurance(double monthSalary){
        return monthSalary*13.5;
    }
}
