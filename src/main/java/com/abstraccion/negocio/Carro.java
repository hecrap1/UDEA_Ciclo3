package com.abstraccion.negocio;

public class Carro  extends Vehiculo{

    public Carro(){
        super("Nissan","Gris");
    }

    public void CantidadPuertas(String marca){
        //Hago algun proceso
    }

    public void CantidadPuertas(String marca,int modelo){
        //Hago algun proceso
    }

    @Override
    public void Acelerar(){
        super.Acelerar();
        System.out.println("Metodo acelerar del Carro");
    }

    @Override
    public void Frenar() {

    }


}
