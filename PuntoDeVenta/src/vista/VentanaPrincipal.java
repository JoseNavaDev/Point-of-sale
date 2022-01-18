package vista;

import conexion.Pruebas;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class VentanaPrincipal extends JFrame{
    
    public PanelIzquierdo panelIzquierdo;
    public PanelDerecho panelDerecho;
    
    JPanel PanelVentanaPrincipal;
    
    public JTextArea AreaNombreBotones;
    
    //Imagen configuracion
    ImageIcon ImgConfiguracion;
    public JLabel Img_Configuracion;
    
    //Imagen cerrar
    ImageIcon ImgCerrar;
    public JLabel Img_Cerrar;
    
    public VentanaPrincipal(PanelIzquierdo panelIzquierdo, PanelDerecho panelDerecho){
        this.panelIzquierdo = panelIzquierdo;
        this.panelDerecho = panelDerecho;
        configuracion();
        configuracionPanelVentanaPrincipal();        
        botonConfiguracion();
        botonCerrar();        
        agregarComponentes();
        this.setVisible(true);
    }

    private void configuracion() { 
        this.setUndecorated(true);
        this.setSize(1200,800);        
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);        
    }     
    
    private void configuracionPanelVentanaPrincipal(){
        PanelVentanaPrincipal = new JPanel();        
        PanelVentanaPrincipal.setBackground(Color.white);
        PanelVentanaPrincipal.setSize(1200,800);
        PanelVentanaPrincipal.setLayout(null);
        this.add(PanelVentanaPrincipal);
    }
    
    private void botonConfiguracion(){
        ImgConfiguracion = new ImageIcon(getClass().getResource("/imagenes/configuracion.png"));//Imagen de fondo principal
        Img_Configuracion = new JLabel(ImgConfiguracion);
        Img_Configuracion.setBounds(1080, 10, 40, 40);
        Img_Configuracion.setIcon(new ImageIcon(ImgConfiguracion.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH)));
        PanelVentanaPrincipal.add(Img_Configuracion);
    }
    
    private void botonCerrar(){
        ImgCerrar = new ImageIcon(getClass().getResource("/imagenes/cruzNegra.png"));//Imagen de fondo principal
        Img_Cerrar = new JLabel(ImgCerrar);
        Img_Cerrar.setBounds(1130, 10, 40, 40);
        Img_Cerrar.setIcon(new ImageIcon(ImgCerrar.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH)));
        PanelVentanaPrincipal.add(Img_Cerrar);        
    }
    
    private void agregarComponentes(){
        PanelVentanaPrincipal.add(panelIzquierdo.Panel_Izquierdo);
        PanelVentanaPrincipal.add(panelDerecho.Panel_Derecho);
        this.add(PanelVentanaPrincipal);
    }
    
    public String configuracionAreaBotonNombre(String nombreBoton, boolean mostrarArea){
        AreaNombreBotones = new JTextArea();
        AreaNombreBotones.setBounds(20,20,150,25);
        AreaNombreBotones.setVisible(mostrarArea);
        return AreaNombreBotones.getText();
    }
    
    
    
    
}
