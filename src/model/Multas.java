
package model;

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
    
    
    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public float getPorcDto() {
        return porcDto;
    }

    public void setPorcDto(float porcDto) {
        this.porcDto = porcDto;
    }
    
    
    
}
