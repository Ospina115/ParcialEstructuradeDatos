# ParcialEstructuradeDatos

## Main


```java
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

    // para llamar una funcion de otra clase
        Estudiante oEst = new Estudiante();    //instancia de la clase
        oEst.listar(vEst); //llamar la funcion enviandole el vector
```

## Logica
```java
public class Multas {
    
    String tipoVehiculo;
    float porcDto;

    public Multas(String tipoVehiculo, float porcDto) {
        this.tipoVehiculo = tipoVehiculo;
        this.porcDto = porcDto;
    }

    //multas carros
    public Comparendo[] calcular(String ciudad, Comparendo[] vCom){
        for (int i=0;i<vCom.length;i++){
            if(vCom[i].getTipoVehiculo().equals("C")&&
                    ciudad==vCom[i].getCiudad()){
                vCom[i].setValorDcto((vCom[i].getValorMulta()+vCom[i].getValorIntereses())*porcDto);
            }
        }
        return vCom;
    }
    
    //multas motos
    public Comparendo[] calcular(Comparendo[] vCom){
        for (int i=0;i<vCom.length;i++){
            if(vCom[i].getTipoVehiculo().equals("M")){
                vCom[i].setValorDcto((vCom[i].getValorIntereses())*porcDto);
            }
        }
        return vCom;
        
    }
    
    public void presentar(Comparendo[] vCom){
        for (int i=0;i<vCom.length;i++){
            
    }
}
```

## Objeto a recorrer

```java
public class Comparendo {
    
    String tipoID,placa,ciudad,tipoVehiculo;
    int id;
    double valorMulta, valorIntereses,valorDcto;

    public Comparendo(String tipoID, String placa, String ciudad, String tipoVehiculo, int id, double valorMulta, double valorIntereses, double valorDcto) {
        this.tipoID = tipoID;
        this.placa = placa;
        this.ciudad = ciudad;
        this.tipoVehiculo = tipoVehiculo;
        this.id = id;
        this.valorMulta = valorMulta;
        this.valorIntereses = valorIntereses;
        this.valorDcto = valorDcto;
    }

    //getters y setters
}
```