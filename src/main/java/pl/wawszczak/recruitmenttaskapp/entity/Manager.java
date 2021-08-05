package pl.wawszczak.recruitmenttaskapp.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Manager extends Employee {

    @OneToMany(mappedBy = "manager", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Seller> sellers;

    private String region;

    public Manager() {
    }

    public Manager(String fullName, String accountNumber, Position position, String region) {
        super(fullName, accountNumber, position);
        this.region = region;
    }

    public Set<Seller> getSellers() {
        return sellers;
    }

    public void setSellers(Set<Seller> sellers) {
        this.sellers = sellers;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "Full name=" + this.getFullName() +
                ", region='" + this.region + '\'' +
                '}';
    }
}


