/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procedimientos;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Charlie
 */
public class Procedimientos {

    static int n1, n2;
    static Scanner teclado = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {

        do {
            verOpciones();
            elegirOpcion();
            pausar();
        } while (true);

    }
    
    private static void pausar() throws IOException{
        System.out.println("\nPresione Enter para continuar...");
        System.in.read();
    }

    private static void verOpciones() {
        System.out.println("\nOpciones: \n"
                + "\n1 ) Ingresar datos"
                + "\n2 ) Mostrar numeros ingresados"
                + "\n3 ) Sumar numeros ingresados"
                + "\n4 ) Restar numeros ingresados"
                + "\n5 ) Multiplicar numeros ingresados"
                + "\n6 ) Dividir numeros ingresados"
                + "\n7 ) Borrar datos"
                + "\n8 ) Salir");
    }

    private static void elegirOpcion() {
        System.out.println("\nElija una opcion: ");
        int caso;
        caso = ingresarNumero(0);
        
        switch (caso) {
            case 0:
                break;
            case 1:
                ingresarDatos();
                break;
            case 2:
                mostrarNumeros();
                break;
            case 3:
                System.out.println("\nSuma: " + sumar(n1, n2));
                break;
            case 4:
                System.out.println("\nResta: " + restar(n1, n2));
                break;
            case 5:
                System.out.println("\nMultiplicado: " + multiplicar(n1, n2));
                break;
            case 6:
                System.out.println("\nDivision: " + dividir(n1, n2));
                break;
            case 7:
                borrarDatos();
                break;
            case 8:
                salir();
                break;
            default:
                System.out.println("\nOpcion invalida");
                break;
        }
    }

    private static void ingresarDatos() {
        System.out.println("\nIngrese un numero: ");
        n1 = ingresarNumero(n1);
        System.out.println("\nIngrese otro nomuero: ");
        n2 = ingresarNumero(n2);
    }

    private static void mostrarNumeros() {
        System.out.println("\nLos numeros ingresados son: "
                + "\nPrimer numero: " + n1
                + "\nSegundo numero: " + n2);
    }

    private static int sumar(int n1, int n2) {
        return n1 + n2;
    }

    private static int restar(int n1, int n2) {
        return n1 - n2;
    }

    private static int multiplicar(int n1, int n2) {
        return n1 * n2;
    }

    private static float dividir(int n1, int n2) {
        return (float) n1 / (float) n2;
    }

    private static void borrarDatos() {
        n1 = 0;
        n2 = 0;
    }

    private static void salir() {
        System.exit(0);
    }
    
    private static int ingresarNumero(int num){
        int valor;
        String salto;
        try {
            valor = teclado.nextInt();
        } catch (InputMismatchException e) {
            salto = teclado.nextLine();
            System.err.println("Error : no ha ingresado un numero");
            valor = num;
        } 
        return valor;
    }

}
