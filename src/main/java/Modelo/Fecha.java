/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;

/**
 *
 * @author ConoMaster
 */
public class Fecha implements Serializable{
    private int dia;
    private int mes;
    private int anio;

    
    public Fecha(){
        this.dia = (int) (Math.floor(Math.random() * (1-30+1)+30));
        this.mes = (int) (Math.floor(Math.random() * (1-12+1)+12));
        this.anio = (int) (Math.floor(Math.random() * (1900-2022+1)+2022));
    }
    
    
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    public Fecha(String fecha){
        if(fecha == null){
            this.dia = 0;
            this.mes = 0;
            this.anio = 0;
        }else{
            String[] fechaDescompuesta = fecha.split("/");
            System.out.println(fechaDescompuesta);
            this.dia = Integer.parseInt(fechaDescompuesta[0]);
            this.mes = Integer.parseInt(fechaDescompuesta[1]);
            this.anio = Integer.parseInt(fechaDescompuesta[2]);
        }
        
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + anio;
    }
    
    
}
