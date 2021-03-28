package Steps;

import Interacao.IInteracaoSeleniumJavaWeb;
import Pages.DriverWeb;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

import static Pages.URL.MAIN_PAGE;

public class CadastroStep {
    IInteracaoSeleniumJavaWeb i;
    WebDriver driver;
    @Given("Abrir pagina de cadastro")
    public void abrirPaginaDeCadastro() {
        DriverWeb.abrirURL();
        // Write code here that turns the phrase above into concrete actions

    }

    @Given("Preencher campo nome com {string}")
    @Given("Preencher campo idade com {string}")
    @Given("preencher campo senha {string}")
    public void preencherCampo(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("texto = "+string);
    }



    @Then("validar cadastro realizado com sucesso")
    public void validarCadastroRealizadoComSucesso() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Cadastro Realizado com sucesso!");

    }






}
