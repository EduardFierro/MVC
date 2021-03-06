/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucundi.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import edu.ucundi.modelo.Modelo;
import edu.ucundi.vista.Vista;
import java.util.ArrayList;

/**
 *
 * @author Eduard Fierro
 * @author Arley rivera
 */
public class Controlador implements ActionListener {

    private ArrayList nombres = new ArrayList();
    private Vista vista;
    private Modelo modelo;

    /**
     *
     * @param vista
     * @param modelo
     */
    public Controlador(Vista vista, Modelo modelo) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.B_Guardar.addActionListener(this);
    }

    public void iniciar() {
        vista.setTitle("Agregar nombres");
        vista.setLocationRelativeTo(null);
    }

    /**
     *metodo de las acciones del boton guardar 
     * @param e
     */
    public void actionPerformed(ActionEvent e) {

        modelo.setNombre(vista.TF_nombre.getText());
        nombres.add(modelo.getNombre());
        DefaultListModel mo = new DefaultListModel();

        for (Object n : nombres) {
            mo.addElement(n);
        }

        vista.jList1.setModel(mo);

        vista.TF_nombre.setText("");

    }
}
