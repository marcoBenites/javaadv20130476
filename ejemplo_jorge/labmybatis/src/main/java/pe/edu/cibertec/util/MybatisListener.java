/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.util;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 *
 * @author JAVA-ADV
 */
@WebListener()
public class MybatisListener implements ServletContextListener {

    @Inject
    SqlSessionFactory sf;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        Logger.getAnonymousLogger().log(Level.INFO, sf.toString());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
}
