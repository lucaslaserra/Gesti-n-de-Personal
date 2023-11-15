/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz;

import dominio.Sistema;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Prueba {
    
    
     
    public static void main(String[]args) throws FileNotFoundException, IOException, ClassNotFoundException {
       Sistema miSistema = new Sistema ();
        VentanaPrincipal panel = new VentanaPrincipal(miSistema);
//      RegistroHabilidad panel = new RegistroHabilidad(sistema);
        panel.setVisible(true);
    } 
}
