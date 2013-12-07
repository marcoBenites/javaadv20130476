/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.util;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 *
 * @author JAVA-ADV
 */
@RequestScoped
public class SqlSessionProducer {

    @Inject
    private SqlSessionFactory factory;
    private SqlSession sqlSession;

    @PostConstruct
    public void init() {
        sqlSession = factory.openSession();
    }

    @PreDestroy
    public void clear() {
        sqlSession.close();
    }

    @Produces
    @RequestScoped
    public SqlSession getSqlSession() {
        return sqlSession;
    }
}
