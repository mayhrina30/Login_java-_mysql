
package com.mycompany.login;

import com.mycompany.login.igu.Principal;
import javax.swing.JFrame;

public class Login {

    public static void main(String[] args) {
        // Crear un nuevo JFrame
        JFrame frame = new JFrame("Login");

        // Crear una instancia del JPanel 'Principal'
        Principal princ = new Principal();

        // Añadir el JPanel al JFrame
        frame.add(princ);

        // Configurar el JFrame
        frame.setSize(400, 400); // Puedes ajustar el tamaño según sea necesario
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Centrar el JFrame en la pantalla
        frame.setVisible(true); // Hacer visible el JFrame
    }
}



