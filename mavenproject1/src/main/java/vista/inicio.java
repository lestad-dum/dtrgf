/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vista;

/**
 *
 * @author LAB-USR-LNORTE
 */
import java.util.regex.*;
import java.util.Scanner;
import Controlador.*;

public class inicio {

    public static void main(String[] args) {
        
        Pattern pat=Pattern.compile("A",Pattern.CASE_INSENSITIVE);
        Pattern pro=Pattern.compile("P",Pattern.CASE_INSENSITIVE);
        
        Scanner lector= new Scanner (System.in);
        
        menuadmin meow=  new menuadmin();
        menucliente pinky=new menucliente();
        menuprogramador pou =new menuprogramador();
        
        System.out.println("BIENVENIDO A BABEL");
        System.out.println("");
        System.out.println("SELECCIONA ENTER PARA EMPEZAR");
        System.out.println("");
        String va = lector.nextLine();
        
        if(pat.matcher(va).matches()){
            System.out.println("");
            meow.inicioadmin();
         
        } if(pro.matcher(va).matches()){
            System.out.println("");
            pou.inicioprogramador();
            
        } else {
            System.out.println("");
            pinky.iniciocliente();
            
        }
        
    }
}
