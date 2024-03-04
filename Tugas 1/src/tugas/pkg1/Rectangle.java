/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.pkg1;

/**
 *
 * @author Lenovo
 */
class Rectangle extends Polygon {
    private double length, width;

    public Rectangle(double length, double width) {
        super(4);
        this.length = length;
        this.width = width;
}
    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
