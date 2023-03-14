/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author Abennaya
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Transaksi {
    public static void main(String[] args) {
        Kasir K = new Kasir();
        Kasir K1 = new Kasir();
        Kasir K2 = new Kasir();
        char c = 0;
        int byr = 0;
        int jml = 0;
        int total = 0;
        int kmbl = 0;
        
        K.setNamaBarang("Rinso Premium");
        K.setHarga(20000);
        
        K1.setNamaBarang("Gula Hijau");
        K1.setHarga(50000);
        
        K2.setNamaBarang("Beras Solok Asli");
        K2.setHarga(200000);
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("============= CHANAYA SWALAYAN ============");
        System.out.println("Welcome and Happy Shopping :)");
        System.out.println("***************");
        System.out.println("==== Pilih Barang ====");
        System.out.println("1. Rinso Premium = Rp.20.000");
        System.out.println("2. Gula Hijau = Rp.50.000");
        System.out.println("3. Beras Solok ASLI= Rp.200.000");
        
        do{
            System.out.print("\nSilahkan Pilih Barang yang akan dibeli : ");
            int pil = sc.nextInt();
            switch(pil){
                case 1 :  System.out.println("==== RINSO PREMIUM ====\n");
                          System.out.println("Nama Barang = "+K.getNamaBarang());
                          System.out.println("Harga = "+K.getHarga());
                          System.out.print("Masukkan Jumlah Barang = ");
                          jml = sc.nextInt();
                          K.setJmlBarang(jml);
                          total = K.getHarga() * K.getJmlBarang();
                          System.out.println("Total Bayar = "+total);
                          System.out.print("Masukkan Jumlah Bayar Anda = ");
                          byr = sc.nextInt();
                          K.setBayar(byr);
                          kmbl = K.getBayar() - total;
                          System.out.println("Kembalian = "+kmbl);
                          break;
                case 2 :  System.out.println("==== GULA HIJAU ====\n");
                          System.out.println("Nama Barang = "+K1.getNamaBarang());
                          System.out.println("Harga = "+K1.getHarga());
                          System.out.print("Masukkan Jumlah Barang = ");
                          jml = sc.nextInt();
                          K1.setJmlBarang(jml);
                          total = K1.getHarga() * K1.getJmlBarang();
                          System.out.println("Total Bayar = "+total);
                          System.out.print("Masukkan Jumlah Bayar Anda = ");
                          byr = sc.nextInt();
                          K1.setBayar(byr);
                          kmbl = K1.getBayar() - total;
                          System.out.println("Kembalian = "+kmbl);
                          break;
                case 3 :  System.out.println("==== BERAS SOLOK ASLI ====\n");
                          System.out.println("Nama Barang = "+K2.getNamaBarang());
                          System.out.println("Harga = "+K2.getHarga());
                          System.out.print("Masukkan Jumlah Barang = ");
                          jml = sc.nextInt();
                          K2.setJmlBarang(jml);
                          total = K2.getHarga() * K2.getJmlBarang();
                          System.out.println("Total Bayar = "+total);
                          System.out.print("Masukkan Jumlah Bayar Anda = ");
                          byr = sc.nextInt();
                          K2.setBayar(byr);
                          kmbl = K2.getBayar() - total;
                          System.out.println("Kembalian = "+kmbl);
                          break;
                default : System.out.println("Barang yang anda Pilih sedang Sold Out");
                          break;
            }
        }while(c=='Y' && c=='y');
    }
}