/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg5;
import java.util.*;
/**
 *
 * @author Raziel 2
 */
public class Problema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Calcular si un numero es primo o no
        int x; //grados celsius y cesius
        x = solicitarNumero(); // solocitar el numero
        calcularymostrarTipo(x); // convertir a grados Farenheit
    }
    public static int solicitarNumero(){
        int x;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero");
        x = teclado.nextInt();
        return x;
    }
    public static void calcularymostrarTipo(int x){
       int a;
       a = x -1;
       while  ((x%a) != 0) {
       a --;
       }
       if (a==1){ mostrarPrimo(); }
       else { mostrarOtro();
    }
    }
    public static void mostrarPrimo(){
        System.out.println("El numero es primo");    
    }
    public static void mostrarOtro(){
        System.out.println("El numero no es primo");
    }
}

