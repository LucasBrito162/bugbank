package br.com.automacaodozero;

import org.openqa.selenium.WebDriver;

import com.github.javafaker.Faker;

public class BasePO {
    protected final WebDriver driver;
    protected final Faker faker;
    protected final String name;
    protected final String fullName;

    public BasePO(WebDriver driver) {
        this.driver = driver;
        this.faker = new Faker();
        this.name = faker.name().firstName();
        this.fullName = faker.name().fullName();
    }
}
