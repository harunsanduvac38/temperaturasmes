package com.objetos;


public class Mes {
    
    
    private String nombre;
    private double tempMax;
    private double tempMin;

    
    public void setNombre(String nombre) {
    this.nombre = nombre;
    }
    
    public String getNombre() {
        return this.nombre;
    }

    public void setTempMax(double tempMax) {
        this.tempMax = tempMax;
    }
    public double getTempMax() {
        return this.tempMax;
    }

    public void setTempMin(double tempMin) {
        this.tempMin = tempMin;
    }
    public double getTempMin(){
        return this.tempMin;
    }

    public double calcularMedia() {
    return (double)Math.round(((this.tempMax + this.tempMin) / 2) * 100.0) / 100.0;   
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
