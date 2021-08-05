package pl.wawszczak.recruitmenttaskapp.entity;

import javax.persistence.*;

@Entity
public class Seller extends Employee {

    @ManyToOne(fetch = FetchType.LAZY)
    private Manager manager;

    @OneToOne()
    @JoinColumn(name = "shop_id")
    private Shop shop;


    public Seller() {
    }

    public Seller(String fullName, String accountNumber, Position position) {
        super(fullName, accountNumber, position);

    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "full name=" + this.getFullName() +
                "manager=" + this.manager.getFullName() +
                ", shop=" + this.shop.getName() +
                '}';
    }
}
