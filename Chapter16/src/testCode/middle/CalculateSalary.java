package testCode.middle;

public class CalculateSalary {

    public static void main(String[] args) {
        CalculateSalary salary = new CalculateSalary();
        salary.calculateSalaries();
    }
    public long getSalaryIncrease(Employee employee){
        int type = employee.getType();
        long salary = employee.getSalary();

        if(type == 1){
            salary += salary * -0.95;
        }else if(type == 2){
            salary += salary * 0.1;
        }else if(type == 3){
            salary += salary * 0.2;
        }else if(type == 4){
            salary += salary * 0.3;
        }else if(type == 5){
            salary += salary * 1;
        }

        return salary;
    }

    public void calculateSalaries(){
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("LeeDaeRi", 1, 1000000);
        employees[1] = new Employee("KimManager", 2, 100000);
        employees[2] = new Employee("WhangDesign", 3, 70000);
        employees[3] = new Employee("ParkArchi", 4, 80000);
        employees[4] = new Employee("LeeDevelop", 5, 60000);

        for (Employee employee : employees) {
            System.out.println(employee.getName()+"="+getSalaryIncrease(employee));
        }
    }
}
