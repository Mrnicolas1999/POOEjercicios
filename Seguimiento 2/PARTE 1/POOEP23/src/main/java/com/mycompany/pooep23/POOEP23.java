/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pooep23;
import java.util.Scanner;

public class POOEP23 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese A: ");
        int A = entrada.nextInt();
        
        System.out.println("Ingrese B: ");
        int B = entrada.nextInt();
        
        System.out.println("Ingrese C: ");
        int C = entrada.nextInt();
        
        double raiz = Math.pow(B, 2) - 4 * A * C;
        double Solucion = 0;
        
        if (raiz < 0) {
            System.out.println("No hay soluciones reales."); // porque la raiz no puede ser cero
        } else if (raiz == 0) {
            Solucion = -B / (2 * A);
            System.out.println("La solución es: " + Solucion);
        } else {
            double Solucion1 = (-B + Math.sqrt(raiz)) / (2 * A);
            double Solucion2 = (-B - Math.sqrt(raiz)) / (2 * A);
            System.out.println("Las posibles soluciones son: " + Solucion1 + " y " + Solucion2);
        }
    }
}