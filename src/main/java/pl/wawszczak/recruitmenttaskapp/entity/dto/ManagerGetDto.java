package pl.wawszczak.recruitmenttaskapp.entity.dto;

import com.sun.istack.NotNull;
import pl.wawszczak.recruitmenttaskapp.entity.Position;
import pl.wawszczak.recruitmenttaskapp.entity.Seller;

import java.util.Set;

public class ManagerGetDto {

    private String fullName;

    private String accountNumber;

    private Position position;

    private String region;

    private Set<SellerDto> sellers;

    public ManagerGetDto() {
    }

    public ManagerGetDto(String fullName, String accountNumber, Position position, String region, Set<SellerDto> sellers) {
        this.fullName = fullName;
        this.accountNumber = accountNumber;
        this.position = position;
        this.region = region;
        this.sellers = sellers;
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

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Set<SellerDto> getSellers() {
        return sellers;
    }

    public void setSellers(Set<SellerDto> sellers) {
        this.sellers = sellers;
    }
}
