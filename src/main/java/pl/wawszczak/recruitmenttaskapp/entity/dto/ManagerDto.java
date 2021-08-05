package pl.wawszczak.recruitmenttaskapp.entity.dto;

import com.sun.istack.NotNull;
import pl.wawszczak.recruitmenttaskapp.entity.Position;

public class ManagerDto {

    @NotNull
    private String fullName;

    @NotNull
    private String accountNumber;

    @NotNull
    private Position position;

    @NotNull
    private String region;

    public ManagerDto() {
    }

    public ManagerDto(String fullName, String accountNumber, Position position, String region) {
        this.fullName = fullName;
        this.accountNumber = accountNumber;
        this.position = position;
        this.region = region;
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
}
