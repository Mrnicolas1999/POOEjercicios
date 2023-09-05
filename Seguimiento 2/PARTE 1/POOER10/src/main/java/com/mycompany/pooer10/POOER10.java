/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pooer10;

import java.util.Scanner;

public class POOER10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de inscripción: ");
        String NI = entrada.nextLine();
        
        System.out.println("Ingrese el nombre: ");
        String NOM = entrada.nextLine();
        
        System.out.println("Ingrese el patrimonio: ");
        double PAT = entrada.nextDouble();
        
        System.out.println("Ingrese el estrato social: ");
        int EST = entrada.nextInt();
        
        int PAGMAT = 50000;
        
        if (PAT > 2000000 && EST > 3) {
            PAGMAT = PAGMAT + (int) (0.03 * PAT);
        }
        
        System.out.println("El estudiante con numero de inscripcion: " + NI + " y nombre: " + NOM + " debe pagar: $" + PAGMAT);
    }
}
