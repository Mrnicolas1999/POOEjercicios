
package com.mycompany.pruebafiguras;
    public class Cuadrado {
        
    int lado;  //Atributo
    
    public Cuadrado(int lado) { //Constructor
        this.lado = lado;
    }
    
    double calcularArea() { // Metodos
        return lado*lado;
    }
    
    double calcularPerimetro() { //Metodos
        return (4*lado);
    }
}