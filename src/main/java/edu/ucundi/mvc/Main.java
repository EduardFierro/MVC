/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucundi.mvc;

import edu.ucundi.controlador.Controlador;
import edu.ucundi.modelo.Modelo;
import edu.ucundi.vista.Vista;

/**
 *
 * @author Eduard Fierro
 * @author Arley Rivera
 */
public class Main {
    /**
     * 
     * @param args 
     * Clase main de ejecucion del programa
     */
     public static void main(String[] args) {
        
        Vista vista = new Vista();
        Modelo mod = new Modelo();
       
        Controlador control = new Controlador(vista, mod);
        control.iniciar();
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
        
    }
}
