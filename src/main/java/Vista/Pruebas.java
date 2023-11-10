/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Vista;

import Controlador.MyList;
import Modelo.ESaldoNoValido;
import Modelo.Fecha;
import Modelo.Programador;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ConoMaster
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyList prueba = new MyList();
        for(int i = 0; i <= 10; i++){
            int numero = (int) (Math.floor(Math.random() * (1000-2000+1)+2000));
            try {
                prueba.add(new Programador(0,null,numero,"Empleado "+ i,0,1,new Fecha(0,0,0)), numero);
            } catch (ESaldoNoValido ex) {
                Logger.getLogger(PanelBotones.class.getName()).log(Level.SEVERE, null, ex.getMessage());
            }
        }
        
        prueba.showMyList();
        System.out.println("");
        System.out.println("lista ordenada");
        boolean c = true;
        
           c = prueba.sort(); 
        
        
        prueba.showMyList();
    }
    
}
