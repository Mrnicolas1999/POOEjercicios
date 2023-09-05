/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pooep19;
import java.util.Scanner;
public class POOEP19 {

    public static void main(String[] args) {
        Scanner entrada1 = new Scanner(System.in);
        System.out.println("Introduzca el valor del lado: ");
        double lado = entrada1.nextDouble();
        
        double perimetro = (double) (lado + lado + lado);  //calculo del perimetro
        
        double cateto_adyacente = lado/2;
        double hipotenusa = lado;        
        double cat_adyacente = (double) Math.pow(cateto_adyacente, 2); //elevamos al cuadrado por pitagoras
        double hipo = (double) Math.pow(hipotenusa, 2);        
        double altura = (double) Math.sqrt(hipo-cat_adyacente); //calculamos la altura con pitagoras
        
        double area = (lado*altura)/2; //calculo del area
        
        System.out.println("El perimetro es: " + perimetro);
        System.out.println("La altura es: " + altura);
        System.out.println("El area es: " + area);       
    }
}
