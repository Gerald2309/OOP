import java.util.ArrayList;
import java.util.List;

public class Company {

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

    /*
    public double averageAge  (List<Employee> employees) {


        return  averageAge

    }
*/

}
