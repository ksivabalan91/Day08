package sdf;

public class Employee implements Comparable<Employee> {
    private String staffNo;
    private String fullName;
    private String department;
    private String email;
    private Integer salary;


    
    public Employee(String staffNo, String fullName, String department, String email, Integer salary) {
        this.staffNo = staffNo;
        this.fullName = fullName;
        this.department = department;
        this.email = email;
        this.salary = salary;
    }

    public String getStaffNo() {return staffNo;}
    public void setStaffNo(String staffNo) {this.staffNo = staffNo;}
    public String getFullName() {return fullName;}
    public void setFullName(String fullName) {this.fullName = fullName;}
    public String getDepartment() {return department;}
    public void setDepartment(String department) {this.department = department;}
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}
    public Integer getSalary() {return salary;}
    public void setSalary(Integer salary) {this.salary = salary;}

    @Override
    public String toString() {
        return "\nstaffNo = " + staffNo + " fullName = " + fullName + "\ndepartment = " 
        + department + " email = "+ email + "\nsalary = " + salary + "\n";
    }

    @Override
    public int compareTo(Employee o) {
        // TODO Auto-generated method stub
        return this.getFullName().compareTo(o.getFullName());
    }

    

        
    
}
