/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova;

import java.util.Scanner;

/**
 *
 * @author Computador
 */
public class Prova {

    public static void main(String[] args) {
   
            Scanner teclado = new Scanner(System.in);
        double raio, perimetro, diametro, area;

        System.out.println("Insira o raio:");
        raio = teclado.nextDouble();

        perimetro = 2 * Math.PI * raio;
        area = Math.PI * Math.pow(raio, 2);
        diametro = raio * 2;

        System.out.println("Raio:" + raio + "\n"
                + "perimetro:" + perimetro + "\n"
                + "Area:" + area + "\n"
                + "Diametro:" + diametro);
  
        
        
        
    }
    
}
