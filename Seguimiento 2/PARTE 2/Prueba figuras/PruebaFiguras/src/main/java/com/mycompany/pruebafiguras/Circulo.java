
package com.mycompany.pruebafiguras;
public class Circulo {
    
    int radio;  //atributo
        
    Circulo(int radio) { //constructor
        this.radio = radio;
    }
            
        double calcularArea() { //metodos
           return Math.PI*Math.pow(radio,2);
        }

        double calcularPerimetro() { //metodos
           return 2*Math.PI*radio;
        }
}
    
