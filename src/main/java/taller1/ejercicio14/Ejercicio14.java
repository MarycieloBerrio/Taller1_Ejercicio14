/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package taller1.ejercicio14;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        
       double X, cubo, cuadrado;
       Scanner N = new Scanner(System.in);
       
       System.out.println("Ingrese un número");
       X = N.nextDouble();
       
       cubo = Math.pow(X, 3);
       cuadrado = Math.pow(X, 2);
       
        System.out.println("El cubo de " + X + " es " + cubo);
        System.out.println("El cuadrado de " + X + " es " + cuadrado);
        
    }
}
