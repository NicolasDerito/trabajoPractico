import java.util.Scanner;
public class ErrorJava {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Ingresa tu nombre: ");
String nombre = scanner.next(); // ERROR
System.out.println("Hola, " + nombre);

//El problema en este caso es que esta mezclando un String con un INT y va a dar error 
//ya que uno es una cadena de texto y el otro son numeros entereos que nada tienen que ver el uno con el otro
}
}