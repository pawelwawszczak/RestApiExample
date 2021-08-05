package pl.wawszczak.recruitmenttaskapp.exceptions;

public class ManagerNotFoundException extends RuntimeException {

    public ManagerNotFoundException() {
        super("Manager was not found!");
    }
}
