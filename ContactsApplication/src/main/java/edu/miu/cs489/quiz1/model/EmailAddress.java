package edu.miu.cs489.quiz1.model;

public class EmailAddress extends Channel {
    private String address;

    public EmailAddress() {
        this(null, null);
    }

    public EmailAddress(String label, String address) {
        super(label);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("EmailAddress{label='%s', address='%s'}", getLabel(), address);
    }
}
