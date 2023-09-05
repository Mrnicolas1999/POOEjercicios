/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pooep21;

import java.util.Scanner;
public class POOEP21 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el lado 1: ");
        double lado1 = entrada.nextDouble();

        System.out.println("Ingrese el lado 2: ");
        double lado2 = entrada.nextDouble();

        System.out.println("Ingrese el lado 3: ");
        double lado3 = entrada.nextDouble();
        
            double perimetro = lado1 + lado2 + lado3;
            double semiperimetro = perimetro / 2;
            
            double area = Math.sqrt(semiperimetro*(semiperimetro-lado1)*(semiperimetro-lado2)*(semiperimetro-lado3));            

            System.out.println("El perimetro es: " + perimetro);
            System.out.println("El semiperimetro es: " + semiperimetro);
            System.out.println("El área del triángulo es: " + area);        
    }
}
