/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.latihan.model.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import org.latihan.model.UserTab;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author gel
 */
@Repository("UserDao")
public class UserDao {
    @Autowired
    private SessionFactory sessionFactory;

    public void save (UserTab userTab){
    sessionFactory.getCurrentSession().saveOrUpdate(userTab);

    }

    public void delete (UserTab userTab){
    sessionFactory.getCurrentSession().delete(userTab);
    }

    public List<UserTab> getUserTabs(){
    return sessionFactory.getCurrentSession().createQuery("from UserTab").list();
    }

    public UserTab getUserTab(String userName){
    return (UserTab) sessionFactory.getCurrentSession()
            .createQuery("from UserTab where username = :userName")
            .setParameter("username",userName)
            .uniqueResult();
    }
   public UserTab getUserTabLogin(String userName, String password){
        return (UserTab) sessionFactory.getCurrentSession()
                .createQuery("from UserTab where username = :userName"
                + "and password = :password")
                .setParameter("username", userName)
                .setParameter("password", password)
                .uniqueResult();
    }
}
