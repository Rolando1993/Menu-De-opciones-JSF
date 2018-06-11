/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.menu.beans;

import com.menu.entidades.NumeroPrimo;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author UNIVERSIDAD
 */
@ManagedBean
@RequestScoped
public class PrimoMB {

    private NumeroPrimo primo = new NumeroPrimo();
    private String resultado;

    public PrimoMB() {
        primo = new NumeroPrimo();
    }

    public NumeroPrimo getPrimo() {
        return primo;
    }

    public void setPrimo(NumeroPrimo primo) {
        this.primo = primo;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public void numeroPrimo() {
        int i = 1, j = 0, z = 0;
        while (i <= primo.getNumero()) {
            j = primo.getNumero() % i;
            if (j == 0) {
                z += 1;
            }
            j += 1;
        }
        if (z == 2) {
            resultado = "Primo";
        } else {
            resultado = "No Primo";
        }
    }

}
