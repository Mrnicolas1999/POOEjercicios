/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pooer14;
import java.util.Scanner;
public class POOER14 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ventas del departamento 1: ");
        double VD1 = entrada.nextDouble();

        System.out.println("Ventas del departamento 2: ");
        double VD2 = entrada.nextDouble();

        System.out.println("Ventas del departamento 3: ");
        double VD3 = entrada.nextDouble();

        System.out.println("Salario: ");
        double SALAR = entrada.nextDouble();

        double TOTVEN = VD1 + VD2 + VD3;
        double PORVEN = 0.33 * TOTVEN;
        double SALAR1 = 0;
        double SALAR2 = 0;
        double SALAR3 = 0;

        if (VD1 > PORVEN){
            SALAR1 = SALAR + (0.2*SALAR);
        }else{
            SALAR1 = SALAR;
        }

        if (VD2 > PORVEN){
            SALAR2= SALAR + (0.2*SALAR);
        }else{
            SALAR2 = SALAR;
        }

        if (VD3 > PORVEN){
            SALAR3 = SALAR + (0.2*SALAR);
        }else{
            SALAR3=SALAR;
        }

        System.out.println("Salario vendedores departamento 1: $"+SALAR1+" Salario vendedores depto 2: "+SALAR2+" Salario vendedores depto 3: $"+SALAR3);
    }

}
