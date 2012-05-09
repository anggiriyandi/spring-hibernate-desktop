/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.latihan.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



/**
 *
 * @author gel
 */
@Entity
@Table(name="t_usertab")
public class UserTab implements Serializable {
    @Id
    @Column
    private String username;
    private  String password;
    private String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
