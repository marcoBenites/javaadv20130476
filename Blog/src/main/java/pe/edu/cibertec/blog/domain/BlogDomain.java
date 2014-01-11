/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.blog.domain;

import java.util.List;

/**
 *
 * @author JAVA-ADV
 */
public interface BlogDomain {

    List<BlogEntry> getEntries(String usuer);

    void addEntry(String usuer, BlogEntry entry);

}
