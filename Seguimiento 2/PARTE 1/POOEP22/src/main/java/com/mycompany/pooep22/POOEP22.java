/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pooep22;
import java.util.Scanner;
public class POOEP22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        String Nombre = entrada.nextLine();
        
        System.out.println("Ingrese el salario por hora: ");
        double Salario_Hora = entrada.nextDouble();
        
        System.out.println("Ingrese las horas trabajadas: ");
        double Horas_Trabajadas = entrada.nextDouble();
            
        double Salario = Salario_Hora*Horas_Trabajadas;
        
        if (Salario>450000){
            System.out.println("El nombre es: "+Nombre+"y su salario mensual es: $"+Salario);            
        }else{
            System.out.println("El nombre es: "+Nombre);
        }
    }
}
