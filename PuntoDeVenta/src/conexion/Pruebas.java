package conexion;

import java.util.ArrayList;
import modelo.FabricaBotones;

public class Pruebas {
    
    public FabricaBotones seteoBotones;
    
    ArrayList<String> ListaDatosBotones = new ArrayList<>();
    
    public Pruebas(FabricaBotones seteoBotones){
        agregarDatos();
        setearBotones();
        this.seteoBotones = seteoBotones;
    }
    
    private void agregarDatos(){
        for (int i = 0; i < 20; i++) {
            ListaDatosBotones.add("Producto "+i);
        }
    }

    private void setearBotones() {
        seteoBotones.setStringBoton_X1Y1(ListaDatosBotones.get(0));
        seteoBotones.setStringBoton_X1Y2(ListaDatosBotones.get(1));
        seteoBotones.setStringBoton_X1Y3(ListaDatosBotones.get(2));
        seteoBotones.setStringBoton_X1Y4(ListaDatosBotones.get(3));
        
        seteoBotones.setStringBoton_X2Y1(ListaDatosBotones.get(4));
        seteoBotones.setStringBoton_X2Y2(ListaDatosBotones.get(5));
        seteoBotones.setStringBoton_X2Y3(ListaDatosBotones.get(6));
        seteoBotones.setStringBoton_X2Y4(ListaDatosBotones.get(7));
        
        seteoBotones.setStringBoton_X3Y1(ListaDatosBotones.get(8));
        seteoBotones.setStringBoton_X3Y2(ListaDatosBotones.get(9));
        seteoBotones.setStringBoton_X3Y3(ListaDatosBotones.get(10));
        seteoBotones.setStringBoton_X3Y4(ListaDatosBotones.get(11));
        
        seteoBotones.setStringBoton_X4Y1(ListaDatosBotones.get(12));
        seteoBotones.setStringBoton_X4Y2(ListaDatosBotones.get(13));
        seteoBotones.setStringBoton_X4Y3(ListaDatosBotones.get(14));
        seteoBotones.setStringBoton_X4Y4(ListaDatosBotones.get(15));
        
        seteoBotones.setStringBoton_X5Y1(ListaDatosBotones.get(16));
        seteoBotones.setStringBoton_X5Y2(ListaDatosBotones.get(17));
        seteoBotones.setStringBoton_X5Y3(ListaDatosBotones.get(18));
        seteoBotones.setStringBoton_X5Y4(ListaDatosBotones.get(19));        
    }
    
    
}
