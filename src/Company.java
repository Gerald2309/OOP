import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Company {
    Scanner scanner = new Scanner(System.in);
    List<Employee> employees = new ArrayList <Employee>();

    public Company() {


    }

    public Employee createEmployee(Employee employee) {

      this.employees.add(employee);

        return employee;
    }

    public void getAllEmployees() {


        for (Employee employee : employees) {
            System.out.println(employee);
        }


    }


    public double averageAge  () {

        int ageAddition  = 0;
        int employeesCount = 0;

        for (Employee employee : employees) {

            ageAddition += employee.getAge();
            employeesCount++;

        }
        double averageAge = ageAddition / employeesCount;
        System.out.println("Average age: " + averageAge);
        return averageAge;

    }

    public void salaryIncrease (){

        System.out.println("which employee do you want to increase the salary of ");
        int employeeId = scanner.nextInt();

        boolean found = false;
        for (Employee employee : employees) {
            if (employee.getId() == employeeId) {
                System.out.println("Enter the percentage increase");
                double percentage = scanner.nextDouble();
                double salaryIncrease = employee.calculateSalaryIncrease(percentage);
                employee.setSalary(employee.getSalary() + salaryIncrease);
                System.out.println("Salary increased successfully");
                System.out.println(employee);
                found = true;
                break;

            } if (!found) {
                System.out.println("Employee with ID " + employeeId + " not found.");
            }

            }

        }

    }


}
