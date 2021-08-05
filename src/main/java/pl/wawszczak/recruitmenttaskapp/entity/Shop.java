package pl.wawszczak.recruitmenttaskapp.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Shop extends BaseEntity{

    private String name;
    private String city;
    private String street;

    @OneToOne(mappedBy = "shop")
    private Seller seller;

    public Shop() {
    }

    public Shop(String name, String city, String street) {
        this.name = name;
        this.city = city;
        this.street = street;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + this.name + '\'' +
                ", city='" + this.city + '\'' +
                ", street='" + this.street + '\'' +
                ", seller=" + seller.getFullName() +
                '}';
    }
}
