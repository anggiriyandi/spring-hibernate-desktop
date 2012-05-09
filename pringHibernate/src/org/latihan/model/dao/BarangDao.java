/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.latihan.model.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import org.latihan.model.TbBarang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author gel
 */

@Repository("BarangDao")
public class BarangDao {
    @Autowired
     private SessionFactory sessionFactory;

     public List<TbBarang> getbarangs(){
     return sessionFactory.getCurrentSession().createQuery("from TbBarang").list();
     }
}
