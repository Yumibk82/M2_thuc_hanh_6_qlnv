package Behaviors;

import Entities.Employee;
import Entities.Engineer;
import Entities.Staff;
import Entities.Worker;

import java.util.ArrayList;

public class EmployeeManagement<E extends Employee> implements IMethod<E>{

    ArrayList<E> employeeManagement = new ArrayList<E>();
    @Override
    public void add(E AddObj){
        employeeManagement.add(AddObj);
    }

    @Override
    public void update(E newObj,E previousObj){
        previousObj.setName(newObj.getName());
        previousObj.setDOB(newObj.getDOB());
        previousObj.setGender(newObj.getGender());
        previousObj.setAdd(newObj.getAdd());

        if(previousObj instanceof Worker && newObj instanceof Worker){
            ((Worker)previousObj).setRank(((Worker)newObj).getRank());
        }
        if(previousObj instanceof Engineer && newObj instanceof Engineer){
            ((Engineer)previousObj).setMajor(((Engineer)newObj).getMajor());
        }
        if(previousObj instanceof Staff && newObj instanceof Staff){
            ((Staff)previousObj).setJob(((Staff)newObj).getJob());
        }
    }
    @Override
    public void remove(E removeObj){
        employeeManagement.removeIf(obj->(obj.getEmployeeNo()==removeObj.getEmployeeNo()));
    }
    @Override
    public E search(int employeeNo){
        for (E obj:employeeManagement) {
            if(obj.getEmployeeNo()==employeeNo){
                return obj;
            }
        }
        return null;
    }
    @Override
    public void show(){
        for (E obj: employeeManagement) {
            System.out.println(obj.toString());
        }
    }
}
