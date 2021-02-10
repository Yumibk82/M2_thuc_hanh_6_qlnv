package Views;

import Behaviors.EmployeeManagement;
import Entities.Employee;
import Entities.Worker;

import java.util.Scanner;

public class Program {
    static Scanner input = new Scanner(System.in);
    static EmployeeManagement<Employee> employeeEmployeeManagement = new EmployeeManagement<>();

    public static void main(String[] args) {
        int choiceMainMenu = 0;
        do{
            System.out.println("======================================");
            System.out.println("1. ADD NEW EMPLOYEE");
            System.out.println("2. UPDATE EMPLOYEE INFORMATION");
            System.out.println("3. REMOVE EMPLOYEE");
            System.out.println("4. ALL EMPLOYEES INFORMATION");
            System.out.println("5. CALCULATE SALARY");
            System.out.println("6. EXIT");
            System.out.println("======================================");
            System.out.println("Please enter your choice");
            try{
                choiceMainMenu = Integer.parseInt(input.nextLine());
                switch (choiceMainMenu){
                    case 1:
                        int choiceAddMenu = 0;
                        do {
                            System.out.println("------------------------");
                            System.out.println("1. Add new Worker");
                            System.out.println("2. Add new Engineer");
                            System.out.println("3. Add new Staff");
                            System.out.println("4. Back");
                            System.out.println("------------------------");
                            System.out.println("Enter your choice");
                            try {
                                choiceAddMenu = Integer.parseInt(input.nextLine());
                                switch (choiceAddMenu) {
                                    case 1:
                                        Employee worker = Menu.getEmployeeInfo("Worker");
                                        employeeEmployeeManagement.add(worker);
                                        break;
                                    case 2:
                                        Employee engineer = Menu.getEmployeeInfo("Engineer");
                                        employeeEmployeeManagement.add(engineer);
                                        break;
                                    case 3:
                                        Employee staff = Menu.getEmployeeInfo("Staff");
                                        employeeEmployeeManagement.add(staff);
                                        break;
                                    case 4:
                                        break;
                                    default:
                                        System.out.println("Enter a number from 1 to 4");
                                }
                            } catch (Exception e) {
                            }
                        }while (choiceAddMenu !=4);
                        break;
                    case 2:
                        Employee employeeUpdate = Menu.searchEmployee(employeeEmployeeManagement);
                        if(employeeUpdate != null){
                            String className = employeeUpdate.getClass().getSimpleName();
                            Employee newEmployee = Menu.getEmployeeInfo(className);
                            employeeEmployeeManagement.update(newEmployee,employeeUpdate);
                        }
                        break;
                    case 3:
                        Employee employeeRemove = Menu.searchEmployee(employeeEmployeeManagement);
                        if(employeeRemove != null){
                            employeeEmployeeManagement.remove(employeeRemove);
                        }
                        break;
                    case 4:
                        employeeEmployeeManagement.show();
                        break;
                    case 5:
                        Employee employeeGetSalary = Menu.searchEmployee(employeeEmployeeManagement);
                        if(employeeGetSalary != null){
                            System.out.println("Enter basic salary");
                            int basicSalary = Integer.parseInt(input.nextLine());
                            System.out.println("Enter rate");
                            int rate = Integer.parseInt(input.nextLine());
                            int salary = (int) employeeGetSalary.getSalary(basicSalary,rate);
                            System.out.println(salary);
                            System.out.println(employeeGetSalary.getClass().getSimpleName()+" "
                                    +employeeGetSalary.getName()+"salary for this month is "
                                    +employeeGetSalary.getSalary(basicSalary,rate));
                        }
                        break;
                    case 6:
                        System.out.println("Exit Programing");
                        break;
                    default:
                        System.out.println("Enter a number from 1 to 6");
                }
            }
            catch (Exception e){
                System.out.println("Please enter a number only");
            };
        }while (choiceMainMenu != 6);
    }
}
