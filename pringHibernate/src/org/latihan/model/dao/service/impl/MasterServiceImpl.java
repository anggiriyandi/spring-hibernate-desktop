/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.latihan.model.dao.service.impl;

import java.util.List;
import org.latihan.model.TbBarang;
import org.latihan.model.TbCustomer;
import org.latihan.model.TbDetailPenjualan;
import org.latihan.model.TbPenjualan;
import org.latihan.model.dao.BarangDao;
import org.latihan.model.dao.CustomerDao;
import org.latihan.model.dao.DetailPenjualanDao;
import org.latihan.model.dao.PenjualanDao;
import org.latihan.model.dao.service.MasterService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author gel
 */
@Service("MasterServiceImpl")
@Transactional(readOnly=true)

public class MasterServiceImpl implements MasterService {
    @Autowired
    
    private BarangDao barangDao;
    private CustomerDao customerDao;
    private PenjualanDao penjualanDao;
    private DetailPenjualanDao detailPenjualanDao;

    public List<TbBarang> getBarang() {
        return barangDao.getbarangs();
    }

    public List<TbCustomer> getCustomer() {
       return customerDao.getCustomers();
    }

    public List<TbPenjualan> getPenjualans() {
        return penjualanDao.getPenjualans() ;
    }

    public List<TbDetailPenjualan> getDetailPenjualans() {
        return detailPenjualanDao.getDetailPenjualans();
    }
}
