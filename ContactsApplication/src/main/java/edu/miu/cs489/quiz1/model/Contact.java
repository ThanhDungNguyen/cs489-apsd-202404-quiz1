package edu.miu.cs489.quiz1.model;

public class Contact {
    private String firstName;
    private String lastName;
    private String company;
    private String jobTitle;

    public Contact() {
        this(null, null, null, null);
    }

    public Contact(String firstName, String lastName, String company, String jobTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.jobTitle = jobTitle;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return String.format("Contact{firstName='%s', lastName='%s', company='%s', jobTitle='%s'}",
                firstName, lastName, company, jobTitle);
    }
}
