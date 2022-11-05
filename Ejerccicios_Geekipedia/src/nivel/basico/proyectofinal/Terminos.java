package nivel.basico.proyectofinal;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;


public class Terminos extends JFrame implements ActionListener, ChangeListener {

    private JLabel label1, label2;
    private JCheckBox check1;
    private JButton boton1, boton2;
    private JScrollPane scrollpane1;
    private JTextArea textarea1;
    String nombre ="";


// Constructor debe tener el modificador de acceso publico y el nombre de la clase

    public Terminos(String texto){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Licencia de uso");
        setIconImage(new ImageIcon(getClass().getClassLoader().getResource("images/icon.png")).getImage());

        // Bienvenida ventanaBienvenida = new Bienvenida();
        // nombre = ventanaBienvenida.texto;
        nombre = texto;


        label1 = new JLabel("TÉRMINOS Y CONDICIONES");
        label1.setBounds(215,5,200,30);
        label1.setFont(new Font("Andale Mono",3,14));
        label1.setForeground(new Color(0,0,0));
        add(label1);

        ImageIcon imagen = new ImageIcon(getClass().getClassLoader().getResource("images/coca-cola.png"));
        label2 = new JLabel(imagen);
        label2.setBounds(310,135,300,300);
        add(label2);

        textarea1 = new JTextArea();
        textarea1.setEditable(false);
        textarea1.setFont(new Font("Andale Mono",0,9));
        textarea1.setText("\n\n          TÉRMINOS Y CONDICIONES"+
                        "\n\n          A. PROHIBIDA SU VENTA O DISTRIBUCIÓN SIN AUTORORIZACIÓN DE MAO RUIZ H."+
                        "\n          B. PROHIBIDA LA ALTERACIÓN DEL CÓDIGO FUENTE O DISEÑO DE LAS INTERFACES GRÁFICAS."+
                        "\n          C. MAO RUIZ H NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE."+
                        "\n\n          LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACIÓN RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE"+
                        "\n          (MAO RUIZ H) NO SE RESPONSABILIZA DEL USO QUE USTED HAGA CON ESTE SOFTWARE Y SUS SERVICIOS."+
                        "\n          PARA ACEPTAR ESTOS TÉRMINOS HAGA CLIC EN (ACEPTO)."+
                        "\n          SI USTED NO ACEPTA ESTOS TERMINOS HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE."+
                        "\n\n          ESTE SOFTWARE SE HIZO UNICAMENTE CON FINES ACADÉMICOS, Y EN NINGÚN MOMENTO SE PRETENDE SU COMERCIALIZACIÓN."+
                        "\n\n          PARA MAYOR INFORMACIÓN VISITE:"+
                        "\n          https://www.facebook.com/mauriciorh");

        scrollpane1 = new JScrollPane(textarea1);
        scrollpane1.setBounds(10,40,575,200);
        add(scrollpane1);

        check1 = new JCheckBox("Yo " + nombre +" Acepto");
        check1.setBounds(10,250,300,30);
        check1.addChangeListener(this);
        add(check1);

        boton1 = new JButton("Continuar");
        boton1.setBounds(10,290,100,30);
        boton1.addActionListener(this);
        boton1.setEnabled(false);
        add(boton1);

        boton2 = new JButton("No Acepto");
        boton2.setBounds(120,290,100,30);
        boton2.addActionListener(this);
        boton2.setEnabled(true);
        add(boton2);
    }

    public void stateChanged (ChangeEvent e){
        if(check1.isSelected() == true){
            boton1.setEnabled(true);
            boton2.setEnabled(false);
        }else {
            boton1.setEnabled(false);
            boton2.setEnabled(true);
        }
    }
    public void actionPerformed (ActionEvent e){
        if (e.getSource() == boton1){
            Principal ventanaPrincipal = new Principal();
            ventanaPrincipal.setBounds(0,0,640,535);
            ventanaPrincipal.setVisible(true);
            ventanaPrincipal.setResizable(false);
            ventanaPrincipal.setLocationRelativeTo(null);
            this.setVisible(false);

        }else if (e.getSource() == boton2){
            Bienvenida ventanabienvenida = new Bienvenida();
            ventanabienvenida.setBounds(0,0,350,450);
            ventanabienvenida.setVisible(true);
            ventanabienvenida.setResizable(false);
            ventanabienvenida.setLocationRelativeTo(null);
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        Terminos ventanaterminos = new Terminos("fff");
        ventanaterminos.setBounds(0,0,600,380);
        ventanaterminos.setVisible (true);
        ventanaterminos.setResizable(false);
        ventanaterminos.setLocationRelativeTo(null);

    }
}
