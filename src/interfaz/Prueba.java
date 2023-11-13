/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz;

import dominio.SistemaTemporal;


public class Prueba {
    
    
    public static void main(String[]args) {
        SistemaTemporal sistema = new SistemaTemporal();
        VentanaPrincipal panel = new VentanaPrincipal(sistema);
//      RegistroHabilidad panel = new RegistroHabilidad(sistema);
        panel.setVisible(true);
    } 
}
