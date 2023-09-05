/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pooep24;
import java.util.Scanner;
public class POOEP24 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el peso de la esfera A: ");
        double A = entrada.nextDouble();
        
        System.out.println("Ingrese el peso de la esfera B: ");
        double B = entrada.nextDouble();
        
        System.out.println("Ingrese el peso de la esfera C: ");
        double C = entrada.nextDouble();
        
        if (A>B && A>C){
            System.out.print("La esfera A es la de mayor peso");
        }else if(B>A && B>C){
            System.out.print("La esfera B es la de mayor peso");
        }else{
            System.out.print("La esfera C es la de mayor peso");
        }
    }
}
