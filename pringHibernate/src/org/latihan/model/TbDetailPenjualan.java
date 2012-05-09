/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.latihan.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author gel
 */
@Entity
@Table(name = "tb_detail_penjualan")
@NamedQueries({
    @NamedQuery(name = "TbDetailPenjualan.findAll", query = "SELECT t FROM TbDetailPenjualan t"),
    @NamedQuery(name = "TbDetailPenjualan.findByIdDetail", query = "SELECT t FROM TbDetailPenjualan t WHERE t.idDetail = :idDetail"),
    @NamedQuery(name = "TbDetailPenjualan.findByNoPenjualan", query = "SELECT t FROM TbDetailPenjualan t WHERE t.noPenjualan = :noPenjualan"),
    @NamedQuery(name = "TbDetailPenjualan.findByQty", query = "SELECT t FROM TbDetailPenjualan t WHERE t.qty = :qty"),
    @NamedQuery(name = "TbDetailPenjualan.findBySubDetail", query = "SELECT t FROM TbDetailPenjualan t WHERE t.subDetail = :subDetail")})
public class TbDetailPenjualan implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_detail")
    private Integer idDetail;

    @Basic(optional = false)
    @ManyToOne
    @JoinColumn(name="no_penjualan",nullable=false)
    private TbPenjualan tbPenjualan;

    @ManyToOne
    @JoinColumn(name="kd_barang",nullable=false)
    private TbBarang tbBarang;

    @Column(name = "qty")
    private Integer qty;
    @Column(name = "sub_detail")
    private String subDetail;

    public TbDetailPenjualan() {
    }

    public TbDetailPenjualan(Integer idDetail) {
        this.idDetail = idDetail;
    }

    public TbDetailPenjualan(Integer idDetail, TbBarang noPenjualan) {
        this.idDetail = idDetail;
        this.tbBarang = noPenjualan;
    }

    public Integer getIdDetail() {
        return idDetail;
    }

    public void setIdDetail(Integer idDetail) {
        this.idDetail = idDetail;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public String getSubDetail() {
        return subDetail;
    }

    public void setSubDetail(String subDetail) {
        this.subDetail = subDetail;
    }

    public TbBarang getTbBarang() {
        return tbBarang;
    }

    public void setTbBarang(TbBarang tbBarang) {
        this.tbBarang = tbBarang;
    }

    public TbPenjualan getTbPenjualan() {
        return tbPenjualan;
    }

    public void setTbPenjualan(TbPenjualan tbPenjualan) {
        this.tbPenjualan = tbPenjualan;
    }


    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDetail != null ? idDetail.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbDetailPenjualan)) {
            return false;
        }
        TbDetailPenjualan other = (TbDetailPenjualan) object;
        if ((this.idDetail == null && other.idDetail != null) || (this.idDetail != null && !this.idDetail.equals(other.idDetail))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.latihan.model.TbDetailPenjualan[idDetail=" + idDetail + "]";
    }

}
