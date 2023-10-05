
package ModelView;

import java.awt.*;
import javax.swing.*;

public class EjemplosJFrame {

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Ejemplo JTextArea y JScrollPane");
        ventana.setDefaultCloseOperation(3);
        //ventana.setBounds(100,100,500,500);

        JPanel panel = new JPanel();

        //Ejemplo JTextArea y JScrollPane
        /*JTextArea textArea = new JTextArea(10,40);
        //textArea.setLineWrap(true);
        //textArea.setWrapStyleWord(true);
        textArea.setText("Ejemplo");

        JScrollPane scroll = new JScrollPane(textArea);
        panel.add(scroll);*/

        
        //Ejemplo JTable
        
        /*Object[][] alumnos = {
            {"Jose", 18, "Aprobado"},
            {"Santiago", 15, "Reprobado"},
            {"Juan", 17, "Aprobado"},
            {"David", 16, "Aprobado"},
            {"Eva", 19, "Aprobado"},
            {"Laura", 18, "Aprobado"},
            {"Daniela", 17, "Aprobado"},
            {"Julian", 16, "Reprobado"},
            {"Isabel", 20, "Aprobado"},
            {"Daniel", 18, "Aprobado"}
        };


        Object[] columnas = {"Nombre", "Edad", "Estado"};

        JTable tabla = new JTable(alumnos, columnas);
        
        JScrollPane scrollTabla = new JScrollPane(tabla);
        panel.add(scrollTabla);*/
        
        
        
        //ejemplo JPasswordField
        
        ventana.setBounds(100,100,400,200);
        JLabel usuario = new JLabel("Usuario:");
        JTextField campoUsuario = new JTextField();

        JLabel contrasena = new JLabel("Contraseña:");
        JPasswordField campoContrasena = new JPasswordField();

        JButton iniciarSeccion = new JButton("Iniciar Sesión");

        panel.add(usuario);
        panel.add(campoUsuario);
        panel.add(contrasena);
        panel.add(campoContrasena);
        panel.add(iniciarSeccion);

        panel.setLayout(new GridLayout(3, 2));
        
        ventana.add(panel);
        ventana.setVisible(true);
    } 
}
