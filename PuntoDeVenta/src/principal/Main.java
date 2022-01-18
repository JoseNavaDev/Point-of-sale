package principal;

import controlador.Controlador;
import modelo.FabricaBotones;
import vista.PanelDerecho;
import vista.PanelIzquierdo;
import vista.VentanaPrincipal;

public class Main {
    public static void main(String[] args) {        
        FabricaBotones modelo = new FabricaBotones();        
        PanelIzquierdo pI = new PanelIzquierdo();
        PanelDerecho pD = new PanelDerecho(modelo);        
        VentanaPrincipal vista = new VentanaPrincipal(pI,pD);
        Controlador controlador = new Controlador(vista);
    }
    
}
