/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.blog.domain;

import pe.edu.cibertec.blog.tools.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author JAVA-ADV
 */
@ApplicationScoped
public class BlogDomainImpl implements BlogDomain {

    Map<String, List<BlogEntry>> domain;

    @PostConstruct
    public void init() {
        domain = new HashMap<String, List<BlogEntry>>() {

            @Override
            public List<BlogEntry> get(Object key) {
                if (!super.containsKey((String) key)) {
                    super.put((String) key, new ArrayList<BlogEntry>());
                }
                return super.get(key);
            }
        };
    }

    @Override
    @Log
    public List<BlogEntry> getEntries(String usuer) {
        return domain.get(usuer);
    }

    //Existe una restricción de acceso donde el parámetro usuario
    //debe ser igual al usuario autenticado
    @Override
    @Log
    public void addEntry(String usuer, BlogEntry entry) {
        domain.get(usuer).add(entry);
    }

}
