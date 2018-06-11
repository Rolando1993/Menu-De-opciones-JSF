/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.menu.beans;

import com.menu.entidades.MenorDeTres;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author UNIVERSIDAD
 */
@ManagedBean
public class MenorDeTresMB {

    private MenorDeTres menor3 = new MenorDeTres();
    private int resultado;

    public MenorDeTresMB() {
        menor3 = new MenorDeTres();
    }

    public MenorDeTres getMenor3() {
        return menor3;
    }

    public void setMenor3(MenorDeTres menor3) {
        this.menor3 = menor3;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public void numeroMenor3() {
        int n1 = menor3.getNumero1();
        int n2 = menor3.getNumero2();
        int n3 = menor3.getNumero3();
        if (n1 < n2 && n1 < n3) {
            resultado = n1;
        } else {
            if (n2 < n1 && n2 < n3) {
                resultado = n2;
            } else {
                resultado = n3;
            }
        }
    }

}
