/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.pkg1;

/**
 *
 * @author Lenovo
 */
abstract class Polygon implements Shape {
    protected int sides;

    public Polygon(int sides) {
        this.sides = sides;
    }

    public int getSides() {
        return sides;
    }
}
