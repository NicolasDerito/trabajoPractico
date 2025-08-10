/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;

import java.util.Scanner;

/**
 *
 * @author Nicol
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);        
       String nombre = "Nicolas \n";
       int edad = 31 ;
       double altura =  1.75;
       boolean estudiante = true;
         System.out.println(nombre + + edad + altura + estudiante);
       int suma, resta, multiplicacion, division, numero, numeroDos;
        System.out.println("Ingrese el primer numero: ");
      numero = input.nextInt();
        System.out.println("Ingrese el segundo numero: ");
      numeroDos = input.nextInt();
      
        System.out.println("Esta es la suma entre los numeros: " + (numero + numeroDos) );
        System.out.println("Esta es la resta de los dos numeros: " +( numero - numeroDos) );
        System.out.println("Esta es la multiplicacion de los dos numeros: "+ (numero * numeroDos) );
        System.out.println("Esta es la division entre los dos numeros: " + (numero / numeroDos ));
        
         //Ejercico 
//            Escribe un programa que muestre el siguiente mensaje en consola:
//            Nombre: Juan Pérez
//            Edad: 30 años
//            Dirección: "Calle Falsa 123"
//            Usa caracteres de escape (\n, \") en System.out.println().

        System.out.println(" Nombre: Juan Perez \n Edad: 30 años \n Direción \"Calle Falsa 123\"");
       
        //     Ejercicio 7
//             Línea 1: int x = 10; es una instrucción. Se trata de una declaración e inicialización de la variable x.
//
//             Línea 2: x = x + 5; es una instrucción. Aunque contiene una expresión (x + 5), toda la línea es una instrucción que asigna el valor de x + 5 a x.
//
//             Línea 3: System.out.println(x); es una instrucción. Se llama a un método para imprimir el valor de x.
//             Una expresion es una combinacion de variables, operadores y funciones que se evaluan para producir un valor
//             Una instruccion es una unidad completa de ejecucion  que realiza una accion 

//              8.  Manejar conversiones de tipo y división en Java.
//                a. Escribe un programa que divida dos números enteros ingresados por el
//                usuario.
//                b. Modifica el código para usar double en lugar de int y compara los
//                resultados.

                int numeroTres, numeroCuatro;
                
                System.out.println("Ingresa los numeros para dividir: ");
                numeroTres = input.nextInt();
                numeroCuatro = input.nextInt();
                //Para pasarlo a double se le pone entre paretesis antes de las variables a dividir. 
                System.out.println((double)numeroTres / numeroCuatro);
                
                System.out.print("Ingresa tu nombre: ");
                input.nextLine();
                String nombre = input.next();  // ERROR
                System.out.println("Hola, " + nombre);

    }
    
}
