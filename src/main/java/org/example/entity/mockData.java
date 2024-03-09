package org.example.entity;

import com.github.javafaker.Faker;
import org.openqa.selenium.support.PageFactory;

import java.util.Locale;

public class mockData {
    public static Faker faker = new Faker(new Locale("En"));

    public static String createUserName() {
        return faker.name().firstName();
    }

    public static String createLastName() {
        return faker.name().lastName();
    }

    public static String createEmail() {
        return faker.internet().emailAddress();
    }

    public static String createNumber() {
        return faker.number().digits(10);
    }

    public static String createCurrentAddress() {
        return faker.address().fullAddress();
    }

}
