package pe.edu.cibertec.javaadv.mod4.spring;

import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.cibertec.javaadv.mod4.spring.logger.Logger;

/**
 * Created by IntelliJ IDEA. User: xaoc Date: 30.11.11 Time: 17:23
 */
public class Runner implements IRunner {

    private IBean1 bean1;
    @Logger
    private Log log;

    @Override
    public void run() {
        log.info(bean1.hello("world"));
    }

    @Autowired
    @Override
    public void setBean1(IBean1 bean1) {
        this.bean1 = bean1;
    }
}
