/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UjiCoba;

/**
 *
 * @author Lenovo
 */
public class Receptionist implements Karyawan {
    protected String nama;

    public Receptionist(String nama) {
        this.nama = nama;
}
    @Override
    public void bekerja() {
        System.out.println(nama + " sedang melayani tamu sebagai seorang Receptionist.");
    }

    @Override
    public void istirahat() {
        System.out.println(nama + " sedang istirahat sebagai seorang Receptionist.");
    }

    @Override
    public void absen() {
        System.out.println(nama + " absen dari pekerjaan sebagai seorang Receptionist.");
    }
}
