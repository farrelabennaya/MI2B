/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
/**
 *
 * @author Abennaya
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Kasir {
    String namaBarang;
    int harga, bayar, kembalian, jmlBarang, total;
    
    public Kasir(String namabrg, int hrg, int byr, int kmbl, int jmlbrg, int ttl){
        namaBarang = namabrg;
        harga = hrg;
        bayar = byr;
        kembalian = kmbl;
        jmlBarang = jmlbrg;
        total = ttl;
        
    }

    Kasir() {
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public int getHarga() {
        return harga;
    }

    public int getBayar() {
        return bayar;
    }

    public int getKembalian() {
        return kembalian;
    }

    public int getJmlBarang() {
        return jmlBarang;
    }

    public int getTotal() {
        return total;
    }
    
    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setBayar(int bayar) {
        this.bayar = bayar;
    }

    public void setKembalian(int kembalian) {
        this.kembalian = kembalian;
    }

    public void setJmlBarang(int jmlBarang) {
        this.jmlBarang = jmlBarang;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    
    
}
