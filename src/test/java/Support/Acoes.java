package Support;

import Pages.DriverWeb;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Pages.Leftnavmenu.TABLE_SORT_POSITION_0;
import static Pages.URL.MAIN_PAGE;

public interface Acoes{

    default void escrever(By elemento, String texto){
        DriverWeb.getDriver().findElement(elemento).sendKeys(texto);
    }

    default void click(By elemento){
       DriverWeb.getDriver().findElement(elemento).click();
    }

    default void esperarElementoExistirEmTela(By elemento,int timeout){
        WebDriverWait wait = new WebDriverWait(DriverWeb.getDriver(),timeout);
        wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));
    }

    default String pegarTextoDoElemento(By elemento){
        String texto = DriverWeb.getDriver().findElement(elemento).getText();
        return texto;
    }
    default  void validarQueTextoEstaIgual(By elemento,String texto){
        String nome = pegarTextoDoElemento(TABLE_SORT_POSITION_0);
        Assert.assertEquals(nome,texto);

    }

    //default void abrirURL(){
      //  DriverWeb.getDriver().get(MAIN_PAGE);
    //}
}
