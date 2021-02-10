package Entities;

public class Worker extends Employee{

    private String rank;
    public Worker(){

    }

    public Worker(String rank) {
        this.rank = rank;
    }

    public Worker(int employeeNo,String name, String DOB, String gender, String add, String rank,int basicSalary,int rate) {
        super(employeeNo,name, DOB, gender, add,basicSalary,rate);
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "rank='" + rank + '\'' +
                '}'+
                "employee number "+getEmployeeNo()+
                "name='" + getName() + '\'' +
                ", DOB='" + getDOB()+ '\'' +
                ", gender='" + getGender() + '\'' +
                ", add='" + getAdd()+ '\'' +
                '}';
    }
}
