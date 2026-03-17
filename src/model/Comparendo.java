
package model;

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

    public String getTipoID() {
        return tipoID;
    }

    public void setTipoID(String tipoID) {
        this.tipoID = tipoID;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(double valorMulta) {
        this.valorMulta = valorMulta;
    }

    public double getValorIntereses() {
        return valorIntereses;
    }

    public void setValorIntereses(double valorIntereses) {
        this.valorIntereses = valorIntereses;
    }

    public double getValorDcto() {
        return valorDcto;
    }

    public void setValorDcto(double valorDcto) {
        this.valorDcto = valorDcto;
    }

    
}
