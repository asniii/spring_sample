package model;

public class Customer {

    private String firstname;
    private String lastname;

    // This is the default no argumnet constructor. This is the one used by spring.
    public Customer() {
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
