/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.pkg1;

/**
 *
 * @author Lenovo
 */
class Triangle extends Polygon {
    private double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) {
        super(3);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
}
    @Override
    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}
