/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pooerp18;
import java.util.Scanner;
public class POOERP18 {

   public static void main(String[] args) {       
        Scanner entrada1 = new Scanner (System.in);        
        System.out.println("Ingrese el código del empleado: ");        
        int codigo = entrada1.nextInt();
        
        Scanner entrada2 = new Scanner (System.in);        
        System.out.println("Ingrese el nombre del empleado: ");        
        String nombre = entrada2.nextLine();
        
        Scanner entrada3 = new Scanner (System.in);        
        System.out.println("Ingrese las horas trabajadas al mes: ");        
        int horas_mes = entrada3.nextInt();
        
        Scanner entrada4 = new Scanner (System.in);        
        System.out.println("Ingrese el valor de la hora trabajada: ");        
        int valor_hora = entrada4.nextInt();
        
        Scanner entrada5 = new Scanner (System.in);        
        System.out.println("Ingrese el porcentaje de retencion en la fuente(1 a 100): ");        
        double por_retencion = entrada5.nextDouble();
        por_retencion = por_retencion/100;
        
        int salariobruto = horas_mes * valor_hora ;
        int retencion = (int) (salariobruto * por_retencion);
        int salarioneto = salariobruto - retencion;
        
        System.out.println("El código del empleado es: " + codigo);
        System.out.println("El nombre del empleado es: " + nombre);
        System.out.println("El salario bruto es: $" + salariobruto);
        System.out.println("El salario neto es: $"+ salarioneto);
    }
}
