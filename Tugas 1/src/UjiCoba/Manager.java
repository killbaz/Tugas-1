/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UjiCoba;

/**
 *
 * @author Lenovo
 */
public abstract class Manager implements Karyawan{
    protected String nama;

    public Manager(String nama) {
        this.nama = nama;
}
    @Override
    public void bekerja() {
        System.out.println(nama + " sedang bekerja sebagai seorang Manager.");
    }

    @Override
    public void istirahat() {
        System.out.println(nama + " sedang istirahat sebagai seorang Manager.");
    }

    // Abstract method
    public abstract void rapat();
}