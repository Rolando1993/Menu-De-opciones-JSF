/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.menu.beans;

import com.menu.entidades.NumeroPerfecto;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author UNIVERSIDAD
 */
@ManagedBean
@RequestScoped
public class PerfectoMB {

   private NumeroPerfecto perfecto = new NumeroPerfecto();
   private String resultado;
   
    public PerfectoMB() {
        perfecto = new NumeroPerfecto();
    }

    public NumeroPerfecto getPerfecto() {
        return perfecto;
    }

    public void setPerfecto(NumeroPerfecto perfecto) {
        this.perfecto = perfecto;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
    public void  numeroPerfecto() {
        int i, suma = 0;    
        for (i = 1; i < perfecto.getNumero(); i++) { 
            if (perfecto.getNumero() % i == 0) {
                suma +=  i;     
            }
        }
        if (suma == perfecto.getNumero()) { 
            resultado = "Es perfecto";
        } else {
            resultado = "No Es perfecto";
        }
    }
}
