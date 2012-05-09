/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.latihan.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author gel
 */
@Entity
@Table(name = "tb_penualan")
@NamedQueries({
    @NamedQuery(name = "TbPenualan.findAll", query = "SELECT t FROM TbPenualan t"),
    @NamedQuery(name = "TbPenualan.findByNoPenjualan", query = "SELECT t FROM TbPenualan t WHERE t.noPenjualan = :noPenjualan"),
    @NamedQuery(name = "TbPenualan.findByTanggal", query = "SELECT t FROM TbPenualan t WHERE t.tanggal = :tanggal"),
    @NamedQuery(name = "TbPenualan.findByKodeCust", query = "SELECT t FROM TbPenualan t WHERE t.kodeCust = :kodeCust")})
public class TbPenjualan implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "no_penjualan")
    private Integer noPenjualan;
    @Basic(optional = false)
    @Column(name = "tanggal")
    @Temporal(TemporalType.DATE)
    private Date tanggal;

    @ManyToOne
    @JoinColumn(name="kode_cust",nullable=false)
    private TbCustomer tbCustomer;
    
    @OneToMany (mappedBy = "tbPenjualan",targetEntity = TbDetailPenjualan.class , fetch = FetchType.LAZY)
    private Set <TbDetailPenjualan> tbDetailPenjualans ;



    public TbPenjualan() {
    }

    public TbPenjualan(Integer noPenjualan) {
        this.noPenjualan = noPenjualan;
    }

    public TbPenjualan(Integer noPenjualan, Date tanggal, TbCustomer kodeCust) {
        this.noPenjualan = noPenjualan;
        this.tanggal = tanggal;
        this.tbCustomer = kodeCust;
    }

    public Integer getNoPenjualan() {
        return noPenjualan;
    }

    public void setNoPenjualan(Integer noPenjualan) {
        this.noPenjualan = noPenjualan;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public TbCustomer getKodeCust() {
        return tbCustomer;
    }

    public void setKodeCust(TbCustomer kodeCust) {
        this.tbCustomer = kodeCust;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (noPenjualan != null ? noPenjualan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbPenjualan)) {
            return false;
        }
        TbPenjualan other = (TbPenjualan) object;
        if ((this.noPenjualan == null && other.noPenjualan != null) || (this.noPenjualan != null && !this.noPenjualan.equals(other.noPenjualan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.latihan.model.TbPenualan[noPenjualan=" + noPenjualan + "]";
    }

}
