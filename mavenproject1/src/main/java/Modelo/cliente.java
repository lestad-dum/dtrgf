/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author LAB-USR-LNORTE
 */
public class cliente {
    
    protected String nombre;
    public String metodopago;
    protected String dni;
    public String codigodes;
    
    public cliente(String [] clientes){
        
        this.nombre= clientes [0];
        this.dni=clientes [1];
        this.metodopago = clientes [2];
        this.codigodes=clientes[3];
        
    }
    
    
    
}
