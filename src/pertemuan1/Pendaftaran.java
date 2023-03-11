/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan1;

/**
 *
 * @author Abennaya
 */
public class Pendaftaran {
    public static void main(String[] args) {
        Mahasiswa mhs =new Mahasiswa();
        mhs.nama ="Farel";
        mhs.nobp="2101092047";
        mhs.kelas="2B";
        mhs.prodi="MI";
        mhs.jurusan="TI";
        
        System.out.print("nama : "+mhs.nama+ "\n"
        +"nobp:"+mhs.nobp+"\n"
        +"jurusan :"+mhs.jurusan+"\n"
        +"Prodi :"+mhs.prodi+"\n" 
        +"Kelas :"+mhs.kelas+"\n");
    }
}
