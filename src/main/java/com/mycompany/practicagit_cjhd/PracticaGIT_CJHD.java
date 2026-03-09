/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicagit_cjhd;

import java.util.Scanner;

/**
 *
 * @author Pomuch19
 */
public class PracticaGIT_CJHD {

    public static void main(String[] args) {
        System.out.println("--- Sistema de gestion de alumnos ---");
        System.out.println("Bienvenido, usuario de estudiante.");
     
     {   Scanner cin = new Scanner(System.in);// declaracion para la variable para la lectura de los datos de entrada 
     
     // declarar variable 
     int n1, n2, suma;
     
     System.out.print("introduce primer numero: "); 
     n1 = cin.nextInt(); // el valor que intruduce el usuario es asignado a la variable n1
     
     System.out.print("intruduce segundo numero: ");
     n2 = cin.nextInt(); // el que intruduce el usario es asignado a la variable n2
     
     //poseso
     suma = n1 + n2;
     
     // salida 
     System.out.println("elresultado es " + suma);}
    }// esta llve indica el fin del programa 
    
}//Esta llave indica el cierre de la clase 
   
