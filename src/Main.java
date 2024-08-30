//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Company company1 = new Company();

        Employee employee1 = new Employee("John Doe", 30, 50000);
        Employee employee2 = new Employee("Juan", 22, 20000);
        Employee employee3 = new Employee("Jose", 35, 10000);

        company1.createEmployee(employee1);
        company1.createEmployee(employee2);
        company1.createEmployee(employee3);

        company1.getAllEmployees();


        


    }
}