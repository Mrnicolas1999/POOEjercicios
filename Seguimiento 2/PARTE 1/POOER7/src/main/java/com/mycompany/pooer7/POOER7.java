/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pooer7;
import java.util.Scanner;
public class POOER7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el numero A: ");
        double A = entrada.nextDouble();
        
        System.out.println("Ingrese el numero B: ");
        double B = entrada.nextDouble();
        
        if (A > B){
            System.out.println("A es mayor que B");
        } else if (A == B) {
            System.out.println("A es igual a B");
        } else if (A < B) {
            System.out.println("A es menor que B");
        }
    }
}
