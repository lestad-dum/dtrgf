/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author User
 */

import java.io.*;
import java.time.format.*;
import java.time.*;

public class añadirtrabajadora {
    
    private static final String LOG_FILE="trabajadoras";
    
    public static void registrar(String nombre, String seudonimo, String direccion, String dni, int edad, double numero, double precio){
        
        LocalDateTime fecha = LocalDateTime.now();
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        
        String pouemo = String.format("[%s] Trabajadora: %s - Seudonimo: %s - Direccion: %s - Dni: %s - Edad: %d - Telefono: %.0f - Precio: %.2f", fecha.format(formato), nombre ,seudonimo , direccion , dni , edad , numero ,precio);

        escribirEnLog(pouemo);
        
    }
    
    private static void escribirEnLog(String pouemo){
        
        try(PrintWriter escritor=new PrintWriter (new FileWriter(LOG_FILE, true))){
            
            escritor.println(pouemo);
        } catch(IOException e){
            
            System.err.println("Error al escribir el archivo de registro"+e.getMessage());
        }
        
        
        
        
        
    
        
        
    }
}
