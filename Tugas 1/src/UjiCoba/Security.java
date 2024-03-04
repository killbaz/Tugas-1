/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UjiCoba;

/**
 *
 * @author Lenovo
 */
public class Security implements Karyawan {
    protected String nama;

    public Security(String nama) {
        this.nama = nama;
}
    @Override
    public void bekerja() {
        System.out.println(nama + " sedang menjaga keamanan sebagai seorang Security.");
    }

    @Override
    public void istirahat() {
        System.out.println(nama + " sedang istirahat sebagai seorang Security.");
    }

    @Override
    public void absen() {
        System.out.println(nama + " absen dari pekerjaan sebagai seorang Security.");
    }
}
