package com.mycompany.pruebafiguras;
    public class Rectangulo {
    int base; // Atributo que define la base de un rectángulo
    int altura; // Atributo que define la altura de un rectángulo    
                
    Rectangulo(int base, int altura) {  //Contructor
        this.base = base;
        this.altura = altura;
    }
    
    double calcularArea() {         //Metodos
        return base * altura;
    }
    
    double calcularPerimetro() {       //Metodos
        return (2 * base) + (2 * altura);
    }
}