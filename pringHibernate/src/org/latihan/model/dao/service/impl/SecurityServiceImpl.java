/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.latihan.model.dao.service.impl;

import java.util.List;

import org.latihan.model.UserTab;
import org.latihan.model.dao.BarangDao;
import org.latihan.model.dao.CustomerDao;
import org.latihan.model.dao.UserDao;
import org.latihan.model.dao.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author gel
 */
@Service("SecurityService")
@Transactional(readOnly=true)
public class SecurityServiceImpl implements SecurityService{

@Autowired

    private UserDao userDao;
    private BarangDao barang;
    private CustomerDao customer;

@Transactional(readOnly=false)
public void saveUserTab(UserTab userTab) {
        userDao.save(userTab);
    }
@Transactional(readOnly=false)
    public void deleteUserTab(UserTab userTab) {
        userDao.delete(userTab);
    }

    public List<UserTab> getUserTab() {
        return userDao.getUserTabs();
    }

    public UserTab getUserTab(String userName) {
        return userDao.getUserTab(userName);
    }

    public UserTab getUserTabLogin(String userName, String Password) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
