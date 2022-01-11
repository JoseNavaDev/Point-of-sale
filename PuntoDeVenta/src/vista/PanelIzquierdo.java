package vista;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PanelIzquierdo {
    
    public JPanel Panel_Izquierdo;
    
    JTextArea AreaInfo;
    JTextField TF_Busqueda;
    JButton Btn_Busqueda;
    
    public PanelIzquierdo(){
        configuracion();
        areaInformacion();
        areaBusqueda();
        botonBusqueda();
    }
    
    private void configuracion(){
        Panel_Izquierdo = new JPanel();
        Panel_Izquierdo.setLayout(null);
        Panel_Izquierdo.setSize(450,750);
        Panel_Izquierdo.setLocation(0,50);
        Panel_Izquierdo.setBackground(Color.red);
    }
    
    //COMPONENTES
    
    private void areaInformacion(){
        AreaInfo = new JTextArea();
        AreaInfo.setSize(400,600);
        AreaInfo.setLocation(25,25);
        AreaInfo.setVisible(true);
        Panel_Izquierdo.add(AreaInfo);
        Panel_Izquierdo.updateUI();
    }
    
    private void areaBusqueda(){
        TF_Busqueda = new JTextField();
        TF_Busqueda.setSize(275,30);
        TF_Busqueda.setLocation(25,650);
        Panel_Izquierdo.add(TF_Busqueda);
        Panel_Izquierdo.updateUI();
    }
    
    private void botonBusqueda(){
        Btn_Busqueda = new JButton("Buscar");
        Btn_Busqueda.setSize(100,30);
        Btn_Busqueda.setLocation(325,650);
        Panel_Izquierdo.add(Btn_Busqueda);
        Panel_Izquierdo.updateUI();
    }
}
