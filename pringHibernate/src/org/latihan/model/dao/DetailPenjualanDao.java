/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.latihan.model.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import org.latihan.model.TbDetailPenjualan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author gel
 */
@Repository
public class DetailPenjualanDao {
@Autowired

private SessionFactory sessionFactory;
public List<TbDetailPenjualan> getDetailPenjualans (){
    return sessionFactory.getCurrentSession().createQuery("from TbPenjualan").list();
    }

}
