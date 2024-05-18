/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Ejecutor1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double valorM;
        double valorPr;

        String marcaM;
        String marcaPr;

        int numComputadoras;
        Procesador procesador;
        Memoria memoria;
        ArrayList<Computador> computadores = new ArrayList<>();

        System.out.println("Ingrese el numero de computadoras a ingresar: ");
        numComputadoras = entrada.nextInt();
        entrada.nextLine();

        for (int c = 0; c < numComputadoras; c++) {
            System.out.println("Ingrese la marca del procesador: ");
            marcaPr = entrada.nextLine();

            System.out.println("Ingrese el costo del procesador: ");
            valorPr = entrada.nextDouble();
            entrada.nextLine();
            procesador = new Procesador(marcaPr, valorPr);

            System.out.println("Ingrese la marca de la memoria");
            marcaM = entrada.nextLine();
            System.out.println("Ingrese el costo de la memoria: ");
            valorM = entrada.nextDouble();
            entrada.nextLine();

            memoria = new Memoria(marcaM, valorM);

            Computador computador = new Computador(marcaPr,
                    procesador, memoria);
            // Llamamos metodos para calcular el costo 
            computador.establecerCostoComputador();
            computadores.add(computador);

        }
        Venta v = new Venta(computadores);
        v.establecerValorVenta();

        System.out.printf("%s\n", v);

    }

}
