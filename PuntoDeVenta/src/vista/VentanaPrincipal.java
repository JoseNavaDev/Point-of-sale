package vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame{
    
    PanelIzquierdo panelIzquierdo;
    PanelDerecho panelDerecho;      
    
    public VentanaPrincipal(PanelIzquierdo panelIzquierdo, PanelDerecho panelDerecho){
        this.panelIzquierdo = panelIzquierdo;
        this.panelDerecho = panelDerecho;
        configuracion();
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
    
    private void agregarComponentes(){
        this.getContentPane().add(panelIzquierdo.Panel_Izquierdo);
        this.getContentPane().add(panelDerecho.Panel_Derecho);
        
    }
    
    
    
    
    
    
}
