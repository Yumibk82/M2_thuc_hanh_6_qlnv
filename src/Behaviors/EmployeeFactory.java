package Behaviors;

import Entities.Employee;
import Entities.Engineer;
import Entities.Staff;
import Entities.Worker;
import java.util.Scanner;
public class EmployeeFactory {
    public static Employee getEmployee(String position) {
        Scanner input = new Scanner(System.in);
        switch (position) {
            case "Worker":
                Worker worker = new Worker();
                System.out.println("Enter worker's number");
                int employeeNo = Integer.parseInt(input.nextLine());
                worker.setEmployeeNo(employeeNo);
                System.out.println("Enter worker's name");
                String employeeName = input.nextLine();
                worker.setName(employeeName);
                System.out.println("Enter worker's date of birth");
                String employeeDOB = input.nextLine();
                worker.setDOB(employeeDOB);
                System.out.println("Enter worker's gender");
                String employeeGender = input.nextLine();
                worker.setGender(employeeGender);
                System.out.println("Enter worker's address");
                String employeeAddress = input.nextLine();
                worker.setAdd(employeeAddress);
                System.out.println("Enter worker's rank");
                String rankWorker = input.nextLine();
                worker.setRank(rankWorker);
                return worker;
            case "Engineer":
                Engineer engineer = new Engineer();
                System.out.println("Enter engineer's number");
                int engineerNo = Integer.parseInt(input.nextLine());
                engineer.setEmployeeNo(engineerNo);
                System.out.println("Enter engineer's name");
                String engineerName = input.nextLine();
                engineer.setName(engineerName);
                System.out.println("Enter engineer's date of birth");
                String engineerDOB = input.nextLine();
                engineer.setDOB(engineerDOB);
                System.out.println("Enter engineer's gender");
                String engineerGender = input.nextLine();
                engineer.setGender(engineerGender);
                System.out.println("Enter engineer's address");
                String engineerAdd = input.nextLine();
                engineer.setAdd(engineerAdd);
                System.out.println("Enter engineer's major");
                String majorEngineer = input.nextLine();
                engineer.setMajor(majorEngineer);
                return engineer;
            case "Staff":
                Staff staff = new Staff();
                System.out.println("Enter staff's number");
                int staffNo = Integer.parseInt(input.nextLine());
                staff.setEmployeeNo(staffNo);
                System.out.println("Enter staff's name");
                String staffName = input.nextLine();
                staff.setName(staffName);
                System.out.println("Enter staff's date of birth");
                String staffDOB = input.nextLine();
                staff.setDOB(staffDOB);
                System.out.println("Enter staff's gender");
                String staffGender = input.nextLine();
                staff.setGender(staffGender);
                System.out.println("Enter staff's address");
                String staffAdd = input.nextLine();
                staff.setAdd(staffAdd);
                System.out.println("Enter staff's job");
                String jobStaff = input.nextLine();
                staff.setJob(jobStaff);
                return staff;
            default:
                return null;
        }
    }
}
