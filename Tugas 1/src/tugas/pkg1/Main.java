/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas.pkg1;

/**
 *
 * @author Lenovo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // Create instances of different shapes
            Circle circle = new Circle(5);
            Triangle triangle = new Triangle(3, 4, 5);
            Rectangle rectangle = new Rectangle(4, 6);

            // Calculate and display areas and perimeters
            System.out.println("Circle:");
            System.out.println("Area: " + circle.calculateArea());
            System.out.println("Perimeter: " + circle.calculatePerimeter());

            System.out.println("\nTriangle:");
            System.out.println("Area: " + triangle.calculateArea());
            System.out.println("Perimeter: " + triangle.calculatePerimeter());

            System.out.println("\nRectangle:");
            System.out.println("Area: " + rectangle.calculateArea());
            System.out.println("Perimeter: " + rectangle.calculatePerimeter());

            // Trying to create a triangle with invalid side lengths
            Triangle invalidTriangle = new Triangle(1, 2, 10);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
    
}
