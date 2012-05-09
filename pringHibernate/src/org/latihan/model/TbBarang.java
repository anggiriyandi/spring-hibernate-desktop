/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.latihan.model;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author gel
 */
@Entity
@Table(name = "tb_barang")
@NamedQueries({
    @NamedQuery(name = "TbBarang.findAll", query = "SELECT t FROM TbBarang t"),
    @NamedQuery(name = "TbBarang.findByKdBarang", query = "SELECT t FROM TbBarang t WHERE t.kdBarang = :kdBarang"),
    @NamedQuery(name = "TbBarang.findByNama", query = "SELECT t FROM TbBarang t WHERE t.nama = :nama"),
    @NamedQuery(name = "TbBarang.findByHarga", query = "SELECT t FROM TbBarang t WHERE t.harga = :harga"),
    @NamedQuery(name = "TbBarang.findBySatuan", query = "SELECT t FROM TbBarang t WHERE t.satuan = :satuan")})
public class TbBarang implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "kd_barang")
    private Integer kdBarang;
    @Column(name = "nama")
    private String nama;
    @Column(name = "harga")
    private BigInteger harga;
    @Column(name = "satuan")
    private String satuan;

    public TbBarang() {
    }

    public TbBarang(Integer kdBarang) {
        this.kdBarang = kdBarang;
    }

    public Integer getKdBarang() {
        return kdBarang;
    }

    public void setKdBarang(Integer kdBarang) {
        this.kdBarang = kdBarang;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public BigInteger getHarga() {
        return harga;
    }

    public void setHarga(BigInteger harga) {
        this.harga = harga;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kdBarang != null ? kdBarang.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbBarang)) {
            return false;
        }
        TbBarang other = (TbBarang) object;
        if ((this.kdBarang == null && other.kdBarang != null) || (this.kdBarang != null && !this.kdBarang.equals(other.kdBarang))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.latihan.model.TbBarang[kdBarang=" + kdBarang + "]";
    }

}
