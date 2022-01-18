package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import vista.VentanaPrincipal;

public class Controlador implements MouseListener{
    
    private VentanaPrincipal ventana;
    
    private boolean banderaConfiguracion;

    public Controlador(VentanaPrincipal ventana) {
        this.ventana = ventana;
        oyentes();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //BOTONES SALIR Y CONFIGURACION
        if (e.getSource()==ventana.Img_Cerrar) {
            System.exit(0);
        }
        if (e.getSource()==ventana.Img_Configuracion) {
            if (banderaConfiguracion) {
                banderaConfiguracion = false;
            } else {
                banderaConfiguracion = true;
                
            }
        }
        
        //X1
        if (e.getSource()==ventana.panelDerecho.Btn_X1_Y1) {
            if (!banderaConfiguracion) {
                System.out.println(banderaConfiguracion);
            } else {
                System.out.println(banderaConfiguracion);
            }
        }
        if (e.getSource()==ventana.panelDerecho.Btn_X1_Y2) {
            System.out.println("Cantilever");
        }
        if (e.getSource()==ventana.panelDerecho.Btn_X1_Y3) {
            System.out.println("Cantilever");
        }
        if (e.getSource()==ventana.panelDerecho.Btn_X1_Y4) {
            System.out.println("Cantilever");
        }
        
        //X2
        if (e.getSource()==ventana.panelDerecho.Btn_X2_Y1) {
            System.out.println("Cantilever");
        }
        if (e.getSource()==ventana.panelDerecho.Btn_X2_Y2) {
            System.out.println("Cantilever");
        }
        if (e.getSource()==ventana.panelDerecho.Btn_X2_Y3) {
            System.out.println("Cantilever");
        }
        if (e.getSource()==ventana.panelDerecho.Btn_X2_Y4) {
            System.out.println("Cantilever");
        }
        
        //X3
        if (e.getSource()==ventana.panelDerecho.Btn_X3_Y1) {
            System.out.println("Cantilever");
        }
        if (e.getSource()==ventana.panelDerecho.Btn_X3_Y2) {
            System.out.println("Cantilever");
        }
        if (e.getSource()==ventana.panelDerecho.Btn_X3_Y3) {
            System.out.println("Cantilever");
        }
        if (e.getSource()==ventana.panelDerecho.Btn_X3_Y4) {
            System.out.println("Cantilever");
        }
        
        //X4
        if (e.getSource()==ventana.panelDerecho.Btn_X4_Y1) {
            System.out.println("Cantilever");
        }
        if (e.getSource()==ventana.panelDerecho.Btn_X4_Y2) {
            System.out.println("Cantilever");
        }
        if (e.getSource()==ventana.panelDerecho.Btn_X4_Y3) {
            System.out.println("Cantilever");
        }
        if (e.getSource()==ventana.panelDerecho.Btn_X4_Y4) {
            System.out.println("Cantilever");
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
    private void oyentes(){
        //BOTONES CERRAR Y CONFIGURACION
        ventana.Img_Cerrar.addMouseListener(this);
        ventana.Img_Configuracion.addMouseListener(this);
        //X1
        ventana.panelDerecho.Btn_X1_Y1.addMouseListener(this);
        ventana.panelDerecho.Btn_X1_Y2.addMouseListener(this);
        ventana.panelDerecho.Btn_X1_Y3.addMouseListener(this);
        ventana.panelDerecho.Btn_X1_Y4.addMouseListener(this);
        //X2
        ventana.panelDerecho.Btn_X2_Y1.addMouseListener(this);
        ventana.panelDerecho.Btn_X2_Y2.addMouseListener(this);
        ventana.panelDerecho.Btn_X2_Y3.addMouseListener(this);
        ventana.panelDerecho.Btn_X2_Y4.addMouseListener(this);
        //X3
        ventana.panelDerecho.Btn_X3_Y1.addMouseListener(this);
        ventana.panelDerecho.Btn_X3_Y2.addMouseListener(this);
        ventana.panelDerecho.Btn_X3_Y3.addMouseListener(this);
        ventana.panelDerecho.Btn_X3_Y4.addMouseListener(this);
        //X4
        ventana.panelDerecho.Btn_X4_Y1.addMouseListener(this);
        ventana.panelDerecho.Btn_X4_Y2.addMouseListener(this);
        ventana.panelDerecho.Btn_X4_Y3.addMouseListener(this);
        ventana.panelDerecho.Btn_X4_Y4.addMouseListener(this);        
    }
    
    private void setearProducto(String NombreProducto){
        
    }
    
    
    
}
