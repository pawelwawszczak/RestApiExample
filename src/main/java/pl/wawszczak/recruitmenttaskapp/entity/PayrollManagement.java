package pl.wawszczak.recruitmenttaskapp.entity;

import java.util.HashMap;

public class PayrollManagement implements Payable {

    private static final HashMap<Position, String> positionSalary = new HashMap<>();

    public PayrollManagement() {
        this.positionSalary.put(Position.SELLER_BEGINNER, "2000");
        this.positionSalary.put(Position.SELLER_ADVANCED, "3000");
        this.positionSalary.put(Position.SELLER_EXPERT, "4000");
        this.positionSalary.put(Position.MANAGER_BEGINNER, "5000");
        this.positionSalary.put(Position.MANAGER_ADVANCED, "6000");
        this.positionSalary.put(Position.MANAGER_EXPERT, "8000");
    }

    @Override
    public boolean paySalary(Employee employee) {
        employee.receiveSalary(positionSalary.get(employee.getPosition()));
        return true;
    }

}
