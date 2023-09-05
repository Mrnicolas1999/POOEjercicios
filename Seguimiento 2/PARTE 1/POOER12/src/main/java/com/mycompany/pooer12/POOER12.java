/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pooer12;

import java.util.Scanner;
public class POOER12 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre del trabajador: ");
        String NOM = entrada.nextLine();
        
        System.out.println("Ingrese el numero de horas trabajadas: ");
        double NHT = entrada.nextDouble();
        
        System.out.println("Valor hora trabajada: ");
        double VHN = entrada.nextDouble();
        
        double HET = 0;
        double HEE8 = 0;
        double Salario = 0;
        
        if (NHT > 40){
            HET = NHT - 40;
                if (HET > 8){
                    HEE8 = HET - 8;
                    Salario = 40*VHN+16*VHN+HEE8*3*VHN;
                }else{
                    Salario = 40*VHN+HET*2*VHN;
                }
        }else{
            Salario = NHT*VHN;
        }
        System.out.println("El trabajador: "+NOM+" devengó: $"+Salario);
    }
}
