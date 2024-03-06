/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.paroimpar;
import java.util.Scanner;//Importamos el paquete "Scanner"
/**
 *
 * @author elgab
 */
public class operador {
     public static int res(){//Abrimos una clase pública llamada "res".
        System.out.println("Introduzca su cantidad");
        Scanner sc=new Scanner(System.in);//Instanciamos un Scanner.
        int valor=sc.nextInt();//Tomamos el valor del usuario.
        if(valor%2==0){//Evaluamos si el valor introducido es par o impar.
            System.out.println("Su valor es un valor par");
        }else{
            System.out.println("Su valor es un valor impar");
        }
        return valor;
    }
    
}


