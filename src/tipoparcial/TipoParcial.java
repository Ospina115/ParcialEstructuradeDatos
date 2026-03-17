
package tipoparcial;

import javax.swing.JOptionPane;
import model.Comparendo;

public class TipoParcial {
 
    public static void main(String[] args) {
        Comparendo[] vCom = new Comparendo[6];
        //tipoID, placa, ciudad, String tipoVehiculo, int id, double valorMulta, double valorIntereses, double valorDcto
        vCom[0] = new Comparendo("C","ABC123","B","C",123,10000,1500,0);
        vCom[1] = new Comparendo("C","DEF123","G","C",456,15000,2000,0);
        vCom[2] = new Comparendo("P","AB1234","B","M",789,20000,2500,0);
        vCom[3] = new Comparendo("N","ZX4567","F","M",145,30000,3000,0);
        vCom[4] = new Comparendo("C","XYZ123","F","C",234,70000,7500,0);
        vCom[5] = new Comparendo("P","WX5678","G","M",901,45000,3800,0);
        
        String tipoVehiculo,ciudad;
        float porcDto;
        
        boolean continuar=true;
        while (continuar){
            tipoVehiculo=JOptionPane.showInputDialog("Ingrese Moto o Carro (M-C)?").toUpperCase();
            if (tipoVehiculo.equals("C")){
               ciudad=JOptionPane.showInputDialog("Ingrese Ciudad (B-F-G-P)?").toUpperCase();  
            }
            porcDto=Float.parseFloat(JOptionPane.showInputDialog("Porcentaje Dcto?"));
            
            
        }
        
        
    }
    
}
