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
@Table(name="tb_master_projek")

public class MasterProjekTab implements Serializable {
@Id
@Column

private String id_master_projek;
private String nama ;
private int tahun;
private String departement;
private String divisi;

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public String getDivisi() {
        return divisi;
    }

    public void setDivisi(String divisi) {
        this.divisi = divisi;
    }

    public String getId_master_projek() {
        return id_master_projek;
    }

    public void setId_master_projek(String id_master_projek) {
        this.id_master_projek = id_master_projek;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }


}
