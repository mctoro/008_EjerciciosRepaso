/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.principal;

import com.cice.logica.Logica;
import com.cice.persona.Persona;
import java.util.Scanner;



/**
 *
 * @author Miguel
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //variables a utilizar
        Scanner sc = new Scanner(System.in);
        
        //1ª opción sería crear una persona vacía (sin datos) y añair sus valores
        //Persona usuario = new Persona();
        
        //2ª opción sería crear variables auxiliares
        String nombre, apellidos;
        int edad, opcion;
        double peso, altura;

        
        
        System.out.println("Calculadora de IMC");
        System.out.println("==================");
        System.out.println("");
        System.out.print("Introduce tu nombre: ");
        
        //1ª opción
        //usuario.setNombre(sc.nextLine());
        
        //2ª opción
        nombre = sc.nextLine();
        System.out.print("Introduce tus apellidos: ");
        apellidos = sc.nextLine();
        System.out.print("Introduce tu edad: ");
        edad = sc.nextInt();
        
        System.out.print("Introduce tu peso en Kg: ");
        peso = sc.nextDouble();
        
        System.out.print("Introduce tu altura en metros: ");
        altura = sc.nextDouble();
        
        Persona usuario = new Persona(nombre, apellidos, edad, altura, peso);
        
        System.out.println("");
        System.out.println("==================");
        System.out.println("¿Que quieres hacer " + nombre + "?");
        System.out.println("1. Calcular tu IMC");
        System.out.println("0. Salir");
        System.out.print("Tu opción es: ");
        opcion = sc.nextInt();
        
        System.out.println("");
        System.out.println("==================");
        
        if(opcion !=0){
            Logica.calcularIMC(usuario);
        }else{
            System.out.println("gracias");
        }
    }
    
}
