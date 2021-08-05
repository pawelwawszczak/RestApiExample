package pl.wawszczak.recruitmenttaskapp.entity;

import javax.persistence.*;

@MappedSuperclass
public class Employee extends BaseEntity {


    private String fullName;
    private String accountNumber;

    @Enumerated(value = EnumType.STRING)
    private Position position;

    private String salary;

    public Employee() {
    }

    public Employee(String fullName, String accountNumber, Position position) {
        this.fullName = fullName;
        this.accountNumber = accountNumber;
        this.position = position;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public Position getPosition() {
        return position;
    }

    protected void receiveSalary(String monthlySalary){
        this.salary += monthlySalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + this.fullName + '\'' +
                ", position=" + this.position +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (!fullName.equals(employee.fullName)) return false;
        return accountNumber.equals(employee.accountNumber);
    }

    @Override
    public int hashCode() {
        int result = fullName.hashCode();
        result = 31 * result + accountNumber.hashCode();
        return result;
    }
}
