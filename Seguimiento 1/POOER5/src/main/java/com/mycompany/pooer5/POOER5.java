/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pooer5;

public class POOER5 {

    public static void main(String[] args) {
        double suma = 0;
        double X = 20;
        suma = suma + X;
        int Y = 40;
        double cuadradoY = (double) Math.pow(Y, 2);
        
        X = X+cuadradoY;
        suma = suma + (X/Y);
        System.out.println("El valor de la suma es: "+ suma);
    }
}
