package edu.miu.cs489.quiz1.model;

public class PhoneNumber extends Channel {
    private String number;

    public PhoneNumber() {
        this(null, null);
    }

    public PhoneNumber(String label, String number) {
        super(label);
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return String.format("PhoneNumber{label='%d', number='%d'}", getLabel(), number);
    }
}
