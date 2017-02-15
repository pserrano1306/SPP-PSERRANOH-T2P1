/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.pserranoh.t2p1;
import java.util.Scanner;
/**
 *
 * @author Pablo
 */
public class SPPPSERRANOHT2P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Pablo Serrano hernande A01410753 (IMT)
        
          Scanner teclado = new Scanner (System.in);
    int count;
        
        System.out.println("Calculadora de Salarios");
        System.out.println("¿Cuántos salarios vas revisar?");
        count = teclado.nextInt();
        
    
    while (count>0) {switch (pedirDatos("la categoría del trabajador (1-4)")) {
            case 1: 
                pago(30.00);
            break;
            
            case 2: 
                pago(38.00);
            break;
            
            case 3:
                pago(50.00);
            break;
            
            case 4:
                pago(70.00);
            break;
            
            default:
                System.out.println("|-Por favor ingrese un valor entre 1 y 4");
                
            
        }
    count = count - 1;
    }
    }

static int pedirDatos(String Data){
    Scanner teclado = new Scanner (System.in);
    int dato;
    
    System.out.print("Ingrese " + Data + ": ");
    dato = teclado.nextInt();
        
    return dato;
}
static void pago(double num){
    double pago,he,sue;
     
    sue = pedirDatos("el salario base");
    he = pedirDatos("las horas extra");
            
    pago = sue + (he * num);
    System.out.println("El pago al trabajador es de: $" + pago);
        
}

    }