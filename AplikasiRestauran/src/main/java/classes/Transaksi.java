/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;

public class Transaksi {
    private String noTransaksi;
    private String namaPemesanan;
    private String tanggal;
    private String noMeja;
    private ArrayList<Pesanan> pesanan;
    private double uangBayar;
    private double pajak;
    private double totalbayar;
            
    public Transaksi(String no_transaksi, String nm_pemesan, String tanggal, String no_meja) {}
    
    public void tambahPesanan(Pesanan pesanan) {}
    
    public ArrayList<Pesanan> getSemuaPesanan() { return null; }
    
    public double hitungTotalBayar() { return 0; }
    
    public double hitungKembalian() { return 0; }
    
    public void cetakStruk() {}
}
    