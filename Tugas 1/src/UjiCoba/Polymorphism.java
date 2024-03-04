/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UjiCoba;

/**
 *
 * @author Lenovo
 */
public class Polymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Manager manager = new Manager("John") {
                @Override
                public void rapat() {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

                @Override
                public void absen() {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }
            };
            Receptionist receptionist = new Receptionist("Alice");
            Security security = new Security("Bob");

            // Polymorphism
            Karyawan karyawan1 = manager;
            Karyawan karyawan2 = receptionist;
            Karyawan karyawan3 = security;

            // Memanggil method sesuai dengan jenis karyawan
            karyawan1.bekerja();
            karyawan1.istirahat();
            manager.rapat(); // Method khusus untuk Manager

            karyawan2.bekerja();
            karyawan2.istirahat();
            karyawan2.absen();

            karyawan3.bekerja();
            karyawan3.istirahat();
            karyawan3.absen();
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
