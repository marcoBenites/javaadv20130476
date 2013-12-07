/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.util;

import java.io.IOException;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 *
 * @author JAVA-ADV
 */
@ApplicationScoped
public class SqlSessionFactoryProducer {

    private SqlSessionFactory sqlSessionFactory;

    @PostConstruct
    public void init() {
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader("META-INF/mybatis.xml");
            this.sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(SqlSessionFactoryProducer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Produces
    @ApplicationScoped
    public SqlSessionFactory getSqlSessionFactory() {
        return this.sqlSessionFactory;
    }
}
