package principal;

import vista.PanelDerecho;
import vista.PanelIzquierdo;
import vista.VentanaPrincipal;

public class Main {
    public static void main(String[] args) {
        PanelIzquierdo pI = new PanelIzquierdo();
        PanelDerecho pD = new PanelDerecho();
        VentanaPrincipal v = new VentanaPrincipal(pI,pD);
    }
    
}
