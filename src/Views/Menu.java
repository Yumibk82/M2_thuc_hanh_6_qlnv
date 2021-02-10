package Views;

import Behaviors.EmployeeFactory;
import Behaviors.EmployeeManagement;
import Entities.Employee;
import java.util.Scanner;
public class Menu {
    static Scanner input = new Scanner(System.in);
    public static Employee getEmployeeInfo(String position){
        Employee employee = EmployeeFactory.getEmployee(position);
    return employee;
    }
    public static Employee searchEmployee(EmployeeManagement<Employee> em){
        System.out.println("Enter employee's number");
        Employee employee = em.search(Integer.parseInt(input.nextLine()));
            if(employee == null){
                System.out.println("No such employee");
                return null;
            }else{
                return employee;
            }
    }
}
