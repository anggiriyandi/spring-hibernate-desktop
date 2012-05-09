/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.latihan.model.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import org.latihan.model.TbPenjualan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author gel
 */
@Repository
public class PenjualanDao {
@Autowired
private SessionFactory sessionFactory;

 public List<TbPenjualan> getPenjualans(){
    return sessionFactory.getCurrentSession().createQuery("from TbPenjualan").list();
    }
}
