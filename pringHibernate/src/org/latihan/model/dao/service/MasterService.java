/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.latihan.model.dao.service;

import java.util.List;
import org.latihan.model.TbBarang;
import org.latihan.model.TbCustomer;
import org.latihan.model.TbDetailPenjualan;
import org.latihan.model.TbPenjualan;


/**
 *
 * @author gel
 */
public interface  MasterService {
    public List<TbBarang> getBarang();
    public List<TbCustomer> getCustomer();
    public List<TbPenjualan> getPenjualans();
    public List<TbDetailPenjualan> getDetailPenjualans();
}
