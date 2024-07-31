package org.example;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leerTeclado = new Scanner(System.in);

        //DECLARANDO VARIABLES
        String nombrevendedor;
        String nombreSaborHelado;
        String nombreSimple="helado simple";
        String nombreDoble="helado doble";
        String nombreEspecial="helado especial";


        //DECLARANDO VARIABLE PRECIO DE HELADO
        int heladoSimple = 3000;
        int heladoDoble = 6000;
        int heladoEspecial = 14000;

        //DECLARANDO LAS CANTIDADES HELADOS VENDIDOS
        int cantidadHeladoSimple = 0;
        int cantidadHeladoDoble = 0;
        int cantidadHeladoEspecial = 0;
        int totalSimples;
        int totalDobles;
        int totalEspeciales;

        //EJECUCIÓN
        System.out.println("Nombre del vendedor: ");
        nombrevendedor=leerTeclado.nextLine();

        System.out.println("El sabor de helado");
        nombreSaborHelado= leerTeclado.nextLine();

        System.out.println("Tipo de helado: ");
        nombreSaborHelado=leerTeclado.nextLine();

        System.out.println("Numero de ventas de " +nombreSimple+ ":");
        cantidadHeladoSimple= leerTeclado.nextInt();

        System.out.println("Numero de ventas de " +nombreDoble+ ":");
        cantidadHeladoDoble= leerTeclado.nextInt();

        System.out.println("Numero de ventas de " +nombreEspecial+ ":");
        cantidadHeladoEspecial= leerTeclado.nextInt();

        //CALCULAR TOTAL DE VENTAS DE TIPO DE HELADO
        totalSimples=cantidadHeladoSimple*heladoSimple;
        totalDobles=cantidadHeladoDoble*heladoDoble;
        totalEspeciales=cantidadHeladoEspecial*heladoEspecial;

        System.out.println("El dia de hoy se recaudaron :"
                +totalSimples+ "\n pesos en helados simples : " +totalDobles+
                "\n pesos en helados dobles :  " +totalEspeciales+ "\n pesos en helados especiales : ");

        int recoleccionTotal;

        recoleccionTotal = totalSimples + totalDobles + totalEspeciales;

        System.out.println("El total de ventas del dia son : "+recoleccionTotal+ "pesos .");






    }
}