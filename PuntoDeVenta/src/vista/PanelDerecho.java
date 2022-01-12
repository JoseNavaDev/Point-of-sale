package vista;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelDerecho {
    
    public JPanel Panel_Derecho;
    
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
    
    public PanelDerecho(){
        configuracion();
        botones();
    }
    
    private void configuracion(){
        Panel_Derecho = new JPanel();
        Panel_Derecho.setLayout(new GridLayout(5, 4, 15, 15));
        Panel_Derecho.setSize(700,625);
        Panel_Derecho.setLocation(475,50);
        Panel_Derecho.setBackground(Color.blue);
    }   
    
    private void botones(){
        Btn_X1_Y1 = new JButton("Producto 1");
        Btn_X1_Y2 = new JButton("Producto 2");
        Btn_X1_Y3 = new JButton("Producto 3");
        Btn_X1_Y4 = new JButton("Producto 4");
        
        Btn_X2_Y1 = new JButton("Producto 5");
        Btn_X2_Y2 = new JButton("Producto 6");
        Btn_X2_Y3 = new JButton("Producto 7");
        Btn_X2_Y4 = new JButton("Producto 8");

        Btn_X3_Y1 = new JButton("Producto 9");
        Btn_X3_Y2 = new JButton("Producto 10");
        Btn_X3_Y3 = new JButton("Producto 11");
        Btn_X3_Y4 = new JButton("Producto 12");
        
        Btn_X4_Y1 = new JButton("Producto 13");
        Btn_X4_Y2 = new JButton("Producto 14");
        Btn_X4_Y3 = new JButton("Producto 15");
        Btn_X4_Y4 = new JButton("Producto 16"); 
        
        Btn_X5_Y1 = new JButton("Producto 17");
        Btn_X5_Y2 = new JButton("Producto 18");
        Btn_X5_Y3 = new JButton("Producto 19");
        Btn_X5_Y4 = new JButton("Producto 20");        
        
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
