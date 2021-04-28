/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package github;

import javax.swing.JOptionPane;

/**
 *
 * @author anacr
 */
public class GitHub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hola grupo de POO");

        int Pregunta = JOptionPane.showConfirmDialog(null, "¿Tienes 2 nombres?", "", JOptionPane.YES_NO_OPTION);

        if (Pregunta == JOptionPane.NO_OPTION) {
            String Nombre = JOptionPane.showInputDialog("Ingresa tu nombre");
            String ApellidoP = JOptionPane.showInputDialog("Ingresa tu apellido PATERNO");
            String ApellidoM = JOptionPane.showInputDialog("Ingresa tu apellido MATERNO");

            String Iniciales = Nombre.substring(0, 1) + "." + ApellidoP.substring(0, 1) + "." + ApellidoM.substring(0, 1);
            JOptionPane.showMessageDialog(null, "Iniciales: " + Iniciales);

        } else if (Pregunta == JOptionPane.YES_OPTION) {
            String Nombres1 = JOptionPane.showInputDialog("Ingresa tu primer nombre");
            String Nombres2 = JOptionPane.showInputDialog("Ingresa tu segundo nombre");
            String ApellidoP = JOptionPane.showInputDialog("Ingresa tu apellido PATERNO");
            String ApellidoM = JOptionPane.showInputDialog("Ingresa tu apellido MATERNO");

            String Iniciales = Nombres1.substring(0, 1) + "."+Nombres2.substring(0, 1)+"."+ ApellidoP.substring(0, 1) + "." + ApellidoM.substring(0, 1);
            JOptionPane.showMessageDialog(null, "Iniciales: " + Iniciales);
            JOptionPane.showMessageDialog(null, "GIT PRUEBA");
        }

    }

}
