/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pooer12;
public class POOER12 {

    public static void main(String[] args) {
        int horassemana, salarioporhora, salariobruto, salarioneto, retencion;
        double porcentajeretencion;
        
        horassemana = 48;
        salarioporhora = 5000;
        porcentajeretencion = 0.125;
        
        salariobruto = horassemana * salarioporhora * 4;
        retencion = (int) (salariobruto * porcentajeretencion);
        salarioneto = salariobruto - retencion;
        
        System.out.println("El salario bruto es: $" + salariobruto);
        System.out.println("El salario neto es: $"+salarioneto);
        System.out.println("La retencion de la fuente es de: $"+retencion);
    }
}
