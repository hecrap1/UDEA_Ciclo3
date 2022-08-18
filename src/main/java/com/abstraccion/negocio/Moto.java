package com.abstraccion.negocio;

public class Moto extends Vehiculo {

    public Moto(){
        super("Suzuki","Verde");
    }

    public Moto(String marca,String Color){
        super(marca,Color);
    }

    @Override
    public void Acelerar(){
        System.out.println("Metodo acelerar de la moto");
    }

    @Override
    public void Frenar() {
        //El cuerpo lo definimos como programadores.
    }

}
