/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejer_4;

import java.util.Scanner;

/**
 *
 * @author ItsqmetEstudiantes
 */
public class EJER_4 {

    public static void main(String[] args) {
        //EJERCICIO 4
        double calificacion;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingresar calificacion: ");
        calificacion = teclado.nextDouble();
        
        if ( calificacion >= 90 && calificacion <= 100){
            System.out.println("El alumno tiene A");
            
        }else if (calificacion >= 80 && calificacion < 90){
            System.out.println("El alumno tiene B");
            
        }else if (calificacion >= 70 && calificacion < 80){
            System.out.println("El alumno tiene c");
            
        }else if (calificacion >=60 && calificacion < 50){
            System.out.println("El alumno tiene D");
            
        }else if (calificacion <60){
            System.out.println("El alumno tiene E");
        }
        //EJERCICIO 7
        double precio;
        double precioFinal;
        double respuesta;
        
        
        System.out.println("Ingresar precio: ");
        precio = teclado.nextDouble();
        
        if( precio > 100){
            precioFinal = 0.2;
        }else{
            precioFinal = 0.1;
        }
        respuesta = precio - (precio * precioFinal);
        System.out.println("El precio final de producto es: "+respuesta);
    
        //EJERCICIO 8
        char letra;
        
        System.out.println("Ingresar letra");
        letra = teclado.nextLine().charAt(0);//Ingresar caracter
        
        switch (letra){
            case 'a':
                System.out.println("Es una vocal: ");
                break;
                
            case 'e':
                System.out.println("Es una vocal: ");
                break;
                
            case 'i':
                System.out.println("Es una vocal: ");
                break;
                
            case 'o':
                System.out.println("Es una vocal: ");
                break;
                
            case 'u':
                System.out.println("Es una vocal: ");
                
            default :
                System.out.println("Es una consonante");
}
        
        
        
           
    }
}
