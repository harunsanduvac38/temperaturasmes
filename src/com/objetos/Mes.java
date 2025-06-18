package com.objetos;


public class Mes {
    
    
    private String nombre;
    private int tempMax;
    private int tempMin;

    public void setNombre(String nombre) {
    this.nombre = nombre;
    }
    
    public String getNombre() {
        return this.nombre;
    }

    public void setTempMax(int tempMax) {
        this.tempMax = tempMax;
    }
    public int getTempMax() {
        return this.tempMax;
    }

    public void setTempMin(int tempMin) {
        this.tempMin = tempMin;
    }
    public int getTempMin(){
        return this.tempMin;
    }

    public double calcularMedia() {
    return (double)(this.tempMax + this.tempMin) / 2;   
    } 


    @Override
    public String toString() {
        return
        "El mes: " + this.nombre +  
        "\n   Max: " + this.tempMax +  "°C" +
        "\n   Min: " + this.tempMin + "°C" + 
        "\n   Avg: " + this.calcularMedia() + "°C \n";
    }

    
}
