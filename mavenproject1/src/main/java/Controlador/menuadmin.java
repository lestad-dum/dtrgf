/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author LAB-USR-LNORTE
 */

import java.util.Scanner;
public class menuadmin {
    
    Scanner lector=new Scanner(System.in);
    
   public void inicioadmin(){
       
       System.out.println("");
       System.out.println("1. ver reportes de salida");
       System.out.println("2. ver reportes de ingreso");
       System.out.println("3. ver todas las trabajadoras");
       System.out.println("4. agregar trabajadora");
       System.out.println("5. ver reporte de clientes");
       System.out.println("6. salir");
       System.out.println("");
     
       int opcion=lector.nextInt();
       opcion4();
     
}
       
   
   public void opcion4(){
    
       
    System.out.println("ingrese nombre de la trabajadora");
    lector.nextLine();
    String nombre=lector.nextLine();

    
    System.out.println("ingrese seudonimo de la trabajadora");
    String seudonimo=lector.nextLine();
    
    System.out.println("ingrese dirección de la trabajadora");
    String direccion=lector.nextLine();
    
    System.out.println("ingrese dni de la trabajadora");
    lector.nextLine();
    String dni=lector.nextLine();
    
    
    System.out.println("ingrese edad de la trabajadora");
    int edad=lector.nextInt();
    
    System.out.println("ingrese cuenta bancaria de la trabajadora");
    double cuentabancaria=lector.nextDouble();
    
    System.out.println("ingrese numero telefonico de la trabajadora");
    double numero=lector.nextDouble();
    
    System.out.println("ingrese precio de la trabajadora");
    double precio=lector.nextDouble();
    
    
    añadirtrabajadora.registrar(nombre,seudonimo,direccion,dni,edad,numero,precio);
    
}
   }
