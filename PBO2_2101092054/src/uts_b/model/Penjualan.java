/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_b.model;

/**
 *
 * @author ASUS
 */
public class Penjualan {

    private String kode_pesanan;
    private String tanggal;
    private String nama_pemesan;
    private double total_bayar;
    private double ongkir;
    private double diskon;
       public Penjualan() {
    
    }

    public Penjualan(String kode_pesanan, String tanggal, String nama_pemesan, double total_bayar, double ongkir, double diskon) {
        this.kode_pesanan = kode_pesanan;
        this.tanggal = tanggal;
        this.nama_pemesan = nama_pemesan;
        this.total_bayar = total_bayar;
        this.ongkir = ongkir;
        this.diskon = diskon;
    }

    public String getKode_pesanan() {
        return kode_pesanan;
    }

    public void setKode_pesanan(String kode_pesanan) {
        this.kode_pesanan = kode_pesanan;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getNama_pemesan() {
        return nama_pemesan;
    }

    public void setNama_pemesan(String nama_pemesan) {
        this.nama_pemesan = nama_pemesan;
    }

    public double getTotal_bayar() {
        return total_bayar;
    }

    public void setTotal_bayar(double total_bayar) {
        this.total_bayar = total_bayar;
    }

    public double getOngkir() {
        return ongkir;
    }

    public void setOngkir(double ongkir) {
        this.ongkir = ongkir;
    }

    public double getDiskon() {
        return diskon;
    }

    public void setDiskon(double diskon) {
        this.diskon = diskon;
    }
}
