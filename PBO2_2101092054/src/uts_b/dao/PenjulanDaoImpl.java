/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_b.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import uts_b.model.Penjualan;

/**
 *
 * @author ASUS
 */
public class PenjulanDaoImpl {
     public void insert(Connection con, Penjualan penjualan) throws Exception{
        Koneksi k = new Koneksi();
        String sql = "insert into anggota values{?,?,?,?}";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, penjualan.getKode_pesanan());
        ps.setString(2, penjualan.getTanggal());
        ps.setString(3, penjualan.getNama_pemesan());
        ps.setDouble(4, penjualan.getTotal_bayar());
        ps.setDouble(5, penjualan.getOngkir());
        ps.setDouble(6, penjualan.getDiskon());
        ps.executeUpdate();       
    }
    
    public void update(Connection con, Penjualan penjualan) throws Exception {
        String sql =
                "update penjualan set tanggal=?, nama_pemesan=?, total_bayar=?, ongkir=?, diskon=?"
                +"where kode_pesanan=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, penjualan.getKode_pesanan());
        ps.executeUpdate();
    }
    
    public void delete(Connection con, Penjualan penjualan) throws Exception {
        String sql = "delete from penjualan"
                +"where kode_pesanan=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, penjualan.getKode_pesanan());
        ps.executeUpdate();
    }
    
    public Penjualan getPenjualan(Connection con, String kode_pesanan) throws Exception {
         String sql = "select * from penjualan"
                 +"where kode_pesanan=?";
          PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1, kode_pesanan);
          ResultSet rs = ps.executeQuery();
          Penjualan penjualan = null;
          if (rs.next()){
              penjualan = new Penjualan();
              penjualan.setKode_pesanan(rs.getString(1));
              penjualan.setTanggal(rs.getString(2));
              penjualan.setNama_pemesan(rs.getString(3));
              penjualan.setTotal_bayar(rs.getDouble(4));
              penjualan.setOngkir(rs.getDouble(5));
              penjualan.setDiskon(rs.getDouble(6));
          }
          return penjualan;
    }
    
    public List<Penjualan> getAllPenjualan(Connection con) throws Exception {
        String sql = "select * from penjualan"; 
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<Penjualan> list = new ArrayList<>();
        Penjualan penjualan = null;
        while (rs.next()){
              penjualan.setKode_pesanan(rs.getString(1));
              penjualan.setTanggal(rs.getString(2));
              penjualan.setNama_pemesan(rs.getString(3));
              penjualan.setTotal_bayar(rs.getDouble(4));
              penjualan.setOngkir(rs.getDouble(5));
              penjualan.setDiskon(rs.getDouble(6));
            list.add(penjualan);
        }
        return list;
    }
}

