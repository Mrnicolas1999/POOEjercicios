package com.mycompany.pruebafiguras;

public class TrianguloRectangulo {
    int base; // Atributo 
    int altura; // Atributo
    
    public TrianguloRectangulo(int base, int altura) { // Constructor
        this.base = base;
        this.altura = altura;
    }
        
    double calcularArea() {     //Metodo
        return (base * altura / 2);
    }
        
    double calcularPerimetro() { //Metodo
        return (base + altura + calcularHipotenusa()); 
    }
    
    
    double calcularHipotenusa() {
        return Math.pow(base*base + altura*altura, 0.5);
    }
        
    void determinarTipoTriangulo() { //Metodo
        if ((base == altura) && (base == calcularHipotenusa()) && (altura == calcularHipotenusa())){
            System.out.println("Es un triángulo equilátero");/* Todos sus lados son iguales */
        }    
        else if ((base != altura) && (base != calcularHipotenusa()) &&(altura != calcularHipotenusa())){
            System.out.println("Es un triángulo escaleno"); /* Todos sus lados son diferentes */
        }    
        else{
            System.out.println("Es un triángulo isósceles"); /* De otra manera, es isósceles */
        }
    } 
}