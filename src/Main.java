//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Company company1 = new Company();

        Employee employee1 = new Employee(1,"John Doe", 30, 100);
        Employee employee2 = new Employee(2,"Juan", 22, 20000);
        Employee employee3 = new Employee(3,"Jose", 35, 10000);

        company1.createEmployee(employee1);
        company1.createEmployee(employee2);
        company1.createEmployee(employee3);

        company1.getAllEmployees();
        company1.averageAge();
        company1.salaryIncrease();

        


    }
}