/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;

/**
 *
 * if(saldo > saldoMaximo) ahi lanzar un throw new Mi Excepcion("saldo superado")
 */
public class Empleado implements Serializable, java.lang.Comparable{
    private int numero;
    private transient String nombre;
    private float sueldo;
    private float sueldoMaximo;
    private Fecha fechaAlta;

    public Empleado(int numero, String nombre, int sueldo, int sueldoMaximo, Fecha fechaAlta) throws ESaldoNoValido{
        
        if(sueldo > sueldoMaximo){ 
            throw new ESaldoNoValido("El sueldo no puede ser superior al sueldo maximo");
        }else
        {
            this.numero = numero;
            this.nombre = nombre;
            this.sueldo = sueldo;
            this.sueldoMaximo = sueldoMaximo;
            this.fechaAlta = fechaAlta;
        }
        
    }     
        

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) throws ESaldoNoValido {
        this.sueldo = sueldo;
        if(this.sueldo > this.sueldoMaximo) 
            throw new ESaldoNoValido("El saldo no puede ser superior al sueldo maximo");
    }

    public float getSueldoMaximo() {
        return sueldoMaximo;
    }

    public void setSueldoMaximo(float sueldoMaximo) throws ESaldoNoValido {
        this.sueldoMaximo = sueldoMaximo;
        if(this.sueldoMaximo < this.sueldo)
            throw new ESaldoNoValido("El saldo maximo no puede ser inferior al saldo minimo");
    }

    public Fecha getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Fecha fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    @Override
    public String toString() {
        return "Empleado{" + "numero=" + numero + ", nombre=" + nombre + ", sueldo=" + sueldo + ", sueldoMaximo=" + sueldoMaximo + ", fechaAlta=" + fechaAlta + '}';
    }

    @Override
    public int compareTo(Object o) {
        Empleado aux = (Empleado)o;
        if(this.getNumero() > aux.getNumero()){
            return 1;
        }else if(this.getNumero() == aux.getNumero()){
            return 0;
        }else{
            return -1;
        }
    }
   
    

    


}
