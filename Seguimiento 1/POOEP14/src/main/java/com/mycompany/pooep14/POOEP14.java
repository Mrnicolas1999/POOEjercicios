/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pooep14;

import java.util.Scanner;
public class POOEP14 {
        public static void main(String[] args) {        
            Scanner entrada = new Scanner (System.in);

            System.out.println("Ingrese el numero: ");        
            double numero = entrada.nextDouble();

            double cuadrado = Math.pow(numero, 2);
            double cubo = Math.pow(numero, 3);

            System.out.println("El cuadrado de "+ numero + "es: " + cuadrado);
            System.out.println("El cubo de "+ numero + "es: " + cubo);        
        }
}

