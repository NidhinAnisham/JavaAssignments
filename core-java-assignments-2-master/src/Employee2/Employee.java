/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee2;

/**
 *
 * @author NI389899
 */
public class Employee{
    private String eName;
    private String departmentName;
    private int salary;
    private int empNo;
    private String location;

    /**
     * @return the eName
     */
    public String geteName() {
        return eName;
    }

    /**
     * @param eName the eName to set
     */
    public void seteName(String eName) {
        this.eName = eName;
    }

    /**
     * @return the departmentName
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * @param departmentName the departmentName to set
     */
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    /**
     * @return the salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * @return the empNo
     */
    public int getEmpNo() {
        return empNo;
    }

    /**
     * @param empNo the empNo to set
     */
    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }
    
    public int salIncrease(int percentage) throws SalOverflow{
        try{
            if(percentage>100)
                throw new SalOverflow();
            else
                this.salary+=this.salary*(percentage/100);
        }
        catch(SalOverflow SalOverflow){
            System.out.println(SalOverflow.msg);
        }
        return this.salary;
    }
}
