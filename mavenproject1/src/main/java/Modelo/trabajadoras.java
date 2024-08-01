/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author LAB-USR-LNORTE
 */
public class trabajadoras {
    protected String nombre;
    public String seudonimo;
    protected String direccion;
    protected String dni;
    public int edad;
    private double cuentabancaria;
    private double numero;
    public double precio;
    public String estado;
    
    public trabajadoras(String [] trabajadoras)  {
            
        this.nombre=trabajadoras[0];
        this.seudonimo=trabajadoras[1];
        this.direccion=trabajadoras[2];
        this.dni= trabajadoras[3];
        this.edad= Integer.parseInt(trabajadoras[4]); 
        this.cuentabancaria=Double.parseDouble(trabajadoras[5]);
        this.numero= Double.parseDouble(trabajadoras[6]);
        this.precio= Double.parseDouble(trabajadoras[7]);    
        
    }
    
    public trabajadoras(String estado){
        
        this.estado=estado;
        
    }
    
    public String getnombre(){
        
        return nombre;
        
    }
    
    public String getdireccion(){
        return direccion;
    }
        
    public String getdni(){
     
        return dni;
    }
    
    public double getcuentabancaria(){
        
       return cuentabancaria; 
    }
    
    public double getnumero(){
        
        return numero;
    }
    
    public String getseudonimo(){
        
        return seudonimo;
        
    }
    
    public double getprecio(){
        
        return precio;
        
    }
    
    public int getedad(){
        return edad;
    }
    
    public String getestado(){
        return estado;
    }
    
    public void setSeudonimo(String seudonimo){
        
        this.seudonimo=seudonimo;
    }
    
    public void setPrecio(double precio){
        
        this.precio=precio;
        
    }
    
    public void setNombre(String nombre){
        
        this.nombre=nombre;
        
    }
    
    public void setNumero(double numero){
        
        this.numero=numero;
    }
    
    public void setDireccion(String direccion){
        
        this.direccion=direccion;
    }
    
    public void setDni(String dni){
        this.dni=dni;
    }
    
    public void setedad(int edad){
        this.edad=edad;
    }
    
    public void setestado(String estado){
        
        this.estado=estado;
        
    }
    
    public void setcuentabancaria (double cuentabancaria){
    
        this.cuentabancaria=cuentabancaria;
    }
}

