package br.com.automacaodozero;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class TestRegisterTest extends BaseTest {

    @Test
    public void TC_001_CadastroUsuarioComDadosValidosComSucesso() {
        RegisterPO register = new RegisterPO(driver);
        LoginPO login = new LoginPO(driver);
        login.registerButtonLogin();
        register.inputEmail("@gmail.com");
        register.inputName();
        register.registerPassword();
        register.registerPasswordConfirm("R@nD0M#$");
        register.registerSubmit();
        Assertions.assertTrue(register.textConfirm("foi criada com sucesso"));

    }

    @Test
    public void TC_002_CadastroDeUsuarioComEmailInvalido() {
        RegisterPO register = new RegisterPO(driver);
        LoginPO login = new LoginPO(driver);
        login.registerButtonLogin();
        register.inputEmail("gmail.com");
        register.inputName();
        register.registerPassword();
        register.registerPasswordConfirm("R@nD0M#$");
        register.registerSubmit();
        Assertions.assertEquals("Formato inválido",
                driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/div[2]/p")).getText());
    }

   @Test
    public void TC_003_CadastroDeUsuarioComNomeInvalido() {
        RegisterPO register = new RegisterPO(driver);
        LoginPO login = new LoginPO(driver);
        login.registerButtonLogin();
        register.inputEmail("@gmail.com");
        register.inputNameFail();
        register.registerPassword();
        register.registerPasswordConfirm("R@nD0M#$");
        register.registerSubmit();
        Assertions.assertTrue(register.textConfirm("Formato inválido"));
    }

   @Test
    public void TC_004_CadastroComNomeVazio() {
        RegisterPO register = new RegisterPO(driver);
        LoginPO login = new LoginPO(driver);
        login.registerButtonLogin();
        register.inputEmail("@gmail.com");
        register.registerPassword();
        register.registerPasswordConfirm("R@nD0M#$");
        register.registerSubmit();
        waiting();
        Assertions.assertEquals("Nome não pode ser vazio.",
                driver.findElement(By.xpath("//*[@id=\"modalText\"]")).getText());
    }

   @Test
    public void TC_005_CadastroComEmailVazio() {
        RegisterPO register = new RegisterPO(driver);
        LoginPO login = new LoginPO(driver);
        login.registerButtonLogin();
        register.inputName();
        register.registerPassword();
        register.registerPasswordConfirm("R@nD0M#$");
        register.registerSubmit();
        waiting();
        Assertions.assertEquals("É campo obrigatório",
                driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/div[2]/p")).getText());
    }

   @Test
    public void TC_006_CadastroComSenhaVazia() {
        RegisterPO register = new RegisterPO(driver);
        LoginPO login = new LoginPO(driver);
        login.registerButtonLogin();
        register.inputEmail("@gmail.com");
        register.inputName();
        register.registerPasswordConfirm("R@nD0M#$");
        register.registerSubmit();
        waiting();
        Assertions.assertEquals("É campo obrigatório",
                driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/div[4]/div/p")).getText());
    }

    @Test
    public void TC_007_CadastroComConfirmacaoDeSenhaVazia() {
        RegisterPO register = new RegisterPO(driver);
        LoginPO login = new LoginPO(driver);
        login.registerButtonLogin();
        register.inputEmail("@gmail.com");
        register.inputName();
        register.registerPassword();
        register.registerSubmit();
        waiting();
        Assertions.assertEquals("É campo obrigatório",
                driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/div[5]/div/p")).getText());
    }

    @Test
    public void TC_008_CadastroComConfirmacaoDeSenhaDiferente() {
        RegisterPO register = new RegisterPO(driver);
        LoginPO login = new LoginPO(driver);
        login.registerButtonLogin();
        register.inputEmail("@gmail.com");
        register.inputName();
        register.registerPassword();
        register.registerPasswordConfirm("diferente");
        register.registerSubmit();
        waiting();
        Assertions.assertEquals("As senhas não são iguais.",
                driver.findElement(By.xpath("//*[@id=\"modalText\"]")).getText());
    }

    @Test
    public void TC_009_CadastroComEmailExistente() {
        RegisterPO register = new RegisterPO(driver);
        LoginPO login = new LoginPO(driver);
        login.registerButtonLogin();
        register.inputEmail("@gmail.com");
        register.inputName();
        register.registerPassword();
        register.registerPasswordConfirm("R@nD0M#$");
        waiting();
        register.balanceButton();
        register.registerSubmit();
        waiting();
        Assertions.assertEquals("Email ja cadastrado",
                driver.findElement(By.xpath("//*[@id=\"modalText\"]")).getText());
    }

   @Test
     public void TC_010_VerificarOcultacaoDeSenha() {
         RegisterPO register = new RegisterPO(driver);
         LoginPO login = new LoginPO(driver);
         login.registerButtonLogin();
         register.registerPassword();
         register.registerPasswordConfirm("R@nD0M#$");
         waiting();
         register.iconEye();
         waiting();
         Assertions.assertTrue(register.confirmEyes());
    }
}
