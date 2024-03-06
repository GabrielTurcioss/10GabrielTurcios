/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.paroimpar;
import java.util.Scanner;//Importamos el paquete "Scanner"
/**
 *
 * @author elgab
 */
public class ParOimpar {

   public static void main(String[] args) {
        System.out.println("Bienvenido, este programa indica si un numero es par o impar");
        operador op=new operador();//Instanciamos la clase operadores.
        System.out.println(op.res());//Imprimimos el valor esvaluado en la clase "res".
    }
}