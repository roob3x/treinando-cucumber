package Steps;

import Interacao.IInteracaoSeleniumJavaWeb;
import Pages.DriverWeb;
import Pages.Leftnavmenu;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

import static Pages.Leftnavmenu.*;

public class SeleniumEasyStep {
    IInteracaoSeleniumJavaWeb i = new IInteracaoSeleniumJavaWeb();

    @Given("abrir home cotacao seleniumeasy")
    public void abrirHomeCotacaoSeleniumeasy() {
        // Write code here that turns the phrase above into concrete actions
        DriverWeb.abrirURL();
    }

    @Given("fechar alerta learn selenium")
    public void fecharAlertaLearnSelenium() {
        i.esperarElementoExistirEmTela(ALERT_LEARN_SELENIUM,10);
        i.click(ALERT_LEARN_SELENIUM);

    }

    @Given("acessar menu list table sort")
    public void acessarMenuListTableSort() {
        // Write code here that turns the phrase above into concrete actions
        i.click(MENU_LIST_TABLE);
        i.esperarElementoExistirEmTela(MENU_LIST_TABLE_SORT,10);
        i.click(MENU_LIST_TABLE_SORT);
    }

    @Then("validar que a primeira posicao contem {string}")
    public void validarQueAPrimeiraPosicaoContem(String texto) {
        i.validarQueTextoEstaIgual(TABLE_SORT_POSITION_0,texto);
    }
}
