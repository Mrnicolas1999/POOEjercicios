/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pooep17;
import java.util.Scanner;
public class POOEP17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Ingrese el radio: ");
        double numero = entrada.nextDouble();
        
        double radiocuadrado =Math.pow(numero, 2); 
        
        double area = Math.PI*radiocuadrado;
        double longitud = 2 * Math.PI * numero;
        
        System.out.println("El área del circulo con radio: "+numero+"es: "+area);
        System.out.println("La longitud del circulo con radio: "+numero+"es: "+longitud);        
        
    }
}
