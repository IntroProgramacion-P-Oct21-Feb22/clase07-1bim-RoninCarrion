/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejosswitch;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class EjercicioSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String ciudadano;
        System.out.println("Ingrese la ciudada de donde viene");
        ciudadano = entrada.nextLine();
        
        switch (ciudadano){
        case "Quito":
        case "quito":
             System.out.printf("%s \nBienvenido a las artes vivas", ciudadano);
                break;
        default:
            System.out.println("Ciudad ingresada incorrecta");
        }
    }
}
    
