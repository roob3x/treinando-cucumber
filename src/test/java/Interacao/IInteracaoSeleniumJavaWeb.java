package Interacao;

import Pages.DriverWeb;
import Support.Acoes;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;

import java.time.LocalDate;

public class IInteracaoSeleniumJavaWeb implements Acoes {
    Log logger = LogFactory.getLog(IInteracaoSeleniumJavaWeb.class);
    public IInteracaoSeleniumJavaWeb(){
        if(DriverWeb.getDriver() == null){
            logger.warn("-- DriverWeb ainda nao foi iniciado");
            Assert.fail(LocalDate.now()+ "Teste falhado com o: ");
        }
    }
}
