/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.latihan.model.dao.service;

import java.util.List;

import org.latihan.model.UserTab;

/**
 *
 * @author gel
 */
public interface  SecurityService {
    public void saveUserTab (UserTab userTab);
    public void deleteUserTab(UserTab userTab);
    public List<UserTab> getUserTab();
    public UserTab getUserTab(String userName);
    public UserTab getUserTabLogin (String userName, String password);
    
}
