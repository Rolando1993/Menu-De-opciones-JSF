/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.menu.beans;

import com.menu.entidades.Factorial;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author UNIVERSIDAD
 */
@ManagedBean
public class FactorialMB {

    private Factorial fac = new Factorial();
    private int resultado;
    
    public FactorialMB() {
        fac = new Factorial();
    }

    public Factorial getFac() {
        return fac;
    }

    public void setFac(Factorial fac) {
        this.fac = fac;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    
    public int factorial() {
        resultado = 1;
        for (int i = 1; i <= fac.getNumero(); i++) {
            resultado *= i;
        }
        return resultado;
    }
    
}
