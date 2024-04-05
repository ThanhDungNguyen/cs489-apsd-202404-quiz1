package edu.miu.cs489.quiz1;

import edu.miu.cs489.quiz1.model.Contact;
import edu.miu.cs489.quiz1.model.EmailAddress;
import edu.miu.cs489.quiz1.model.PhoneNumber;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var contacts = List.of(
                new Contact("David", "Sanger", "Argos LLC", "Sale Manager",
                        List.of(new PhoneNumber("Home", "240-133-0011"),
                                new PhoneNumber("Mobile", "240-112-0123")),
                        List.of(new EmailAddress("Home", "dave.sang@gmail.com"),
                                new EmailAddress("Work", "dsanger@argos.com"))),
                new Contact("Carlos", "Jimenez", "Zappos", "Director"),
                new Contact("Ali", "Gafar", "BMI Services", "HR Manager",
                        List.of(new PhoneNumber("Work", "412-116-9988")),
                        List.of(new EmailAddress("Work", "ali@bmi.com")))
        );
        contacts.stream()
                .sorted(Comparator.comparing(Contact::getLastName))
                .forEach(c -> System.out.println(c.toJSON()));
    }
}
