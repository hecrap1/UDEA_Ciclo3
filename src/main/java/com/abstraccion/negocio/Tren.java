package com.abstraccion.negocio;

public class Tren implements IVehiculo,IImpuesto {

    @Override
    public void Frenar() {

    }

    @Override
    public void Encender() {

    }

    @Override
    public String Detenerse(int Velocidad) {
        return null;
    }

    @Override
    public double CalculaImpuesto(int modelo) {
        return 0;
    }
}
