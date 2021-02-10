package Entities;

public class Staff extends Employee{
    private String job;

    public Staff(){

    }
    public Staff(String job) {
        this.job = job;
    }

    public Staff(int employeeNo,String name, String DOB, String gender, String add, String job,int basicSalary,int rate) {
        super(employeeNo,name, DOB, gender, add,basicSalary,rate);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "employee number "+getEmployeeNo()+
                "name='" + getName() + '\'' +
                ", DOB='" + getDOB()+ '\'' +
                ", gender='" + getGender() + '\'' +
                ", add='" + getAdd()+ '\'' +
                "Staff{" +
                "job='" + job + '\'' +
                '}';
    }
}
