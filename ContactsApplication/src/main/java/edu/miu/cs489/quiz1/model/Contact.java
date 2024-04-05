package edu.miu.cs489.quiz1.model;

import java.util.ArrayList;
import java.util.List;

public class Contact {
    private String firstName;
    private String lastName;
    private String company;
    private String jobTitle;
    private List<PhoneNumber> phoneNumbers;
    private List<EmailAddress> emailAddresses;

    public Contact() {
        this(null, null, null, null);
    }

    public Contact(String firstName, String lastName, String company, String jobTitle) {
        this(firstName, lastName, company, jobTitle, null, null);
    }

    public Contact(String firstName, String lastName, String company, String jobTitle, List<PhoneNumber> phoneNumbers, List<EmailAddress> emailAddresses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.jobTitle = jobTitle;
        addPhoneNumbers(phoneNumbers);
        addEmailAddresses(emailAddresses);
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

    public void addPhoneNumber(PhoneNumber phoneNumber) {
        if (phoneNumber != null) {
            if (this.phoneNumbers == null) {
                this.phoneNumbers = new ArrayList<>();
            }
            this.phoneNumbers.add(phoneNumber);
        }
    }

    public void addPhoneNumbers(List<PhoneNumber> phoneNumbers) {
        if (phoneNumbers != null && phoneNumbers.isEmpty() == false) {
            if (this.phoneNumbers == null) {
                this.phoneNumbers = new ArrayList<>();
            }
            phoneNumbers.stream().forEach(p -> addPhoneNumber(p));
        }
    }

    public void removePhoneNumber(PhoneNumber phoneNumber) {
        if (phoneNumber != null) {
            if (this.phoneNumbers == null) {
                this.phoneNumbers = new ArrayList<>();
            }
            this.phoneNumbers.remove(phoneNumber);
        }
    }

    public void addEmailAddress(EmailAddress emailAddress) {
        if (emailAddress != null) {
            if (this.emailAddresses == null) {
                this.emailAddresses = new ArrayList<>();
            }
            this.emailAddresses.add(emailAddress);
        }
    }

    public void addEmailAddresses(List<EmailAddress> emailAddresses) {
        if (emailAddresses != null && emailAddresses.isEmpty() == false) {
            if (this.emailAddresses == null) {
                this.emailAddresses = new ArrayList<>();
            }
            emailAddresses.stream().forEach(e -> addEmailAddress(e));
        }
    }

    public void removeEmailAddress(EmailAddress emailAddress) {
        if (emailAddress != null) {
            if (this.emailAddresses == null) {
                this.emailAddresses = new ArrayList<>();
            }
            this.emailAddresses.remove(emailAddress);
        }
    }

    @Override
    public String toString() {
        return String.format("Contact{firstName='%s', lastName='%s', company='%s', jobTitle='%s'}",
                firstName, lastName, company, jobTitle);
    }

    public String toJSON() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{");
        if (phoneNumbers != null) {
            for (int i = 0; i < phoneNumbers.size(); i++) {
                stringBuilder.append(phoneNumbers.get(i).toJSON());
                if (i < (phoneNumbers.size() - 1))
                    stringBuilder.append(",");
            }
        }
        stringBuilder.append("}");
        String phoneNumbersJSON = stringBuilder.toString();

        stringBuilder.delete(0, stringBuilder.toString().length());
        stringBuilder.append("{");
        if (emailAddresses != null) {
            for (int i = 0; i < emailAddresses.size(); i++) {
                stringBuilder.append(emailAddresses.get(i).toJSON());
                if (i < (emailAddresses.size() - 1))
                    stringBuilder.append(",");
            }
        }
        stringBuilder.append("}");
        String emailAddressesJSON = stringBuilder.toString();

        return String.format("{\"firstName\"=\"%s\", \"lastName\"=\"%s\", \"company\"=\"%s\", \"jobTitle\"=\"%s\", \"phoneNumbers\":%s, \"emailAddress\":%s}",
                firstName, lastName, company, jobTitle, phoneNumbersJSON, emailAddressesJSON);
    }
}
