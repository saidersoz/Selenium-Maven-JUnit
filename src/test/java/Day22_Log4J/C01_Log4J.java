package Day22_Log4J;

import Utilities.TestBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class C01_Log4J extends TestBase {

    //Logger object oluştur.
    private static Logger logger = LogManager.getLogger(C01_Log4J.class.getName());

    @Test
    public void log4jTest() {
        //Logger fonksiyonuyla istenilen fonksiyonu kullan
        logger.debug("Debug logger");
        logger.info("Info logger");
        logger.error("Error logger");
        logger.fatal("Fatal logger");
    }
}
