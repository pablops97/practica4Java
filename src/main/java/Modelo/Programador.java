/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.GregorianCalendar;

/**
 *
 * @author ConoMaster
 */
public class Programador extends Empleado implements IFecha{
    
    private float sueldoExtraMensual;
    private String lenguajeFavorito;

    public Programador(float sueldoExtra, String lenguajeFavorito, int numero, String nombre, int sueldo, int sueldoMaximo, Fecha fechaAlta) throws ESaldoNoValido {
        super(numero, nombre, sueldo, sueldoMaximo, fechaAlta);
        this.sueldoExtraMensual = sueldoExtra;
        this.lenguajeFavorito = lenguajeFavorito;
    }

    public float getSueldoExtraMensual() {
        return sueldoExtraMensual;
    }

    public void setSueldoExtraMensual(float sueldoExtraMensual) {
        this.sueldoExtraMensual = sueldoExtraMensual;
    }

    public String getLenguajeFavorito() {
        return lenguajeFavorito;
    }

    public void setLenguajeFavorito(String lenguajeFavorito) {
        this.lenguajeFavorito = lenguajeFavorito;
    }
    
    public boolean cumpleMes(){
        return (dia() == this.getFechaAlta().getDia()) ? true : false;
    }

    @Override
    public String toString() {
        return super.toString() + "sueldoExtra=" + sueldoExtraMensual + ", lenguajeFavorito=" + lenguajeFavorito + '}';
    }
    

    @Override
    public int dia()
  {
    GregorianCalendar fechaActual = new GregorianCalendar();
    return fechaActual.get(DIA_DEL_MES);
  }
  public int mes()
  {
    GregorianCalendar fechaActual = new GregorianCalendar();
    return fechaActual.get(MES_DEL_ANIO)+1;
  }
  public int anio()
  {
    GregorianCalendar fechaActual = new GregorianCalendar();
    return fechaActual.get(ANIO);
  }
    
}
