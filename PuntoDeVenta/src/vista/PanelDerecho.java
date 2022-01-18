package vista;

import conexion.Pruebas;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import modelo.FabricaBotones;

public class PanelDerecho {
    
    public JPanel Panel_Derecho;
    public FabricaBotones modelo;
    
    //BOTONES X1
    public JButton Btn_X1_Y1;
    public JButton Btn_X1_Y2;
    public JButton Btn_X1_Y3;
    public JButton Btn_X1_Y4;
    
    //BOTONES X2
    public JButton Btn_X2_Y1;
    public JButton Btn_X2_Y2;
    public JButton Btn_X2_Y3;
    public JButton Btn_X2_Y4;
    
    //BOTONES X3
    public JButton Btn_X3_Y1;
    public JButton Btn_X3_Y2;
    public JButton Btn_X3_Y3;
    public JButton Btn_X3_Y4;
    
    //BOTONES X4
    public JButton Btn_X4_Y1;
    public JButton Btn_X4_Y2;
    public JButton Btn_X4_Y3;
    public JButton Btn_X4_Y4;
    
    //BOTONES X5
    public JButton Btn_X5_Y1;
    public JButton Btn_X5_Y2;
    public JButton Btn_X5_Y3;
    public JButton Btn_X5_Y4;
    
    public PanelDerecho(FabricaBotones modelo){
        this.modelo = modelo;
        configuracion();
        botones();
    }
    
    private void configuracion(){
        Panel_Derecho = new JPanel();
        Panel_Derecho.setLayout(new GridLayout(5, 4, 15, 15));
        Panel_Derecho.setSize(700,625);
        Panel_Derecho.setLocation(475,70);
        Panel_Derecho.setBackground(Color.white);
    }   
    
    private void botones(){
        Btn_X1_Y1 = new JButton(modelo.getStringBoton_X1Y1());
        Btn_X1_Y2 = new JButton(modelo.getStringBoton_X1Y2());
        Btn_X1_Y3 = new JButton(modelo.getStringBoton_X1Y3());
        Btn_X1_Y4 = new JButton(modelo.getStringBoton_X1Y4());
        
        Btn_X2_Y1 = new JButton(modelo.getStringBoton_X2Y1());
        Btn_X2_Y2 = new JButton(modelo.getStringBoton_X2Y2());
        Btn_X2_Y3 = new JButton(modelo.getStringBoton_X2Y3());
        Btn_X2_Y4 = new JButton(modelo.getStringBoton_X2Y4());

        Btn_X3_Y1 = new JButton(modelo.getStringBoton_X3Y1());
        Btn_X3_Y2 = new JButton(modelo.getStringBoton_X3Y2());
        Btn_X3_Y3 = new JButton(modelo.getStringBoton_X3Y3());
        Btn_X3_Y4 = new JButton(modelo.getStringBoton_X3Y4());
        
        Btn_X4_Y1 = new JButton(modelo.getStringBoton_X4Y1());
        Btn_X4_Y2 = new JButton(modelo.getStringBoton_X4Y2());
        Btn_X4_Y3 = new JButton(modelo.getStringBoton_X4Y3());
        Btn_X4_Y4 = new JButton(modelo.getStringBoton_X4Y4()); 
        
        Btn_X5_Y1 = new JButton(modelo.getStringBoton_X5Y1());
        Btn_X5_Y2 = new JButton(modelo.getStringBoton_X5Y2());
        Btn_X5_Y3 = new JButton(modelo.getStringBoton_X5Y3());
        Btn_X5_Y4 = new JButton(modelo.getStringBoton_X5Y4());        
        
        Panel_Derecho.add(Btn_X1_Y1);
        Panel_Derecho.add(Btn_X1_Y2);
        Panel_Derecho.add(Btn_X1_Y3);
        Panel_Derecho.add(Btn_X1_Y4);
        
        Panel_Derecho.add(Btn_X2_Y1);
        Panel_Derecho.add(Btn_X2_Y2);
        Panel_Derecho.add(Btn_X2_Y3);
        Panel_Derecho.add(Btn_X2_Y4);
        
        Panel_Derecho.add(Btn_X3_Y1);
        Panel_Derecho.add(Btn_X3_Y2);
        Panel_Derecho.add(Btn_X3_Y3);
        Panel_Derecho.add(Btn_X3_Y4);
        
        Panel_Derecho.add(Btn_X4_Y1);
        Panel_Derecho.add(Btn_X4_Y2);
        Panel_Derecho.add(Btn_X4_Y3);
        Panel_Derecho.add(Btn_X4_Y4);
        
        Panel_Derecho.add(Btn_X5_Y1);
        Panel_Derecho.add(Btn_X5_Y2);
        Panel_Derecho.add(Btn_X5_Y3);
        Panel_Derecho.add(Btn_X5_Y4);
    }
}
