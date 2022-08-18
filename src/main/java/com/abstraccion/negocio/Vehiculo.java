package com.abstraccion.negocio;

public abstract class Vehiculo {

    public  Vehiculo(String marca,String Color){
        this.Marca = marca;
        this.Color = Color;
    }

    //Declarar los atributos de la clase
    private String Marca;
    private String Color;


    public String getMarca(){
        return Marca;
    }

    public String getColor(){
        return Color;
    }

    public void setMarca(String marca){
        this.Marca = marca;
    }

    public void  setColor(String color){
        this.Color = color;
    }


    public void Acelerar(){
        System.out.println("Metodo acelerar de la clase padre");
    }

    //Metodo frenar es abstracto.
    public abstract void Frenar();

    public void Encender(){

    }

}
