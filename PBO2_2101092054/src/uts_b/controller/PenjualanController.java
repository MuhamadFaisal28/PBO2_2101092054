/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_b.controller;

import faisal.dao.Koneksi;
import java.sql.Connection;
import uts_b.dao.PenjualanDao;
import uts_b.model.Penjualan;
import uts_b.view.FormPenjualan;

/**
 *
 * @author ASUS
 */
public class PenjualanController {
    private FormPenjualan formPenjualan;
    private Penjualan Penjualan;
    private PenjualanDao PenjulanDao;
    private Connection con;
    private Koneksi koneksi; 
}
