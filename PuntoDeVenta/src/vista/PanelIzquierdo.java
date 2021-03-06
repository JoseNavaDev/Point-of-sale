package vista;

import java.awt.Color;
import java.awt.Font;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class PanelIzquierdo {
    
    public JPanel Panel_Izquierdo;
    public JButton Btn_Configuracion;    
    
    JTextArea AreaInfo;
    JTextField TF_Busqueda;
    JButton Btn_Busqueda;
    
    Font fuente = new Font("Arial", Font.ITALIC, 20);
    
    public PanelIzquierdo(){
        configuracion();
        areaInformacion();
        areaBusqueda();
        botonBusqueda();
    }
    
    private void configuracion(){
        Panel_Izquierdo = new JPanel();
        Panel_Izquierdo.setLayout(null);
        Panel_Izquierdo.setSize(450,700);
        Panel_Izquierdo.setLocation(10,50);
        Panel_Izquierdo.setBackground(Color.white);
    }
    
    //COMPONENTES
    
    private void areaInformacion(){
        AreaInfo = new JTextArea();
        AreaInfo.setEditable(false);
        AreaInfo.setLineWrap(true);
        AreaInfo.setFont(fuente);
        AreaInfo.append("************* Abarrotes Gutierrez *************");
        AreaInfo.append("************ " + fechaYhora() + " *************");
        AreaInfo.append("---------------------------------------------------------");
        AreaInfo.append("\n \n \n");
        AreaInfo.append("Cantilever");
        AreaInfo.setCaretPosition(AreaInfo.getDocument().getLength());
        AreaInfo.setSize(400,600);
        AreaInfo.setLocation(25,25);
        AreaInfo.setBorder(new LineBorder(Color.black));
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
    
    private String fechaYhora(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");     
        return dtf.format(LocalDateTime.now());
    }    
       
}
