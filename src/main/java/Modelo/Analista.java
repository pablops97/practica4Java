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
public class Analista extends Empleado implements IFecha{
    
    private float plusAnual;
    private int horasTrabajadas;

    public Analista(float plusAnual, int horasTrabajadas, int numero, String nombre, int sueldo, int sueldoMaximo, Fecha fechaAlta) throws ESaldoNoValido {
        super(numero, nombre, sueldo, sueldoMaximo, fechaAlta);
        this.plusAnual = plusAnual;
        this.horasTrabajadas = horasTrabajadas;
    }
 
    public boolean cumpleAnios(){
        return (dia() == this.getFechaAlta().getDia() && mes() == this.getFechaAlta().getMes()) ? true : false;
    }
    

    public float getPlusAnual() {
        return plusAnual;
    }

    public void setPlusAnual(float plusAnual) {
        this.plusAnual = plusAnual;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

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

    @Override
    public String toString() {
        return super.toString() + "ES ANALISTA"+  "plusAnual=" + plusAnual + ", horasTrabajadas=" + horasTrabajadas + '}';
    }
    
    
    
}
