package com.abstraccion.negocio;

public class Inicio {

    public static void main(String[] args) {
        //Vehiculo miVehiculo = new Vehiculo("Chevrolet","Azul");
        Carro miCarro = new Carro();
        Moto miMoto = new Moto();

        //miVehiculo.Acelerar();
        miCarro.Acelerar();
        miMoto.Acelerar();

    }

}
