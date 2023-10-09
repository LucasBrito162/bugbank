package br.com.automacaodozero;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
    protected WebDriver driver;

    @BeforeEach
    public void start(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://bugbank.netlify.app/");

    }

   @AfterEach
    public void quit(){
        driver.quit();
    }

    public void waiting() {
        try {
            // Pausa a execução por 5 segundos
            Thread.sleep(300);
        } catch (InterruptedException e) {
            // Tratamento da exceção
            e.printStackTrace();
        }
    }

}
