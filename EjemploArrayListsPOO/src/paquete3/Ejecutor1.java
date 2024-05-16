/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Ejecutor1 {

    public static void main(String[] args) {

        double valorM ;
        String marcaM;
        
        double valorPr ;
        String marcaPr;
        
        Scanner entrada = new Scanner(System.in);
        Computador c1 = new Computador();
       


        System.out.println("Ingrese la marca de la memoria ");
        marcaM = entrada.nextLine();
        System.out.println("Valor de la memoria");
        valorM = entrada.nextDouble();
         Memoria m1 = new Memoria (marcaM , valorM );
         
         
         System.out.println("Ingrese la marca del procesador ");
        marcaPr = entrada.nextLine();
        System.out.println("Valor del procesador");
        valorPr = entrada.nextDouble();
        Procesador p1 = new Procesador(marcaPr , valorPr); 
        
        
    }
}
