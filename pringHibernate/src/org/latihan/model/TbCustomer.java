/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.latihan.model;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author gel
 */
@Entity
@Table(name = "tb_customer")
@NamedQueries({
    @NamedQuery(name = "TbCustomer.findAll", query = "SELECT t FROM TbCustomer t"),
    @NamedQuery(name = "TbCustomer.findByKodeCust", query = "SELECT t FROM TbCustomer t WHERE t.kodeCust = :kodeCust"),
    @NamedQuery(name = "TbCustomer.findByNama", query = "SELECT t FROM TbCustomer t WHERE t.nama = :nama"),
    @NamedQuery(name = "TbCustomer.findByAlamat", query = "SELECT t FROM TbCustomer t WHERE t.alamat = :alamat"),
    @NamedQuery(name = "TbCustomer.findByNotelp", query = "SELECT t FROM TbCustomer t WHERE t.notelp = :notelp"),
    @NamedQuery(name = "TbCustomer.findByContactPerson", query = "SELECT t FROM TbCustomer t WHERE t.contactPerson = :contactPerson")})
public class TbCustomer implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "kode_cust")
    private Integer kodeCust;
    @Column(name = "nama")
    private String nama;
    @Column(name = "alamat")
    private String alamat;
    @Column(name = "notelp")
    private String notelp;
    @Column(name = "contactPerson")
    private String contactPerson;

    @OneToMany (mappedBy="tbCustomer",targetEntity=TbPenjualan.class,fetch=FetchType.LAZY)

    private Set<TbPenjualan> tbPenjualans;

    public TbCustomer() {
    }

    public TbCustomer(Integer kodeCust) {
        this.kodeCust = kodeCust;
    }

    public Integer getKodeCust() {
        return kodeCust;
    }

    public void setKodeCust(Integer kodeCust) {
        this.kodeCust = kodeCust;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNotelp() {
        return notelp;
    }

    public void setNotelp(String notelp) {
        this.notelp = notelp;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kodeCust != null ? kodeCust.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbCustomer)) {
            return false;
        }
        TbCustomer other = (TbCustomer) object;
        if ((this.kodeCust == null && other.kodeCust != null) || (this.kodeCust != null && !this.kodeCust.equals(other.kodeCust))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.latihan.model.TbCustomer[kodeCust=" + kodeCust + "]";
    }

}
