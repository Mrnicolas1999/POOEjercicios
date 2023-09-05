/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pooer15;
import java.util.Scanner;
public class POOER15 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el peso A: ");
        int PESOA= entrada.nextInt();
        
        System.out.println("Ingrese el peso B: ");
        int PESOB= entrada.nextInt();
        
        System.out.println("Ingrese el peso C: ");
        int PESOC= entrada.nextInt();
        
        System.out.println("Ingrese el peso D: ");
        int PESOD= entrada.nextInt();
        
        if (PESOA == PESOB && PESOA == PESOC){
            System.out.println("LA ESFERA D ES LA DIFERENTE");
            if(PESOD>PESOA){
                System.out.println("Y ES DE MAYOR PESO");
            }else{
                System.out.println("Y ES DE MENOR PESO");
            }
        }else if (PESOA==PESOB && PESOA == PESOD){
            System.out.println("LA ESFERA C ES LA DIFERENTE");
            if(PESOC>PESOA){
                System.out.println("Y ES DE MAYOR PESO");
            }else{
                System.out.println("Y ES DE MENOR PESO");
            }
        }else if(PESOA == PESOC && PESOA == PESOD){
            System.out.println("LA ESFERA B ES LA DIFERENTE");
            if(PESOB>PESOD){
                System.out.println("Y ES DE MAYOR PESO");
            }else{
                System.out.println("Y ES DE MENOR PESO");
            }
        }else{
            System.out.println("LA ESFERA A ES LA DIFERENTE");
            if(PESOA > PESOB){
                System.out.println("Y ES DE MAYOR PESO");
            }else{
                System.out.println("Y ES DE MENOR PESO");
            }
            
        }
        
    }
}
