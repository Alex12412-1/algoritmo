/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_3;

import java.util.Scanner;

/**
 *
 * @author alex10
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            char  let;
    char letra;
    Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una letra: ");
        String entrada = sc.nextLine().toLowerCase();

        if (entrada.length() == 1 && Character.isLetter(entrada.charAt(0))) {
            letra = entrada.charAt(0);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                System.out.println("La letra es una vocal.");
            } else {
                System.out.println("La letra es una consonante.");
            }
        } else {
            System.out.println("Error: Debe ingresar una sola letra del abecedario.");
        }    
    }
    
}
